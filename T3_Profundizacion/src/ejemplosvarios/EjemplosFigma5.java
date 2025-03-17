package ejemplosvarios;
/*Diseña un programa Java que pida un número entero comprendido entre 1 y 100
 y calcule la tabla de multiplicar de ese número.
 Si no está comprendido entre 1 y 100 mostrar un mensaje de error*/


import java.util.Scanner;

public class EjemplosFigma5 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in); //En figma cuando se use
        int num;

        do {
            System.out.println("Introduce un numero entero entre 1 y 100: ");
            num = escanear.nextInt();
            if (num < 1 || num > 100) {  // Las dos barras es la "Condición O": Si es menor que 1; o sí es mayor que 100
                System.out.println("ERROR - Ingresar nº entre 1 y 100");
            }
        }while (num < 1 || num > 100);
//         El capturador de teclas no va muy haya.
//         lo que he hecho ha sido selecionar todo lo que quiero entrar en el "DO"
//         y he pulsado la tecla para la llave. El IDE ya sabe que quiero entrarlo ahi, no borrarlo, tmb va con parentesis y comillas....

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i)); // Que listo es, pero revisarlo bien siempre.
        }
        // FIN
    }
}
