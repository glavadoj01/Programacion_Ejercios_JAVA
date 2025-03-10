package ejercicio10;
/*
Diseña un programa Java que muestre en pantalla los enteros entre 1 y 20 y en la misma línea el cubo de cada número.
*/
public class Ejercicio10 {
    public static void main(String[] args) {
        int acu,cub;

        // SALIDA DATOS
        for (acu = 2; acu < 20; acu++){
            cub= (int) Math.pow(acu,3);
            System.out.printf("El cubo del nº %2d es igual a %4d\n",acu,cub);
        }
    }
}
