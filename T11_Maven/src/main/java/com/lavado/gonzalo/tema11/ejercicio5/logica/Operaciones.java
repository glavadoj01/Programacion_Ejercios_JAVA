package com.lavado.gonzalo.tema11.ejercicio5.logica;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.stream.Stream;

public class Operaciones {

    /**
     * Genera un PDF con el nombre y rango de precios especificados.
     *
     * @param nombreArchivo Nombre del archivo PDF a generar (sin extensión).
     * @param precioMinimo  Precio mínimo para filtrar productos.
     * @param precioMaximo  Precio máximo para filtrar productos.
     * @return true si el PDF se generó correctamente, false en caso contrario.
     */
    public static boolean generarPDF(String nombreArchivo, float precioMinimo, float precioMaximo) {
        // Validaciones de nombre de archivo
        if (nombreArchivo == null || nombreArchivo.isEmpty()) {
            System.out.println("Error: El nombre del archivo no puede estar vacío.");
            return false; // Nombre de archivo inválido
        }
        // Validaciones de precios
        if (precioMinimo < 0 || precioMaximo < 0) {
            System.out.println("Error: Los precios no pueden ser negativos.");
            return false; // Rango de precios inválido
        }

        Path directorio = Path.of("src/main/java/com/lavado/gonzalo/tema11/ejercicio5/resultados");
        if (!Files.exists(directorio)) {
            directorio.toFile().mkdirs();
        }

        Document document = new Document();
        try  {
            PdfWriter.getInstance(document,new FileOutputStream(directorio.resolve(nombreArchivo + ".pdf").toFile()));
            document.open();

            PdfPTable table = new PdfPTable(4);
            table.setWidthPercentage(90);
            addTableHeader(table, precioMinimo, precioMaximo);
            ConexionBD.addConsulta(table, precioMinimo, precioMaximo);
            document.add(table);

        } catch (FileNotFoundException e) {
            System.out.println("Error al crear el documento PDF: " + e.getMessage());
            return false; // Error al crear el documento
        } catch (DocumentException e) {
            System.out.println("Error al inicializar el PDF: " + e.getMessage());
            return false; // Error al inicializar el PDF
        } catch (SQLException e) {
            System.out.println("Error al consultar la base de datos: " + e.getMessage());
            return false; // Error al consultar la base de datos
        } finally {
            if (document.isOpen()) {
                document.close(); // Aseguramos que el documento se cierre
            }
        }

        return true;
    }

    private static void addTableHeader(PdfPTable table, float precioMinimo, float precioMaximo) {
        Stream.of("Listado de productos con precio entre " + precioMinimo + " y " + precioMaximo, "Fecha: " + LocalDate.now())
                .forEach(row -> {
                    PdfPCell cell = new PdfPCell();
                    cell.setColspan(4);
                    cell.setBorderWidth(1);
                    cell.setPhrase(new Phrase(row));
                    table.addCell(cell);
                }
        );
        for (int i = 1; i <= 3; i++) {
            PdfPCell cell = new PdfPCell();
            cell.setColspan(4);
            cell.setBorder(0);
            cell.setPhrase(new Phrase(" "));
            table.addCell(cell);
        }

        Stream.of("Nº de Producto", "Nombre de Producto", "Proveedor", "Precio de Venta")
                .forEach(columnTitle -> {
                    PdfPCell header = new PdfPCell(new Phrase(columnTitle));
                    header.setBorderWidth(1);
                    table.addCell(header);
                }
        );
    }
}
