package ejercicio10;
/*
Diseña un array que guarde los nombres de los meses del año y los muestre en pantalla uno a uno junto al número
de caracteres del propio nombre.
*/
public class Ejercicio10 {
    public static void main(String[] args) {
        String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};

        for (int i = 0; i < meses.length; i++) {
            System.out.println(meses[i] + " tiene " + meses[i].length() + " letras");
        }
    }
}
