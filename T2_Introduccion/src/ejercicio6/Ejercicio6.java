package ejercicio6;
import java.util.Scanner;
/*
Ejercicio nº 6:
Diseña un programa Java que transforme una temperatura dada en centígrados a kelvin.
Tª Kelvin = Tª Centigrado + 273
*/
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);

        System.out.print("¿Qué temperatura hace en grados centígrados? ");
        float cent = escanear.nextFloat();

        float kelv = cent + 273;

        System.out.println("Una temperatura de " + cent + " ºC");
        System.out.println("Es equivalente a : " + kelv + " K"); // La escala absoluta no es graduada NO GRADOS KELVIN
    }                                                            //  Simplemente:   ("el nº") Kelvin
}
