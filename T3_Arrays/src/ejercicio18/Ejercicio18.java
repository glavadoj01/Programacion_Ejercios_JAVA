package ejercicio18;

/*
Diseña un programa Java que compruebe si son correctas o no las contraseñas
contenidas en este array: String [] contrasenas = {"ABC123434", "asdfasdf$$@",
        "###34234234", "12341234ABC", "asdfasdfB333"};
Una contraseña es correcta si:
a. Longitud mínima de 10 caracteres
b. Solo contiene letras y números
c. Contiene al menos dos números.
*/
public class Ejercicio18 {
    public static void main(String[] args) {
        String[] contrasenas = {"ABC123434", "asdfasdf$$@", "###34234234", "12341234ABC", "asdfasdfB333"};
        Boolean[] escorrecta = new Boolean[contrasenas.length];
        int numeros, letras;

        for (int i = 0; i < contrasenas.length; i++) {   // Para cada contraseña/elemento del array:
            numeros = 0;
            letras = 0;      // Hay que reiniciar los valores para cada contraseña/elemento

            for (int j = 0; j < contrasenas[i].length(); j++) { //Para cada carácter de la contraseña nº "i":
                numeros = contarNumeros(contrasenas[i]);
                letras = contarLetras(contrasenas[i]);
                // He contado los nº y letras de la contraseña nº i:
                if (contrasenas[i].length() >= 10 && contrasenas[i].length() == (numeros + letras) && numeros >= 2) {
                    escorrecta[i] = true;
                } else escorrecta[i] = false;
            }
        }

        for (int i = 0; i < contrasenas.length; i++) {
            System.out.println("La contraseña \"" + contrasenas[i] + "\" ¿Es correcta? " + escorrecta[i]);
        }
    }

    private static int contarNumeros(String contrasena) {
        int salida = 0;
        for (int i = 0; i < contrasena.length(); i++) {
            if (contrasena.charAt(i) >= '0' && (contrasena.charAt(i) <= '9')) {
                salida++;
            }
        }
        return salida;
    }

    private static int contarLetras(String contrasena) {
        int salida = 0;
        for (int i = 0; i < contrasena.length(); i++) {
            if ((contrasena.charAt(i) >= 'a' && contrasena.charAt(i) <= 'z') || (contrasena.charAt(i) >= 'A' && contrasena.charAt(i) <= 'Z')) {
                salida++;
            }
        }
        return salida;
    }
}



