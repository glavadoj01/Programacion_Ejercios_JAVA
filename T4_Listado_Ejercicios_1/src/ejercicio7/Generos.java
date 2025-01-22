package ejercicio7;

public enum Generos {
    ACCION("Acción"),
    ANIMACION("Animación"),
    AVENTURAS("Aventuras"),
    CIENCIAFICCION("Ciencia Ficción"),
    DRAMA("Drama"),
    THRILLER("Thriller"),
    FANTASIA("Fantasia"),
    FICCION("Ficción");

    private final String name;

    Generos(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
