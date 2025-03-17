package ejercicio26;

/*
Partiendo de este array con DNIs, mostrar cuáles de ellos son correctos, es decir, si
la letra que tienen se corresponde con el número.
        String [] dnis = {"80137039T","30198235S" , "15835050X", "30533829H",
        "46548712R", "30499569M", "30437328W", "30519074Y"};
Para hacer este ejercicio debes extraer de la cadena DNI, por un lado el número y por
otro la letra. Esto se hace de la siguiente forma:
String dni = “33442244F”;
int numero = Integer.parseInt(dni.substring(0, dni.length()-1));
String letra = dni.substring(dni.length()-1);
Para comprobar si la letra es la correcta para ese número puedes consultar esta web

https://www.interior.gob.es/opencms/es/servicios-al-ciudadano/tramites-y-gestiones/dni/calculo-del-digito-de-control-del-nif-nie/


*/
public class Ejercicio26 {
    public static void main(String[] args) {
        String[] dnis = {"80137039T", "30198235S", "15835050X", "30533829H", "46548712R", "30499569M", "30437328W",
                "30519074Y"};
        int numero;
        char letra;
        boolean escorrecto;

        for (int i = 0; i < dnis.length; i++) {
            System.out.print("DNI nº " + (i + 1) + ":\t");
            numero = Integer.parseInt(dnis[i].substring(0, dnis[i].length() - 1));
            letra = dnis[i].charAt(dnis[i].length() - 1);
            System.out.print(numero + "-" + letra);
            escorrecto = verificarletra(numero, letra);
            System.out.print("\nEl DNI en la posición " + (i + 1) + " es: " + escorrecto + "\n");
        }
    }

    public static boolean verificarletra(int numero, char letra) {
        int resto;
        char[] tabla = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
                'L', 'C', 'K', 'E'};

        resto = numero % 23;
        if (letra == tabla[resto]) {
            return true;
        }
        return false;
    }
}
