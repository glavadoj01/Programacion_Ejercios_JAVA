package problema5;

import java.util.Random;

/*
Crear aleatoriamente 10 notas entre 1 y 10. El resultado del programa debe mostrar algo parecido a esto:
Suspensos -> 4 (< 5)
Suficiente -> 1 (=5)
Bien -> 2 (=6)
Notable -> 2 (7-8)
Sobresaliente ->2 (9-10)
Mayor nota = 9
*/
public class Problema5 {
    public static void main(String[] args) {
        Random crearRandom = new Random();
        int num, susp = 0, sufi = 0, bien = 0, notab = 0, sobre = 0, mayor = 0;

        for (int i = 1; i <= 10; i++) {
            num = crearRandom.nextInt(10) + 1;
            switch (num) {
                case 1, 2, 3, 4:
                    susp++;
                    break;
                case 5:
                    sufi++;
                    break;
                case 6:
                    bien++;
                    break;
                case 7, 8:
                    notab++;
                    break;
                default:
                    sobre++;
                    break;
            }
            if (num > mayor) {
                mayor = num;
            }
        }

        System.out.println("Suspensos     -> " + susp + " ( < 5)");
        System.out.println("Suficiente    -> " + sufi + " ( = 5)");
        System.out.println("Bien          -> " + bien + " ( = 6)");
        System.out.println("Notable       -> " + notab + " ( 7 - 8)");
        System.out.println("Sobresaliente -> " + sobre + " ( 9 - 10)");
        System.out.println("La mayor nota ha sido un: " + mayor);
    }
}
