package examen1;

/*
Tenemos una segunda clase llamada Agenda, que está compuesta por objetos de la anterior.
En el archivo adjunto del examen viene la definición de la clase y el constructor ya implementado.
Este constructor precarga objetos contacto de un archivo csv en un ArrayList.
Así que se parte ya con datos para trabajar. Hay que desarrollar el resto de la clase con los métodos necesarios
para poder operar y que serán llamados desde la clase siguiente.
*/

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Agenda {
	private ArrayList<Contacto> agenda = new ArrayList<>();

	public Agenda() {
		int id;
		String nombre, telefono;

		try {
			List<String> lines = Files.readAllLines(Paths.get("src/examen1/agenda.csv"),
					StandardCharsets.UTF_8);
			for (String s : lines) {
				String[] cont = s.split(";");
				id = Integer.parseInt(cont[0]);
				nombre = cont[1];
				telefono = cont[2];
				agenda.add(new Contacto(id, nombre, telefono));
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	// 1 Nuevo contacto: el metodo de la clase Agenda, no devuelve nada y recibe como parámetro un objeto Contacto.
	public void nuevoContacto(Contacto contacto) {
		agenda.add(contacto);
	}

	//2 Buscar contacto: el metodo de la clase Agenda, devuelve un Contacto y recibe como
	// parámetros un entero con el Id de un contacto, también se puede hacer por nombre.
	public Contacto buscarContacto (int id) {
		for (Contacto contacto : agenda) {
			if (contacto.getId() == id) {
				return contacto;
			}
		}
		return null;
	}
	public Contacto buscarContacto(String nombre) {
		for (Contacto contacto : agenda) {
			if (contacto.getNombre().equals(nombre)) {
				return contacto;
			}
		}
		return null;
	}

	//3 Modificar contacto: el metodo de la clase Agenda, no devuelve nada y recibe el objeto Contacto a modificar,
	// el nombre nuevo y el teléfono nuevo, como parámetros.
	public void modificarContacto(Contacto contacto, String nombre, String telefono) {
		contacto.setNombre(nombre);
		contacto.setTelefono(telefono);
	}

	//4 Eliminar contacto: el metodo de la clase Agenda, devuelve un boolean y recibe un parámetro que es el
	// objeto Contacto a eliminar.
	public boolean eliminarContacto(Contacto contacto) {
		return agenda.remove(contacto);
	}

	//5 Listado de contactos: metodo que no devuelve nada y tampoco tiene parámetros.
	// Tiene que imprimir todos los contactos.
	public void listadoDeContactos() {
		if (agenda.isEmpty()) {
			System.out.println("No hay contactos almacenados en la agenda");
		} else {
			for (Contacto contacto : agenda) {
				System.out.println(contacto);
			}
		}
	}

	//6 Vaciar agenda: metodo que no devuelve nada y tampoco tiene parámetros. Este metodo borra la agenda entera.
	public void vaciarAgenda() {
		agenda.clear();
	}
}