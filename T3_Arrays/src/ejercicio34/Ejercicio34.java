package ejercicio34;

import java.util.Scanner;

/*
Diseña una aplicación Java que en principio solicite nombre de usuario y contraseña. Si estas credenciales
son correctas, la aplicación mostrará un menú con las opciones 1.AAA, 2.BBB, 3.CCC y 4.Salir. En el caso de
que no exista el usuario y/o la contraseña, la aplicación finalizará mostrando el mensaje “El usuario no está
dado de alta en el sistema”. Utiliza arrays para guardar datos de usuarios y contraseñas, crea una matriz de
dos columnas donde guardar nombre de usuario y contraseña.
*/
public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] usuarios = new String[5][2];
        String [] entrada = new String[2];
        boolean continuar = false;
        int usuario = -1;


        for (int i = 0; i < usuarios.length; i++) {
            for (int j = 0; j < usuarios[i].length; j++) {
                usuarios[i][0] = "Usuario" + (i + 1);
                usuarios[i][1] = "Contraseña" + (i + 1);
            }
        }

        System.out.print("Introduzca su usuario: ");
        entrada[0] = sc.nextLine();
        System.out.print("Introduzca su contraseña: ");
        entrada[1] = sc.nextLine();

        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i][0].equals(entrada[0]) && usuarios[i][1].equals(entrada[1])) {
                continuar = true;
                usuario = i;
            }
        }

        if (!continuar) {
            System.out.println("El usuario no está dado de alta en el sistema");
        } else {
            System.out.println("Usuario: " + usuarios[usuario][0]);
            System.out.println("MENÚ:");
            System.out.println("1.AAA\n2.BBB\n3.CCC\n4.Salir");
        }

    }
}
