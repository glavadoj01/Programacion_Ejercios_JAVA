package ejercicio11;

import java.util.List;

public interface Agenda {

    boolean insertarNuevoContacto(String nombre);
    boolean agregarCorreo(String nombreContacto ,String correo);
    boolean agregarTelefono(String nombreContacto ,String telefono);
    List<String> buscarTelefonos(String nombreContacto);
    List<String> buscarCorreo(String correo);

}
