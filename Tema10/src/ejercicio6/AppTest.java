package ejercicio6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class AppTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String patron;

        while (true) {
            System.out.println("Para salir: fin");
            System.out.print("Ingresar un patrón: ");
            patron = sc.nextLine();
            int i = 1;

            if (patron.equalsIgnoreCase("fin")) {
                break;
            }

            try {
                System.out.println("Buscando la palabra: " + patron);
                System.out.println("*****************************************");
                for (String linea : Files.readAllLines(Path.of("src/tema10/ejercicio6/texto.txt"))) {
                    if (linea.contains(patron)) {
                        System.out.println("Encontrada en la línea " + i + ": " + linea);
                    }
                    i++;
                }
                System.out.println("*****************************************");
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        sc.close();
    }
}
