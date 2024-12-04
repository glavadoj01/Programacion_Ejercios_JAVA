package ejercicio11;
import java.util.Scanner;
/*
Solicitar dos enteros al usuario y mostrar en pantalla si son pares o impares. El programa dará al usuario
la posibilidad de repetir con otros dos números.
*/
public class Ejercicio11 {
    public static void main(String[] args) {
        int rep, a, b;
        Scanner escanear = new Scanner(System.in);

        do {
            //Entrada datos
            System.out.print("Introducir un nº entero: ");
            a = escanear.nextInt();

            System.out.print("Introducir otro nº entero: ");
            b = escanear.nextInt();

            //Salida datos
            if (a%2==0){
                System.out.printf("El número %d es par\n",a);
            }else System.out.printf("El número %d es impar\n",a);

            if (b%2==0){
                System.out.printf("El número %d es par\n",b);
            }else System.out.printf("El número %d es impar\n",b);

            // Repetición S/N
            do {
                System.out.println("Para  salir  introduzca 0");
                System.out.println("Para repetir introduzca 1");
                rep = escanear.nextInt();
                if (rep != 1 && rep != 0){
                    System.out.println("Error");
                }
            }while (rep != 1 && rep != 0);

            //Salida de la Repetición
        }while (rep==1);
        escanear.close();
    }
}
