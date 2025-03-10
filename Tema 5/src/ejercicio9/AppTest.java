package ejercicio9;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AppTest {
    static Scanner escanear = new Scanner(System.in);

    public static void main(String[] args) {
        Random rand = new Random();
        List<Persona> listaPersonas = new ArrayList<Persona>();
        int id;
        String nombre;
        char op1, op2;
        boolean continuar = true;

        Cola colaGenerica = new Cola(10);
        Pila pilaGenerica = new Pila(10);

        // Creamos 100 personas
        for (int i = 1; i <= 100; i++) {
            id = 123000 + i;
            nombre = "Nombre" + i;
            listaPersonas.add(new Persona(id, nombre));
        }

        // Creamos unas colas y pilas con habitantes iniciales
        for (int i = 0; i < rand.nextInt(3, 7); i++) {
            colaGenerica.insertar(listaPersonas.get(rand.nextInt(listaPersonas.size())));
            pilaGenerica.insertar(listaPersonas.get(rand.nextInt(listaPersonas.size())));
        }


        while (continuar) {
            op1 = menu(); // Cola o Pila
            if (op1 == 'S') {
                break;
            }
            op2 = menu2(); // Opciones
            switch (op2) {
                case 'A':
                    if (op1 == 'C') {
                        System.out.println(colaGenerica.esVacia());
                    } else {
                        System.out.println(pilaGenerica.esVacia());
                    }
                    break;
                case 'B':
                    if (op1 == 'C') {
                        System.out.println("En la cola, el primero en salir es el primero de la cola => primero = getFirst()");
                        System.out.println(colaGenerica.primero());
                    } else {
                        System.out.println("En la pila, el primero en salir es el último en la pila => primero = getLast()");
                        System.out.println(colaGenerica.primero());
                    }
                    break;
                case 'C':
                    if (op1 == 'C') {
                        if (colaGenerica.extraer()) {
                            System.out.println("Extracción correcta");
                        } else {
                            System.out.println("Extracción incorrecta");
                        }
                    } else {
                        if (pilaGenerica.extraer()) {
                            System.out.println("Extracción correcta");
                        } else {
                            System.out.println("Extracción incorrecta");
                        }
                    }
                    break;
                case 'D':
                    if (op1 == 'C') {
                        if (colaGenerica.insertar(listaPersonas.get(rand.nextInt(listaPersonas.size())))) {
                            System.out.println("Persona añadida");
                        } else {
                            System.out.println("La cola esta llena");
                        }
                    } else {
                        if (pilaGenerica.insertar(listaPersonas.get(rand.nextInt(listaPersonas.size())))) {
                            System.out.println("Persona añadida");
                        } else {
                            System.out.println("La pila esta llena");
                        }
                    }
                    break;
                case 'E':
                    if (op1 == 'C') {
                        colaGenerica.mostrar();
                    } else {
                        pilaGenerica.mostrar();
                    }
                    break;
                default:
                    continuar = false;
            }
        }
    }

    public static char menu() {
        char opcion;
        while (true) {
            System.out.print("""
                    \nSeleccionar Cola (C) o Pila (P) 
                    Salir (S)
                    Seleccionar una opción:\s""");
            opcion = escanear.next().toUpperCase().charAt(0);
            escanear.nextLine();
            System.out.println();
            if (opcion == 'C' || opcion == 'P' || opcion == 'S') {
                return opcion;
            }
            System.out.println("ERROR - Ingrese una opción valida");
        }
    }
    public static char menu2() {
        char opcion;
        while (true) {
            System.out.print("""
                    \n\t\tMENÚ
                    A - ¿Esta vacía?
                    B - ¿Quien sale primero?
                    C - Sacar primero
                    D - Insertar persona
                    E - Mostrar todos
                    S - Salir
                    Seleccionar una opción:\s""");
            opcion = escanear.next().toUpperCase().charAt(0);
            escanear.nextLine();
            System.out.println();
            if ((opcion >= 'A' && opcion <= 'E') || opcion == 'S') {
                return opcion;
            }
            System.out.println("ERROR - Ingrese una opción valida");
        }
    }
}
