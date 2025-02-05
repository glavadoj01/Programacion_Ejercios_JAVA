package ejercicio3;

public class Cliente {
	private int id;
	private String nombre;
	private String apellidos;
	
	public Cliente(int id, String nombre, String apellidos) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getNombreCompleto() {
		return nombre + " " + this.apellidos;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}
}
