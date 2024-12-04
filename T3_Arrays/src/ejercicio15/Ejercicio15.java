package ejercicio15;
/*
Diseña un programa Java que mueva los valores de un array una posición hacia el
final (hacia la derecha). El último elemento pasará a ser el primero.
*/
public class Ejercicio15 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int temp;
        pintarArray(array);
        temp = array[array.length-1];
        for (int i = array.length-1; i > 0; i--) {
            array[i]= array[i-1];
        }
        array[0] = temp;
        pintarArray(array);
    }

    public static void pintarArray(int[] array) {
        System.out.print("\nEl array es:  ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print("\b\b\n");
    }
}
