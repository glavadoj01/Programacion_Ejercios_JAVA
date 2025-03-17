package ejercicio13;

/*Diseña un programa Java que muestre en pantalla los números enteros entre 5 y 25, su cuadrado y su cubo.
Recuerda que para usar la potencia se utiliza Math.pow (base, exponente).*/

public class Ejercicio13 {
    public static void main(String[] args) {
        int acu,cub,cua;

        // SALIDA DATOS
        for (acu=5;acu<=25;acu++){
            cua= (int) Math.pow(acu,2);
            cub= (int) Math.pow(acu,3);
            System.out.printf("El cuadrado y el cubo del nº %2d son:  %3d  y  %5d\n", acu, cua, cub);
        }
    }
}
