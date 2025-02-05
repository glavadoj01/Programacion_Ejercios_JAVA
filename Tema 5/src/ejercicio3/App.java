package ejercicio3;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GestionAlquileres gestion = new GestionAlquileres();
		
		Cliente cliente = gestion.getClienteAlquiler("3331200-BMC");
		System.out.println(cliente);
		
		int c = gestion.contarAlquileresCliente(5000);
		System.out.println(c);
		
		double sumaI = gestion.sumaImporteTodosAlquileres();
		System.out.println(sumaI);

		gestion.mostrarAlquileresMatricula("1200-BMC");
		
	}
}
