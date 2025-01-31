package ejercicio15;

/*
a. buscarCiudadPorId. Recibe una Id y retorna la ciudad con esa Id o null si no existe.
b. buscarCiudadMasPoblada. Retorna la ciudad más poblada.
c. mostrarCiudadesDelPais. Recibe un país como argumento e imprime las ciudades de ese país.
d. comparaCiudades. Metodo estático que recibe dos objetos ciudad (Ciudad) como parámetro y retorna true o
                       false si son iguales o no. Dos ciudades son iguales si tienen el mismo id y nombre.
e. mostrarVariasCiudades. Recibe varios Ids como argumentos y muestra
							las ciudades (toString) asociadas a esas ids. (varagrs)
f. mostrarCiudadesPaises. Recibe varios códigos de país como argumentos y muestra
							las ciudades (toString) pertenecientes a esos países.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class App {
	static Scanner escanear = new Scanner(System.in);

	public static void main(String[] args) {
		GestionCiudades listaCiudades = new GestionCiudades();
		ArrayList<Ciudad> ciudadesSalida;
		Ciudad ciudadSalida;
		boolean continuar = true;
		char op;

		while (continuar) {
			op = menu();
			switch (op) {
				case 'A':
					break;
				case 'B':
					break;
				case 'C':
					break;
				case 'D':
					break;
				case 'E':
					break;
				case 'F':
					break;
				case 'G':
					listaCiudades.mostrarTodos();
					break;
				default:
					continuar = false;
			}
		}
		escanear.close();
	}

	public static char menu() {
		char op;
		while (true) {
			System.out.print("""
                    \n\t\tMENÚ
                    A - Mostrar Ciudad por Id
                    B - Mostrar Ciudad más poblada
                    C - Mostrar Ciudades de un Pais
                    D - Comparar Ciudades
                    E - Mostrar varias Ciudades por Id
                    F - Mostrar varias Ciudades por Id de Pais
                    G - Mostrar Todos
                    S - Salir
                    Seleccionar una opción:\s""");
			op = escanear.next().charAt(0);
			System.out.println();
			if ((op >= 'A' && op <= 'G') || op == 'S' ) {
				return op;
			} else if ((op >= 'a' && op <= 'g') || op == 's' ) {
				return (char) (op-32);
			}
			System.out.println("Opción no valida");
		}
	}
}
