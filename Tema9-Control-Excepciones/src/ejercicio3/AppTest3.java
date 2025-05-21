package ejercicio3;

import tema9.recursoscomunes.ExcepcionFueraMenu2;
import tema9.recursoscomunes.Menu;

public class AppTest3 {
    public static void main(String[] args) {
        char op;

        do {
            try {
                op = Menu.mostrar();
                System.out.println("La opción elegida ha sido: " + op);
            } catch (ExcepcionFueraMenu2 e) {
                op = ' ';
                System.out.println(e.getMessage());
            }
        } while (op != 'S');
        Menu.cerrar();
    }
}
