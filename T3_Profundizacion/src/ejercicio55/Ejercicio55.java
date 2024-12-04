package ejercicio55;
import java.util.Scanner;
/*
Diseña una aplicación Java que permita mostrar el calendario de un mes y año concretos. Para elaborar este
calendario necesitas conocer qué día de la semana comienza ese mes. Consulta esta web para conocer este dato:
https://www.gaussianos.com/como-calcular-que-dia-de-la-semana-fue/
*/
public class Ejercicio55 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        int anno, r, nDias;
        String mes;
        
        System.out.println("Ingrese un mes y año para ver el calendario de ese mes.");
        System.out.print("Introducir año: ");
        anno = escanear.nextInt();
        do {
            System.out.print("Introducir nombre del mes: ");
            mes = escanear.next().toLowerCase();
            if (mes.equals("enero") || mes.equals("febrero") || mes.equals("marzo") || mes.equals("abril") || mes.equals("mayo") || mes.equals("junio") || mes.equals("julio") || mes.equals("agosto") || mes.equals("septiembre") || mes.equals("octubre") || mes.equals("noviembre") || mes.equals("diciembre")) {
                break;
            }
        } while (true);

        r = obtenerprimerdia(anno, mes);  // Devuelve la posicion del dia 1;   r=[1,7]

        switch (mes) {
            case "enero", "marzo", "mayo", "julio", "agosto", "octubre", "diciembre":
                nDias = 31;
                break;
            case "abril", "junio", "septiembre", "noviembre":
                nDias = 30;
                break;
            default:
                if ((anno % 4 == 0 && anno % 100 != 0) || (anno % 400 == 0)) {
                    nDias = 29;
                } else nDias = 28;
        }

        System.out.println("  L  |  M  |  X  |  J  |  V  |  S  |  D  ");
        System.out.println("-----|-----|-----|-----|-----|-----|-----");

        //Imprimir espacios hasta antes del día 1
        for (int i = 1; i < r; i++) {
            System.out.print("     |");
        }

        //Imprime el calendario del mes
        for (int dia = 1; dia <= nDias; dia++) {
            System.out.printf("  %2d |", dia);
            if (r % 7 == 0) { // Si la posicion del dia, es multiplo de 7 (es domingo) => Imprimir salto de línea
                System.out.printf("\b\n"); // Tambien borro la última barra/separador vertical
            }
            r++;
        }
    }

    public static int obtenerprimerdia(int anno, String mes) {
        // https://www.gaussianos.com/como-calcular-que-dia-de-la-semana-fue/
        int siglo, a, b, c, d, e = 1, r;  // e=1 => Quiero el 1º día del mes

        siglo = anno / 100;
        if (siglo < 20) {
            a = (((20 - siglo) - 1) * 2) + 1;
        } else {
            a = ((20 - siglo) * 2);
        }

        b = (anno - (siglo * 100)) + ((anno - (siglo * 100)) / 4);

        if (((anno % 4 == 0 && anno % 100 != 0) || (anno % 400 == 0)) && (mes.equals("enero") || mes.equals("febrero"))) {
            c = -1;
        } else c = 0;

        switch (mes) {
            case "enero":
                d = 6;
                break;
            case "febrero", "marzo", "noviembre":
                d = 2;
                break;
            case "abril", "julio":
                d = 5;
                break;
            case "mayo":
                d = 0;
                break;
            case "junio":
                d = 3;
                break;
            case "agosto":
                d = 1;
                break;
            case "septiembre", "diciembre":
                d = 4;
                break;
            default:
                d = 6;
        }

        r = (a + b + c + d + e) % 7;
        if (r == 0) {
            r=7;
        }
        return r;
    }
}
