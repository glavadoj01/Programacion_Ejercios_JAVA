package ejercicio14;

/*
a. buscarEmpleadoPorId. Recibe un id de empleado y retorna el empleado con esa id o null si no lo encuentra.
b. empleadosCorreo. Muestra todos los empleados cuyo correo electrónico contenga una cadena pasada como parámetro.
		Utiliza el metodo “contains” de la clase String. Busca información sobre el mismo.
c. filtrarPorSalario. Muestra id, nombre, apellidos y salario de los empleados cuyo salario está comprendido entre
		un valor mínimo y un máximo pasados como parámetros.
d. actualizaSalario. Actualizar el salario de un empleado. El metodo recibe la id y el nuevo salario. Retorna true
		si se llevó a cabo el cambio, false en caso contrario.
e. nacidosEn. Recibe un año y muestra los empleados nacidos en ese año (toString).
f. nacidosEn. Recibe un año y un mes y muestra los empleados nacidos ese año y mes (toString).
*/

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class GestionEmpleados {

	private ArrayList<Empleado> listaEmpleados;
	
	public GestionEmpleados() {
		listaEmpleados = new ArrayList<>();
		cargarDatosPrueba();
	}

	public ArrayList<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}

	public void cargarDatosPrueba() {
		try {
			List<String> lines = Files.readAllLines(
					Paths.get("src/ejercicio14/empleados.csv"),
					StandardCharsets.UTF_8);
			for (String string : lines) {
				listaEmpleados.add(new Empleado(string));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
