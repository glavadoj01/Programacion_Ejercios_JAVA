package ejercicio04;

public class Ciudad implements Comparable<Ciudad> {
    private String nombre;
    private String pais;
    private int habitantes;

    public Ciudad(String nombre, String pais, int habitantes) {
        this.nombre = nombre;
        this.pais = pais;
        this.habitantes = habitantes;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public int getHabitantes() {
        return habitantes;
    }
    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    @Override
    public String toString() {
        return "Ciudad{" +
                "\tNombre = " + nombre +
                "\tPais = " + pais +
                "\tHabitantes = " + habitantes +
                "\t}";
    }

    @Override
    public int compareTo(Ciudad ciudad2) {
        return this.habitantes - ciudad2.getHabitantes();
    }

    // Como son nº's, directamente los resto, no hacen falta funciones de comparar
    // si devuelve lo que sea positivo, el 1º es más grande, da igual que sea 1
    // o cualquier nº positivo.

    // ¿Cual es el orden preferido/natural?  ¿EL A? Nº Habitantes?
    // Como no dice nada puedo elegir el que quiera, si dide algo, el k diga

}
