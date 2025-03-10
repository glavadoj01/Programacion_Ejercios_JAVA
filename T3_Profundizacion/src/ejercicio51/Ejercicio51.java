package ejercicio51;
import java.util.Scanner;
/*Diseña un programa Java que pinte en pantalla una serie de asteriscos como los que se observan.
El usuario indicará el número de filas.
2               **
4              ****
8            ********
16        ****************
32********************************
*/
public class Ejercicio51 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        int num, max, esp, ast;

        System.out.println("Ingrese un numero: ");
        num = escanear.nextInt();

        max = (int) Math.pow(2, num);



        for (int i = 1; i <= num; i++) {
            ast = (int) Math.pow(2, i);
            esp = (max-ast)/2;

            for (int j = 1; j <= esp; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= ast; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
