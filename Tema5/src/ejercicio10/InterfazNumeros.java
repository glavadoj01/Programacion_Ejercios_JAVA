package ejercicio10;

public interface InterfazNumeros {
    void mostrarNumeros();
    void mostrarNumerosComoString();
    void multiplicarPor(int numero);
    int contarValoresMayoresQue(int numero);
    int contarValoresEntre(int numero1, int numero2);
    int compararCon(int[] otraArray);
    int [] getArray(int[] otroArray);
}
/*
Esta clase debe implementar la interfaz InterfazNumeros que incluye los métodos:
a. mostrarNumeros. Metodo void que muestra uno a uno los valores del array.
b. mostrarNumerosComoString. Metodo void que muestra el array con el formato
[valor1, valor2, … , valorN]
c. multiplicarPor(int numero). Metodo void que multiplica cada valor del array por
el número pasado como parámetro. El array debe ver modificado su contenido.
d. contarValoresMayoresQue(int numero). Devuelve cuántos valores del array
superan al número pasado como parámetro.
e. contarValoresEntre(int numero1, int numero2). Devuelve cuántos valores del
array están entre los dos pasados como parámetro.
f. compararCon(int [] otroArray). Devuelve la suma de los valores del array con
mayor número de elementos.
g. getArray(int [] otroArray). Retorna el array con mayor número de elementos, el
atributo del objeto o el pasado como parámetro.
*/