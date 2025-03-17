package problema1;

/* Diseñar un programa que muestre el producto de los 10 números impares */
public class Problema1 {
    public static void main(String[] args) {
        int resultado = 1;

        System.out.println("Los nº's impares entre 1 y 10 son:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                resultado *= i;
                System.out.print(i + ", ");
            }
        }
        System.out.printf("\b\b\n");
        System.out.println("El resultado del producto de los n's impares entre 1 y 10 es: " + resultado);


        resultado = 1;
        System.out.println("Los 10 primeros nº's impares son:");
        for (int i = 1; i <= 10; i++) {
            resultado *= ((i * 2) - 1);
            System.out.print((i * 2) - 1 + ", ");
        }
        System.out.printf("\b\b\n");
        System.out.println("El producto de los 10 primeros nº's impares es: " + resultado);
    }
}
