package ejercicio4;
/*
Diseña un programa Java que llene un array de 10 elementos enteros con los múltiplos de 5 a partir de 50.
Luego el programa deberá mostrar el contenido de las posiciones pares del array.
*/
public class Ejercicio4 {
    public static void main(String[] args) {
        int[] array = new int[10];

        System.out.println("\nEl array es: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = 50 + (5*i);
            System.out.print(array[i] + ", ");
        }
        System.out.printf("\b\b\n\n");

        System.out.println("Las posiciones pares del array son: ");
        for (int i = 1; i < array.length; i=i+2) {
            System.out.print(array[i] + ", ");
        }
        System.out.printf("\b\b\n");
    }
}
