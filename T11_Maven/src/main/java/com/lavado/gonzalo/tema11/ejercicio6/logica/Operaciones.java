package com.lavado.gonzalo.tema11.ejercicio6.logica;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.file.Path;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.stream.Stream;

public class Operaciones {

    /**
     * Genera un PDF con el nombre y rango de precios especificados.
     *
     * @param poblacion Nombre de la población para la que se generará el PDF.
     * @return true si el PDF se generó correctamente, false en caso contrario.
     */
    public static boolean generarPDF(String poblacion) {
        // Validaciones de nombre de archivo
        if (poblacion == null || poblacion.isEmpty()) {
            System.out.println("Error: El nombre de la población no puede estar vacío.");
            return false;
        }

        Path directorio = Path.of("src/main/java/com/lavado/gonzalo/tema11/ejercicio6/resultados");
        if (!directorio.toFile().exists()) {
            directorio.toFile().mkdir();
        }

        Document document = new Document();
        try  {
            PdfWriter.getInstance(document,
                    new FileOutputStream(directorio.resolve("ClientesDe"+ poblacion.toUpperCase() + ".pdf")
                            .toFile()
                    )
            );
            document.open();

            PdfPTable table = new PdfPTable(5);
            table.setWidthPercentage(95);

            addTableHeader(table, poblacion);
            ConexionBD.addConsulta(table, poblacion);
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


    /**
     * Agrega el encabezado de la tabla al PDF.
     *
     * @param table Tabla a la que se le agregará el encabezado.
     * @param poblacion Nombre de la población para el encabezado.
     */
    private static void addTableHeader(PdfPTable table, String poblacion) {
        Stream.of("Listado de clientes para la localidad: " + poblacion, "Fecha: " + LocalDate.now())
                .forEach(row -> {
                    PdfPCell cell = new PdfPCell();
                    cell.setColspan(table.getNumberOfColumns());
                    cell.setBorderWidth(1);
                    cell.setPhrase(new Phrase(row));
                    table.addCell(cell);
                }
        );
        // Añadimos dos filas vacías para separar presentación de contenido
        for (int i = 1; i <= 2; i++) {
            PdfPCell cell = new PdfPCell();
            cell.setColspan(table.getNumberOfColumns());
            cell.setBorder(0);
            cell.setPhrase(new Phrase(" "));
            table.addCell(cell);
        }

        Stream.of("Nº de cliente", "Nombre", "Teléfono", "Ciudad", "País")
                .forEach(columnTitle -> {
                    PdfPCell header = new PdfPCell(new Phrase(columnTitle));
                    header.setBorderWidth(1);
                    table.addCell(header);
                }
        );
    }
}
