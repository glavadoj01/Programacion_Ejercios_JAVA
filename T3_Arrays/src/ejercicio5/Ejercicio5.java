package ejercicio5;

/*
Diseña un programa Java que visualice el contenido de este array, int [] a= {1,66,15,33,2,34,65,39,15,78},
e imprima cual es el mayor de los valores del mismo. Diseña una función que reciba un array como parámetro y
devuelva el mayor valor del mismo.
*/
public class Ejercicio5 {
    public static void main(String[] args) {
        int[] a = {1, 66, 15, 33, 2, 34, 65, 39, 15, 78}, resultado = new int[2];

        resultado = devolverMayor(a);

        System.out.println("El mayor nº es el " + resultado[0] + ", y ocupa la posicion nº " + resultado[1]);
    }

    static public int[] devolverMayor(int[] array) {
        int [] salida = {0,0}; //   {Mayor, Posicion}

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
            if (array[i] > salida[0]) {
                salida[0] = array[i];
                salida[1] = i;
            }
        }
        System.out.printf("\b\b\n");
        return salida;
    }
}
