package ejercicio7;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class GestionAlumnos {
    private ArrayList<Alumno> listaAlumnos;

    public ArrayList<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public GestionAlumnos(String ruta, String fichero) {
        try {
            this.listaAlumnos = cargarDatos(ruta, fichero);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<Alumno> cargarDatos(String ruta, String fichero) throws IOException {
        Path buscar = Paths.get(ruta, fichero);
        if (!Files.exists(buscar)) {
            throw new IOException("Archivo (" + fichero + ") no encontrado en ruta: " + ruta);
        }
        ArrayList<Alumno> alumnosSalida = new ArrayList<>();
        String linea;
        String[] datos;
        double[] notas = new double[10];

        try (BufferedReader br = Files.newBufferedReader(buscar)) {
            while ((linea = br.readLine()) != null) {
                datos = linea.split(";");
                for (int i = 0; i < 10; i++) {
                    notas[i] = Double.parseDouble(datos[i + 2]);
                }
                alumnosSalida.add(new Alumno(Integer.parseInt(datos[0]), datos[1], notas));
            }
            br.close();
            return alumnosSalida;

        } catch (IOException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public double[] obtenerNotasAlumno(int id) {
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getId() == id) {
                return alumno.getNotas();
            }
        }
        return null;
    }

    public double obtenerMediaAlumno(int id) throws NullPointerException {
        double notaM = 0;
        try {
            for (double nota : obtenerNotasAlumno(id)) {
                notaM += nota;
            }
            return notaM / obtenerNotasAlumno(id).length;

        } catch (NullPointerException e) {
            throw new NullPointerException("El alumno no existe");
        }
    }

    public double obtenerMejorNota(int id) throws NullPointerException {
        double notaMax = 0;
        try {
            for (double nota : obtenerNotasAlumno(id)) {
                if (nota > notaMax) {
                    notaMax = nota;
                }
            }
            return notaMax;

        } catch (NullPointerException e) {
            throw new NullPointerException("El alumno no existe");
        }
    }

    public void mostrarListaAlumnos() {
        DecimalFormat df = new DecimalFormat("#.00");
        String id;
        String nombre;

        System.out.println("Alumnos:" +
                "Id\t\t\tNombre\t\t\t\t\t\tNota Media");
        for (Alumno alumno : listaAlumnos) {
            id = String.valueOf(alumno.getId());
            nombre = alumno.getNombre();

            if (id.length() < 8) {
                System.out.print("\n" + id + "\t\t" + nombre);
            } else {
                System.out.print("\n" + id + "\t" + nombre);
            }

            if (nombre.length() > 36) {
                System.out.print("\t");
            } else if (nombre.length() > 31) {
                System.out.print("\t\t");
            } else if (nombre.length() > 26) {
                System.out.print("\t\t\t");
            } else if (nombre.length() > 21) {
                System.out.print("\t\t\t\t");
            } else if (nombre.length() > 16) {
                System.out.print("\t\t\t\t\t");
            } else if (nombre.length() > 11) {
                System.out.print("\t\t\t\t\t\t");
            } else if (nombre.length() > 6) {
                System.out.print("\t\t\t\t\t\t\t");
            } else {
                System.out.print("\t\t\t\t\t\t\t\t");
            }
            System.out.print(df.format(obtenerMediaAlumno(alumno.getId())));
        }
    }
}
