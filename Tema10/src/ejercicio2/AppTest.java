package ejercicio2;

/*
Diseña un programa Java que cree un archivo en el que se guarden las cadenas
existentes en un arrayList de tipo String.
*/

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppTest {
    public static void main(String[] args) {
        String[] texto = new String[]{"Hola Mundo IO",
                "Este es el 2º ejercicio",
                "En este escribimos varias líneas",
                "En un solo fichero"};

        BufferedWriter br;
        try {
            br = new BufferedWriter(new FileWriter("src/tema10/ejercicio2/FicheroPrueba2.txt"));
            for (String linea : texto) {
                br.write(linea);
                br.newLine();
            }
            System.out.println("Escritura finalizada");
            br.close();
        }
        catch (IOException e) {
            System.out.println("Error de escritura");
            System.out.println(e.getMessage());
        }
    }
}
