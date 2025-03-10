package ejercicio11;

import java.text.DecimalFormat;

public class AppTest {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.000");

        Matriz m1 = new Matriz(3,3,1,10);
        Matriz m2 = new Matriz(4,2,5,8);
        Matriz m3 = new Matriz(2,3,4,7);

        System.out.println("\n******************\n");
        System.out.println("Matriz 1: ");
        m1.imprimirMatriz();
        System.out.println("Máximo : " + m1.getMaximo());
        System.out.println("Media : " + df.format(m1.getMedia()));

        System.out.println("\n******************\n");
        System.out.println("Matriz 2: ");
        m2.imprimirMatriz();
        System.out.println("Maximo : " + m2.getMaximo());
        System.out.println("Media : " + df.format(m2.getMedia()));

        System.out.println("\n******************\n");
        System.out.println("Matriz 3: ");
        m3.imprimirMatriz();
        System.out.println("Maximo : " + m3.getMaximo());
        System.out.println("Media : " + df.format(m3.getMedia()));
    }
}
