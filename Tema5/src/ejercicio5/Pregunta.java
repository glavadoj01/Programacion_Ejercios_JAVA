package ejercicio5;

/*
De cada pregunta se guarda el enunciado, una lista de 4 posibles respuestas
y el número de la opción correcta.
*/

public class Pregunta {
    private String enunciado;
    private String respuesta1;
    private String respuesta2;
    private String respuesta3;
    private String respuesta4;
    private int respuestaC;

    public Pregunta(String enunciado, String respuesta1, String respuesta2, String respuesta3, String respuesta4, int respuestaC) {
        this.enunciado = enunciado;
        this.respuesta1 = respuesta1;
        this.respuesta2 = respuesta2;
        this.respuesta3 = respuesta3;
        this.respuesta4 = respuesta4;
        this.respuestaC = respuestaC;
    }

    public Pregunta() {
        this.enunciado = "";
        this.respuesta1 = "";
        this.respuesta2 = "";
        this.respuesta3 = "";
        this.respuesta4 = "";
        this.respuestaC = 0;
    }

    public String getEnunciado() {
        return enunciado;
    }
    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }
    public String getRespuesta1() {
        return respuesta1;
    }
    public void setRespuesta1(String respuesta1) {
        this.respuesta1 = respuesta1;
    }
    public String getRespuesta2() {
        return respuesta2;
    }
    public void setRespuesta2(String respuesta2) {
        this.respuesta2 = respuesta2;
    }
    public String getRespuesta3() {
        return respuesta3;
    }
    public void setRespuesta3(String respuesta3) {
        this.respuesta3 = respuesta3;
    }
    public String getRespuesta4() {
        return respuesta4;
    }
    public void setRespuesta4(String respuesta4) {
        this.respuesta4 = respuesta4;
    }
    public int getRespuestaCorrecta() {
        return respuestaC;
    }
    public void setRespuestaCorrecta(int respuestaC) {
        this.respuestaC = respuestaC;
    }

    @Override
    public String toString() {
        return enunciado +
                "\n\ta. " + respuesta1 +
                "\n\tb. " + respuesta2 +
                "\n\tc. " + respuesta3 +
                "\n\td. " + respuesta4;
    }

    public String toString2() {
        String salida;
        salida = enunciado;
        salida = salida + "\n\ta. " + respuesta1;
        if (respuestaC == 1) {
            salida = salida + "\t---- CORRECTA ----";
        }
        salida = salida + "\n\tb. " + respuesta2;
        if (respuestaC == 2) {
            salida = salida + "\t---- CORRECTA ----";
        }
        salida = salida + "\n\tc. " + respuesta3;
        if (respuestaC == 3) {
            salida = salida + "\t---- CORRECTA ----";
        }
        salida = salida + "\n\td. " + respuesta4;
        if (respuestaC == 4) {
            salida = salida + "\t---- CORRECTA ----";
        }
        return salida;
    }

}
