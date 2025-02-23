package repasos1;

public enum Categoria {
    jefetaller("Jefe de taller",1000),
    oficial("Oficial",800),
    chapista("Chapista (que no chapero eh)",500),
    electricista("Chispas",300),
    mecanico("Mecánico",200);

    private final String name;
    private final double complemento;

    Categoria(String name, double complemento) {
        this.name = name;
        this.complemento = complemento;
    }
    public String getName() {return name;}
    public double getComplemento() {return complemento;}

    public boolean esCategoria (String entrada) {
        try {
            Categoria.valueOf(entrada);
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }

    public void mostrarCategoria() {
        System.out.println("\n***************\nCategorías Existentes:");
        for (Categoria existe : Categoria.values()) {
            System.out.println(existe.getName());
        }
    }
}
