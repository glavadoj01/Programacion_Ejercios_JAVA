package ejercicio5;
import java.util.Scanner;
/*
Ejercicio nº 5:
Diseña un programa que solicite nombre, peso y altura de una persona.
A partir de estos datos, emitir un mensaje del tipo: Paco, tu IMC es 24,566.
El IMC es el índice de masa corporal =>  Masa entre altura al cuadrado
*/
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);

        System.out.print("¿Como se llama la persona? ");
        String nombre = escanear.next();


        System.out.println("¡Utilizar coma como separador decimal!");
        System.out.print("¿Cuantos Kg pesa " + nombre + " ? ");
        float peso = escanear.nextFloat();


        System.out.print("¿Canto mide " + nombre + " ? ");
        float altura = escanear.nextFloat();


        float imc = peso / (altura * altura);
        System.out.println(nombre + " tiene un IMC de " + imc);
    }
}