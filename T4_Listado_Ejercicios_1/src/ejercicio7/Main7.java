package ejercicio7;

/*
Diseña un programa Java que trabaje con la clase DvdCine creada en el ejercicio anterior.
Crea una clase (GestionDvd) que incluya como atributo un array de objetos pertenecientes
a la clase DvdCine y como métodos las opciones del menú. El menú de la aplicación sería:
Menú de opciones:
        1. Mostrar la lista de películas (Título y productora)
        2. Mostrar la película de más duración (Título y minutos)
        3. Pedir un género y mostrar el título de las pelis de ese género.
        4. Duración de la peli. Pedir título y mostrar su duración.
*/

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        GestionDvd pelis = new GestionDvd();
        boolean salir = false;
        int op;

        do {
            menu();
            op = escanear.nextInt();
            switch (op) {
                case 1:
                    pelis.mostrarLista();
                    break;
                case 2:
                    pelis.mostrarMasLarga();
                    break;
                case 3:
                    System.out.print("Ingrese un género: ");
                    String generoBuscar = escanear.next();
                    pelis.mostrarListaGenero(generoBuscar);
                    break;
                case 4:
                    escanear.nextLine();
                    System.out.print("Ingrese un titulo para ver la duración: ");
                    String titulo = escanear.nextLine();
                    int dur = pelis.mostrarDuracion(titulo);
                    if (dur == 0){
                        System.out.println("No se encontró el titulo: \"" + titulo +"\"");
                    } else {
                        System.out.println("La duración de la pelicula \"" + titulo +
                                "\" es: " + dur + " minutos");
                    }
                        break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Error - Seleccionar una opción valida");
            }
        } while (!salir);
        escanear.close();
    }

    private static void menu() {
        System.out.println("""
                \n1. Mostrar la lista de películas (Título y productora)
                2. Mostrar la película de más duración (Título y minutos)
                3. Pedir un género y mostrar el título de las pelis de ese género.
                4. Duración de la peli. Pedir título y mostrar su duración.
                5. SALIR""");
        System.out.print("Ingrese una opción: ");
    }


}
