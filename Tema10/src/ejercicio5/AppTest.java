package ejercicio5;

import java.util.ArrayList;
import java.util.Arrays;

public class AppTest {
    public static void main(String[] args) {
        ArrayList<String> masDatos =new ArrayList<>(Arrays.asList("Línea 10","Línea 11","Línea 12"));


        if (Utiles.AgregarDatos("src/tema10/ejercicio5/Lineas.txt",masDatos)){
            System.out.println("Información agregada");
        }else {
            System.out.println("Error de lectura/escritura");
        }
    }
}
