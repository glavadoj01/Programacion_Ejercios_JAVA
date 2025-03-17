package ejercicio8;

import java.util.List;
import java.util.Scanner;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Adaptado de Arrays a List por Alumno/Author

		Scanner entrada =new Scanner(System.in);

		ColeccionProductos c = new ColeccionProductos(10);

		for (Producto producto : c.listaP) {
			System.out.println(producto);
		}

		//probar Tª congelación
		System.out.println("Introduce id: ");
		String id = entrada.nextLine();
		System.out.println("Introduce Tª congelación: ");
		double temp = entrada.nextDouble();
		entrada.nextLine();
		System.out.println(c.modificarTemperaturaCongelacion(id, temp));

		for (Producto producto : c.listaP) {
			System.out.println(producto);
		}

		System.out.println("Introduce pais: ");
		String pais = entrada.nextLine();
		List<Fresco> frescosBusqueda = c.consultarProductosPorPaisOrigen(pais);
		for (Fresco fresco : frescosBusqueda) {
			System.out.println(fresco);
		}


		System.out.println("*************CADUCADOS****************");
		for (Producto producto : c.consultarProductosCaducados()) {
			System.out.println(producto.toString());
		}

		System.out.println("***********************************");
		for (Producto producto : c.obtenerProductosDelTipo("F")) {
			System.out.println(producto.toString());
		}
		
		
		

		String[] opciones = { "Menú", "1. Modif. Tª congelación", "2. Productos por país", "3. Productos Caducados",
				"4. Productos por tipo", "5. Salir", "Elige opción: " };

		Menu menu = new Menu(opciones);
		String opcion = "";
		boolean retorno;
		do {
			opcion = menu.mostrarMenu();
			switch (opcion) {
			case "1":

				for (Producto producto : c.obtenerProductosDelTipo("Congelado")) {
					System.out.println(producto);
				}
				System.out.println("ID? ");
				id = entrada.nextLine();
				System.out.println("Tª? ");
				temp = entrada.nextDouble();
				retorno = c.modificarTemperaturaCongelacion(id, temp);
				if (retorno)
					System.out.println("Tª modificada");
				else
					System.out.println("Producto no encontrado o no es congelado");
				break;

			case "2":
				System.out.println("País? ");
				pais = entrada.nextLine();
				List<Fresco> a = c.consultarProductosPorPaisOrigen(pais);
				System.out.println("Productos del país: " + pais);
				for (Fresco fresco : a) {
					System.out.println(fresco);
				}
				break;

			case "3":
				System.out.println("Productos caducados");
				List<Producto> caducados = c.consultarProductosCaducados();
				for (Producto producto : caducados) {
					System.out.println(producto);
				}
				break;
			case "4":
				System.out.println("Tipo producto? ");
				String tipo = entrada.next();
				List<Producto> productosTipo = c.obtenerProductosDelTipo(tipo);
				for (Producto producto : productosTipo) {
					System.out.println(producto);
				}
				break;
			case "5":
				System.out.println("Fin");
				break;
			default:
				System.out.println("Error en la opción");
			}
		} while (!opcion.equals("5"));

		entrada.close();
	}

}
