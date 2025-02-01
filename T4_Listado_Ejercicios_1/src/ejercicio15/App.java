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

import java.util.Scanner;

public class App {
	static Scanner escanear = new Scanner(System.in);
	static GestionCiudades listaCiudades = new GestionCiudades();

	public static void main(String[] args) {
		Ciudad ciudadSalida;
		boolean continuar = true;
		char op;

		while (continuar) {
			op = menu();
			switch (op) {
				case 'A':
					ciudadSalida = buscarCiudad();
					if (ciudadSalida == null) {
						System.out.println("No se encontró ninguna ciudad con ese Id");
					} else {
						System.out.println(ciudadSalida);
					}
					break;
				case 'B':
					masPoblada();
					break;
				case 'C':
					ciudadesPais();
					break;
				case 'D':
					comparatoR();
					break;
				case 'E':
					variasCiudades();
					break;
				case 'F':
					variosPaises();
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

	private static Ciudad buscarCiudad() {
		System.out.print("Ingrese un Id para buscar la ciudad asociada: ");
		String id = escanear.nextLine();

		return listaCiudades.buscarCiudadPorId(id);
	}

	private static void masPoblada() {
		System.out.println(listaCiudades.buscarCiudadMasPoblada());
	}

	private static void ciudadesPais() {
		System.out.print("Ingrese un pais para buscar sus ciudades: ");
		String pais = escanear.nextLine();

		listaCiudades.mostrarCiudadesDelPais(pais);
	}

	private static void comparatoR() {
		Ciudad ciudad1 = buscarCiudad();
		if (ciudad1 == null) {
			System.out.println("No se encontró la primera ciudad");
		} else { // Sí no encuentra Ciudad1 no continua
			Ciudad ciudad2 = buscarCiudad();
			if (ciudad2 == null) {
				System.out.println("No se encontró la segunda ciudad");
			} else { // Sí no encuentra Ciudad2 no continua

				if (GestionCiudades.compararCiudades(ciudad1, ciudad2)) {
					System.out.println("Las ciudades " + ciudad1.getNombre() +
							" y " + ciudad2.getNombre() + ", son la misma ciudad");
				} else {
					System.out.println("Las ciudades " + ciudad1.getNombre() +
							" y " + ciudad2.getNombre() + ", NO son la misma ciudad");
				}
			}
		}
	}

	private static void variasCiudades() {
		String id;
		String[] ids;

		System.out.print("Ingrese varios Id's separados por \",\" para buscar una ciudad: ");
		id = escanear.nextLine();
		ids = id.split(",");

		listaCiudades.mostrarVariasCiudades(ids);
	}

	private static void variosPaises() {
		String nombre;
		String[] nombres;

		System.out.print("Ingrese varios nombres de países separados por \",\" para buscar sus ciudades: ");
		nombre = escanear.nextLine();
		nombres = nombre.split(",");

		listaCiudades.mostrarCiudadesPaises(nombres);
	}

	private static char menu() {
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
			op = escanear.nextLine().charAt(0);
			if ((op >= 'A' && op <= 'G') || op == 'S' ) {
				return op;
			} else if ((op >= 'a' && op <= 'g') || op == 's' ) {
				return (char) (op-32);
			}
			System.out.println("Opción no valida");
		}
	}
}