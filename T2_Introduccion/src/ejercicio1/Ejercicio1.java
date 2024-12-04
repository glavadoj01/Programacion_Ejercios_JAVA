package ejercicio1;
import java.util.Scanner;
/*
Ejercicio nº 1:
Diseña un programa Java que pida tres números y escriba en pantalla:
        - la suma de los tres
        - su producto
        - la resta del primero más el segundo menos el tercero.
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el primer nº: ");
        int numero1 =  sc.nextInt();
        System.out.println("El primer nº es: " + numero1);

        System.out.println("Escribe el segundo nº: ");
        int numero2 =  sc.nextInt();
        System.out.println("El segundo nº es: " + numero2);

        System.out.println("Escribe el tercer nº: ");
        int numero3 =  sc.nextInt();
        System.out.println("El tercer nº es: " + numero3);

        int sum = numero1+numero2+numero3;
        System.out.println("La suma de los tres nº's es: " + sum);

        int prod = numero1*numero2*numero3;
        System.out.println("El producto de los tres nº's es: " + prod);

        int rest = numero1+numero2-numero3;
        System.out.println("La suma del 1º más el 2º menos el 3º es: " + rest);
    }
}