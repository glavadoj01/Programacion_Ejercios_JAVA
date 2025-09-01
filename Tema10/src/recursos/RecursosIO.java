package recursos;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Objects;

public class RecursosIO {
    public static void mostrarDirectorio(String directorio) {
        Path ruta = Paths.get(directorio);
        if (!Files.isDirectory(ruta)) {
            System.out.println("El directorío no existe.");

        } else {
            System.out.println("Contenido de la carpeta: " + ruta);
            System.out.println();
            for (File s : Objects.requireNonNull(ruta.toFile().listFiles())) {
                if (s.isDirectory()) {
                    System.out.println("Directorio: " + s);
                } else {
                    System.out.println("Archivo: " + s);
                }
            }
        }
    }

    public static void mostrarDirectorioConProf(String directorio, int prof) throws IOException {
        Path ruta = Paths.get(directorio);
        if (!Files.isDirectory(ruta)) {
            System.out.println("El directorío no existe.");

        } else {
            System.out.println("Contenido de la carpeta: " + ruta);
            System.out.println();
            try {
                for (Path p : Files.walk(ruta, prof).toList()) {
                    if (p.toFile().isDirectory()) {
                        System.out.println("Directorio: " + p);
                    } else {
                        System.out.println("Archivo: " + p + '\t' + Files.size(p) + " bytes");
                    }
                }
            } catch (IOException e) {
                throw new IOException(e);
            }
        }
    }

    public static void mostrarArchivosSize(String directorio) throws IOException {
        mostrarArchivosSize(directorio, 1);
    }

    public static void mostrarArchivosSize(String directorio, int prof) throws IOException {
        Path ruta = Paths.get(directorio);
        if (!Files.isDirectory(ruta)) {
            System.out.println("El directorío no existe.");

        } else {
            System.out.println("Contenido de la carpeta: " + ruta);
            System.out.println();
            try {
                for (Path p : Files.walk(ruta, prof).toList()) {
                    if (p.toFile().isFile()) {
                        System.out.println("Archivo: " + p + '\t' + Files.size(p) + " bytes");
                    }
                }
            } catch (IOException e) {
                throw new IOException(e);
            }
        }
    }

    public static boolean copiarArchivosFORCED(Path Aorigen, Path Adestino) throws IOException {
        if (!Files.exists(Aorigen)) {
            throw new IOException("El archivo origen no existe");
        }

        try {
            Files.copy(Aorigen, Adestino, StandardCopyOption.REPLACE_EXISTING);
            return true;

        } catch (AccessDeniedException d) {
            throw new AccessDeniedException("No se puede copiar en el directorio destino");
        } catch (IOException e) {
            throw new IOException(e);
        }
    }

    public static boolean copiarDirectorioFORCED(Path DirOrigen, Path DirDestino) throws IOException {
        if (!Files.isDirectory(DirOrigen)) {
            throw new IOException("El directorio origen no existe");
        }
        if (!Files.isDirectory(DirDestino)) {
            throw new IOException("El directorio destino no existe");
        }
        try {
            for (Path p : Files.walk(DirOrigen, 1).toList()) {
                if (!copiarArchivosFORCED(p, DirDestino)) {
                    return false;
                }
            }
            return true;
        } catch (AccessDeniedException d) {
            throw new AccessDeniedException(d.getMessage());
        } catch (IOException e) {
            throw new IOException(e);
        }
    }

    public static boolean fusionarArchivos(Path dirOrigen, String exten, String archDestino) throws IOException {
        if (!Files.isDirectory(dirOrigen)) {
            throw new IOException("El directorio origen no existe");
        }

        FilenameFilter filtro = (dir, name) -> name.endsWith(exten);

        ArrayList<String> datos = new ArrayList<>();

        try {
            for (String file : Objects.requireNonNull(dirOrigen.toFile().list(filtro))) {
                datos.addAll(leerArchivo(Paths.get(dirOrigen + "/" + file)));
            }
            return escribirDatos(dirOrigen.toString(),archDestino,datos);
        } catch (IOException e) {
            throw new IOException(e);
        }
    }

    public static ArrayList<String> leerArchivo(Path ruta) throws IOException {
        if (!Files.exists(ruta)) {
            throw new IOException("El archivo no existe");
        }
        ArrayList<String> resultado = new ArrayList<>();
        String linea;


        try (BufferedReader br = new BufferedReader(new FileReader(ruta.toFile()))) {
            while ((linea=br.readLine()) != null ) {
                resultado.add(linea);
            }

            return resultado;
        } catch (IOException e) {
            throw new IOException("Error en lectura el archivo");
        }
    }

    public static boolean escribirDatos(String directorio, String fichero, ArrayList<String> datos) throws IOException {
        if (!Files.exists(Paths.get(directorio))) {
            throw new IOException("El directorio no existe");
        }

        Path ruta = Paths.get(directorio, fichero);
        try (BufferedWriter br = Files.newBufferedWriter(ruta)) {
            for (String s : datos) {
                br.write(s);
                br.newLine();
            }
            return true;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new IOException("Error al escribir el fichero '" + fichero + "'");
        }
    }

}
