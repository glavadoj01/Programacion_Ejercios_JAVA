package ejercicio10;

public class Test {
    public static void main(String[] args) {

        GestionNumeros gn = new GestionNumeros(10);
        System.out.println("Mostrar nº's:");
        gn.mostrarNumeros();
        System.out.println("Mostrar como String:");
        gn.mostrarNumerosComoString();
        System.out.println("\nMultiplicar todo por 2:");
        gn.multiplicarPor(2);
        System.out.println("Valores mayores que 50: " + gn.contarValoresMayoresQue(50));
        System.out.println("Valores entre 20 y 50: " + gn.contarValoresEntre(20, 50));
    }
}
