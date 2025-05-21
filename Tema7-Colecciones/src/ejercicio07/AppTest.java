package ejercicio07;

/*
Crea una clase llamada Diccionario. Un diccionario debe tener como atributo un idioma y una
relación de términos o palabras. Has de tener en cuenta que un término puede tener uno o varios
significados. Crea métodos para añadir términos y significados y para buscar los significados de un término.
    Ejemplos de métodos a incluir en Diccionario:
        - public void addPalabra(String palabra, String significado)
        - public void addPalabra(String palabra, List<String> significados)
        - public void addPalabra(String palabra, String [] significados)
        - public void addPalabra(String palabra, String significados, String separador)
        - public List<String> getSignificadosDe(String palabra)
*/

import java.util.List;

public class AppTest {
    public static void main(String[] args) {
        Diccionario dicEsp = new Diccionario("Español");


        System.out.println("\n***************************************\n");
        System.out.println("Una palabra con un significado:");
        dicEsp.addPalabra("Abecedario","Para designar la serie ordenada de las letras con que se representan los fonemas o sonidos distintivos de una lengua, pueden usarse indistintamente los términos abecedario y alfabeto.");
        System.out.println("Significados de 'Abecedario': " + dicEsp.getSignificadosDe("Abecedario"));

        System.out.println("\n***************************************\n");
        System.out.println("Misma palabra con dos significados (List):");
        dicEsp.addPalabra("Abecedario", List.of("Significado 2","Para designar la serie ordenada de las letras con que se representan los fonemas o sonidos distintivos de una lengua, pueden usarse indistintamente los términos abecedario y alfabeto."));
        System.out.println("Significados de 'Abecedario': " + dicEsp.getSignificadosDe("Abecedario"));

        System.out.println("\n***************************************\n");
        System.out.println("Una palabra con tres significados (Array):");
        dicEsp.addPalabra("Palabra 2",new String[]{"Def 1", "Def 2", "Def 3"});
        System.out.println("Significados de 'Palabra 2': " + dicEsp.getSignificadosDe("Palabra 2"));

        System.out.println("\n***************************************\n");
        System.out.println("Una palabra con tres significados + 1 repetido (Con Separador):");
        dicEsp.addPalabra("ciudad", "urbe;metrópoli;capital;urbe", ";");
        System.out.println("Significados de 'ciudad': " + dicEsp.getSignificadosDe("ciudad"));

        System.out.println("\n***************************************\n");
        System.out.println("Una palabra que no existe en el diccionario:");
        System.out.println("Significados de 'árbol' (sin añadir): " + dicEsp.getSignificadosDe("árbol"));
    }
}
