package ejercicio3;

/*
Intercambia los contenidos de las posiciones primera y última de este array
        int [] a= {1,66,15,33,2,34,65,39,15,78}.
Mostrar los valores del array tras el intercambio.
*/
public class Ejercicio3 {
    public static void main(String[] args) {
        int[] a = {1, 66, 15, 33, 2, 34, 65, 39, 15, 78};
        int temp;

        temp = a[0];
        a[0] = a[a.length - 1];
        a[a.length - 1] = temp;

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.printf("\b\b\n");
    }
}
