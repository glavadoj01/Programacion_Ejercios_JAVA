package ejemploObjetos;

public class Ordenador {
    private String color;
    private String marca;
    private int memoria;
    private String microprocesador;

    public Ordenador(String color, String marca, int memoria, String microprocesador) {
        this.color = color;
        this.marca = marca;
        this.memoria = memoria;
        this.microprocesador = microprocesador;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getMemoria() {
        return memoria;
    }
    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }
    public String getMicroprocesador() {
        return microprocesador;
    }
    public void setMicroprocesador(String microprocesador) {
        this.microprocesador = microprocesador;
    }
}
