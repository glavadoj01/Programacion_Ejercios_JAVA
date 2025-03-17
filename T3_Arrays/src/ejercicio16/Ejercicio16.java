package ejercicio16;
/*
Diseña un programa Java que trabaje con este array int [] a= {1,66,15,33,2,34,65,39,15,78};
e intercambie los valores del array de la siguiente forma:
        1º - El primero con el último
        2º - El segundo con el penúltimo
        3º - El tercero con el antepenúltimo
             ...
*/
public class Ejercicio16 {
    public static void main(String[] args) {
        int [] a= {1,66,15,33,2,34,65,39,15,78};
        int temp;

        pintarArray(a);
        for (int i = 0; i <= (a.length/2); i++) {
            temp = a[i];
            a[i] = a[a.length-1-i];
            a[a.length-1-i] = temp;
        }
        pintarArray(a);
    }

    public static void pintarArray(int[] array) {
        System.out.print("\nEl array es:  ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print("\b\b\n");
    }
}
