package ejercicio1;

import java.time.LocalDate;
import java.time.LocalTime;

public class AppTest {
    public static void main(String[] args) {
        Utils.verCadaCaracter("6s^*^_");
        System.out.println("*********************");

        String[] arrayPatrones = {"Confeccionado", "Perfeccionado", "Decorado", "Entonado"};
        String[] busqueda = Utils.buscarPatron(arrayPatrones, "onado");
        for (String s : busqueda) {
            System.out.println(s);
        }
        System.out.println("*********************");
        for (int i = 0; i < Utils.separarCadenaConPatron("576257;Juan Miguel;Perez;95826726", ";").length; i++) {
            System.out.println(Utils.separarCadenaConPatron("576257;Juan Miguel;Perez;95826726", ";")[i]);
        }
        System.out.println("*********************");

        int[] numeros = {1, 654, 77, 2, 64, 29, 6, 90, 33, 9, 99};
        System.out.println(Utils.buscarYOrdenarNumeros(numeros, 9));
        System.out.println("*********************");

        LocalDate[] fechas = {LocalDate.of(2024, 2, 5), LocalDate.of(2023, 7, 20), LocalDate.of(2024, 5, 17), LocalDate.of(2023, 7, 30)};
        Utils.imprimirFechas(fechas);
        System.out.println("*********************");

        System.out.println(Utils.contarFechasEn(fechas, 7, 2023));
        System.out.println("*********************");

        LocalTime[] horas = {LocalTime.of(17, 25), LocalTime.of(23, 48), LocalTime.of(12, 1)};
        System.out.println(Utils.contarHorasAntesDe(horas, LocalTime.of(20, 0)));
    }
}
