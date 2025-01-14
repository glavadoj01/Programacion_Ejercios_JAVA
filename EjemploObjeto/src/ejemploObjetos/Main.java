package ejemploObjetos;

public class Main {
    public static void main(String[] args) {
        Ordenador miPC = new Ordenador("Negro", "MSI", 32, "Ryzen 7");
        Ordenador delFP = new Ordenador("Negro", "Intel", 8, "Ryzen 3");
        Ordenador deLaBiblioteca = new Ordenador("Blanco", "Pentium", 4, "Intel2");

        System.out.println("La marca de miPC es:                    " + miPC.getMarca());
        System.out.println("La marca del PC de clases es es:        " + delFP.getMarca());
        System.out.println("La marca del PC de la biblioteca es:    " + deLaBiblioteca.getMarca());

        deLaBiblioteca.setMarca("Intel i-Core 2");
        System.out.println("La marca del PC de la biblioteca es:    " + deLaBiblioteca.getMarca());


    }
}
