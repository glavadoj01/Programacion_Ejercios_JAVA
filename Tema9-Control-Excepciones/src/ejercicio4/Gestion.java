package ejercicio4;

import tema9.recursoscomunes.PosicionOcupada;

public class Gestion {
    private final Persona[] listaP;

    public Gestion() {
        this.listaP = new Persona[10];
    }

    public Persona[] getListaP() {
        return this.listaP;
    }

    public void anadirPersona(int indice, Persona persona) throws PosicionOcupada {

        if (this.listaP[indice] == null) {
            this.listaP[indice] = persona;
            System.out.println("Proceso realizado");
        } else {
            System.out.println("Proceso ABORTADO");
            throw new PosicionOcupada("Imposible añadir, array lleno en esta posición");
        }
    }

    public void eliminarPersona(int indice) throws Exception {
        if (listaP[indice] == null) {
            throw new Exception("La persona no existe");
        } else {
            listaP[indice] = null;
        }
    }
}
