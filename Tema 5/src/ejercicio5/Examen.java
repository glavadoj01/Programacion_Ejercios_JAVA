package ejercicio5;

/*
De cada examen se guarda una descripción y un listado de 20 preguntas
*/

import java.util.ArrayList;
import java.util.Random;

public class Examen {
    private String descripcion;
    private ArrayList<Pregunta> listaPreguntas;

    static Random randN = new Random();

    public Examen(int num) {
        this.descripcion = "Exámen nº " + num;
        this.listaPreguntas = new ArrayList<>();
        this.listaPreguntas = cargarPreguntas(num);
    }

    private ArrayList<Pregunta> cargarPreguntas(int num) {
        ArrayList<Pregunta> preguntasN = new ArrayList<>();

        for (int i = 1; i <=20; i++) {
            Pregunta preguntaN = new Pregunta();
            preguntaN.setEnunciado(descripcion + " - Pregunta " + i);
            preguntaN.setRespuesta1 (preguntaN.getEnunciado () + " - Respuesta 1");
            preguntaN.setRespuesta2 (preguntaN.getEnunciado () + " - Respuesta 2");
            preguntaN.setRespuesta3 (preguntaN.getEnunciado () + " - Respuesta 3");
            preguntaN.setRespuesta4 (preguntaN.getEnunciado () + " - Respuesta 4");
            preguntaN.setRespuestaCorrecta (randN.nextInt (1,5));
            preguntasN.add(preguntaN);
        }
        return preguntasN;
    }

    public String getDescripcion () {
        return descripcion;
    }
    public ArrayList<Pregunta> getListaPreguntas () {
        return listaPreguntas;
    }

    @Override
    public String toString() {
        String salida;
        int cont=0;

        salida = "Descripción: " + this.descripcion;
        for (Pregunta pregunta : this.listaPreguntas) {
            cont++;
            salida = salida + '\n' + cont + ". " + pregunta.toString();
        }
        return salida;
    }
    public String toString2() {
        String salida;
        int cont=0;

        salida = "Descripción: " + this.descripcion;
        for (Pregunta pregunta : this.listaPreguntas) {
            cont++;
            salida = salida + '\n' + cont + ". " + pregunta.toString2();
        }
        return salida;
    }
}