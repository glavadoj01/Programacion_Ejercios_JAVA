package ejercicio3;
/*
Diseña un programa Java que guarde información sobre los taxis de una compañía.
De cada taxi debe guardarse la matrícula, distrito en el que opera (sur, norte, oeste…),
tipo motor (diesel o gasolina) y coordenadas (latitud y longitud por separado) en las
que se ubica.

Crea la clase necesaria y añade métodos get/set, dos constructores (uno con todos los atributos
y otro sin coordenadas (poner a 0). Diseña otro método que servirá para comprobar si dos taxis
operan en el mismo distrito devolviendo true o false. Este método recibirá un taxi como parámetro.
Añade un nuevo método que devuelva un String con las coordenadas en conjunto.

Crea dos objetos Taxi y prueba sus métodos.
*/

public class main {
    public static void main(String[] args) {
        Taxi coche1 = new Taxi(12345, Distrito.Sur, Tipo_Motor.Diesel, 123.45, 321.54);
        Taxi coche2 = new Taxi(67890, Distrito.Norte, Tipo_Motor.Gasolina);

        coche2.setLatitud(111.11);
        coche2.setLongitud(222.22);

        System.out.println("ToString por defecto en Coche 1:\t" + coche1.toString()); // To String por defecto = Dirección de memoria o Código hash identificativo del objeto en memoria
        System.out.println(coche1.getCoordenadasCompletas());
        System.out.printf("\nCoche 2: Matricula %d;\tDistrito %s;\tTipo de Motor %s;\tLatitud %.2f;\tLongitud %.2f\n", coche2.getMatricula(), coche2.getDistrito(), coche2.getTipo_Motor(), coche2.getLatitud(), coche2.getLongitud());
        if (coche1.operaMismoDistrito(coche2)) {
            System.out.println("Los Taxis 1 y 2 operan en el mismo distrito");
        } else {
            System.out.println("Los Taxis 1 y 2 no operan en el mismo distrito");
        }
    }
}

