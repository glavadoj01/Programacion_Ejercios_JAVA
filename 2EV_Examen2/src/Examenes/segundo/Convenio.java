package Examenes.segundo;

public class Convenio {
    public static final double PRECIO_HORA = 30;
    public static final double PRECIO_REVISION = 20;

    public static double precioHora(String s) {
        if (s.equals("TrabajoPintura")) {
            return PRECIO_HORA;
        } else if (s.equals("RevisionAlarma")) {
            return PRECIO_REVISION;
        }
        return PRECIO_HORA;
    }
    /*
    public static double precioTotal(Servicios s) {
        return precioHora(s) * s.horasTrabajadas();
    }*/
}
