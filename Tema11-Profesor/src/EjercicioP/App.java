package EjercicioP;

public class App {
    public static void main(String[] args) {
        // Crear una instancia de la clase Gestion
        Gestion g = new Gestion();

        // Crear una instancia de la clase GestionFichero
        GestionFichero gf = new GestionFichero();

        // Guardar el mapa de participantes en un fichero
        String pathFichero = "src/tema11/EjercicioP/participantes.txt";
        gf.guardarFichero(g.getMapaP(), pathFichero);

        System.out.println("Los participantes se han guardado en el fichero: " + pathFichero);
    }
}
