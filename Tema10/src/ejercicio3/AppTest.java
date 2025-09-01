package ejercicio3;

/*
Diseña un programa Java que solicite palabras (sin espacios) al usuario (metodo
next() de Scanner) y las guarde en un archivo. El proceso de petición finaliza cuando
el usuario teclee “fin”, que no debe escribirse en el archivo.
*/


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class AppTest {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean cont = true;
        String palabra;
        BufferedWriter bw;
        int i = 1;
        do {
            palabra = solicitarPalabra();
            if (palabra.equals("fin")) {
                cont = false;
            } else {
                try {
                    bw = new BufferedWriter(new FileWriter("src/tema10/ejercicio3/Archivo" + i +
                            ".Palabra." + palabra + ".txt"));
                    bw.write(palabra);
                    bw.newLine();
                    bw.close();
                    i++;
                } catch (Exception e) {
                    System.out.println("Error de escritura");
                    System.out.println(e.getMessage());
                }
            }
        } while (cont);
        sc.close();
    }

    private static String solicitarPalabra() {
        System.out.print("Ingresar una palabra: ");
        return sc.next();
    }
}
