package ejercicio3;
/*
Diseña un programa Java que guarde información sobre los taxis de una compañía.
De cada taxi debe guardarse la matrícula, Distrito en el que opera (sur, norte, oeste…),
tipo motor (diesel o gasolina) y coordenadas (latitud y longitud por separado) en las
que se ubica.

Crea la clase necesaria y añade métodos get/set, dos constructores (uno con todos los atributos
y otro sin coordenadas (poner a 0). Diseña otro método que servirá para comprobar si dos taxis
operan en el mismo Distrito devolviendo true o false. Este método recibirá un taxi como parámetro.
Añade un nuevo método que devuelva un String con las coordenadas en conjunto.

Crea dos objetos Taxi y prueba sus métodos.
*/

// Definición de clase
public class Taxi {
    private int matricula;
    private Distrito Distrito;
    private Tipo_Motor Tipo_Motor;
    private double latitud;
    private double longitud;

    // Constructor de objeto completo
    public Taxi(int matricula, Distrito distrito, Tipo_Motor tipo_motor, double latitud, double longitud) {
        this.matricula = matricula;
        this.Distrito = distrito;
        this.Tipo_Motor = tipo_motor;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    // Constructor de objeto parcial
    public Taxi(int matricula, Distrito distrito, Tipo_Motor tipo_motor) {
        this.matricula = matricula;
        this.Distrito = distrito;
        this.Tipo_Motor = tipo_motor;
        this.latitud = 0;
        this.longitud = 0;
    }

    // Métodos GET
    public int getMatricula() {return matricula;}
    public Distrito getDistrito() {return Distrito;}
    public Tipo_Motor getTipo_Motor() {return Tipo_Motor;}
    public double getLatitud() {return latitud;}
    public double getLongitud() {return longitud;}

    // Métodos SET
    public void setMatricula(int matricula) {this.matricula = matricula;}
    public void setDistrito(Distrito distrito) {this.Distrito = distrito;}
    public void setTipo_Motor(Tipo_Motor tipo_Motor) {this.Tipo_Motor = tipo_Motor;}
    public void setLatitud(double latitud) {this.latitud = latitud;}
    public void setLongitud(double longitud) {this.longitud = longitud;}

    // Métodos Especiales
    public Boolean operaMismoDistrito(Taxi taxi) {
        return taxi.getDistrito().equals(Distrito);
        /*  Taxi => Clase
            taxi en argumento entrada => taxi.getDistrito
            Distrito en equals => taxi/Distrito al que le aplico el método operaMismoDistrito

            Alternativa ANTONIO (intercambia las posiciones, mas correcto al incluir el "this.Distrito"):
        return this.Distrito.equals(taxi.getDistrito());
        */
    }
    public String getCoordenadasCompletas() {return ("Lat: " + latitud + "\t Long: " + longitud);}

    // Métodos sobreescritos


}
