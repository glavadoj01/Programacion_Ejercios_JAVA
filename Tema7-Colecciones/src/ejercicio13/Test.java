package ejercicio13;

public class Test {
    public static void main(String[] args) {
        UtilCadenas utilCadenas = new UtilCadenas();

        System.out.println("Añadir valores \"valor1;valor2;valor3;...;valorN;valorvalor;valorado\"");
        utilCadenas.addCadena("valor1;valor2;valor3;...;valorN;valorvalor;valorado");
        System.out.println(utilCadenas);

        System.out.println("Buscar \"valor1\"");
        System.out.println(utilCadenas.buscarCadena("valor1"));

        System.out.println("Buscar \"cadena\"");
        System.out.println(utilCadenas.buscarCadena("cadena"));

        System.out.println("Get Lista Patrón \"or\"");
        System.out.println(utilCadenas.getListaPatron("or"));

        System.out.println("Orden de fabrica");
        System.out.println(utilCadenas);
        System.out.println("Orden Natural");
        utilCadenas.ordenarListaPatron(1);
        System.out.println(utilCadenas);
        System.out.println("Orden Reverso");
        utilCadenas.ordenarListaPatron(0);
        System.out.println(utilCadenas);


    }
}
