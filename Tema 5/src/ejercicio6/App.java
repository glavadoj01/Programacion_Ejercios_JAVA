package ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Vehiculo> catalogo = new ArrayList<>();

        catalogo.add(new Vehiculo("GGGG","Desconocida","Unknow",33));
        catalogo.add(new Vehiculo("HHHH","Desconocida","Unknow",33));
        catalogo.add(new Vehiculo("IIII","Desconocida","Unknow",33));

        catalogo.add(new Furgoneta("AAAA","Marca1","Modelo1", 123, 50, 350));
        catalogo.add(new Furgoneta("BBBB","Marca1","Modelo1",123,50,350));
        catalogo.add(new Furgoneta("CCCC","Marca1","Modelo2",100,45,300));

        catalogo.add(new Turismo("DDDD","Opel","Corsa",35,3,false));
        catalogo.add(new Turismo("EEEE","Dacia","Duster",50,5,false));
        catalogo.add(new Turismo("FFFF","Dacia","Duster",50,5,false));

        int i=0;
        for (Vehiculo vehiculo : catalogo) {
            i++;
            System.out.println("\n\n*****************\n\nVehiculo nº " + i);
            System.out.println("El vehículo es un/a: " + vehiculo.getClass().getSimpleName() + "(con getClass())");
            if (vehiculo instanceof Furgoneta) {
                System.out.println("Es una Furgoneta (con instance of)");
            }
            else if (vehiculo instanceof Turismo) {
                System.out.println("Es un Turismo (con instance of)");
            }
            else if (vehiculo instanceof Vehiculo) {
                System.out.println("Es un Vehiculo (con instance of)");
            }
            System.out.println(vehiculo);
        }
    }
}
