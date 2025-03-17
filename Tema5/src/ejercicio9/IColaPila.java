package ejercicio9;


public interface IColaPila {
    boolean esVacia();
    Persona primero();
    boolean extraer();
    boolean insertar(Persona p);
    void mostrar();
}
