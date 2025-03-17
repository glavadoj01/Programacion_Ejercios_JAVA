package ejercicio9;

public enum Licencia {
    GNU ("Licencia Pública General (GNU)"),
    OSL3("Licencia de Open Software 3.0 (OSL3)"),
    CCA4("Creative Commons Attribution 4.0 (CCA4)"),;

    private final String name;

    Licencia(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static boolean esLicenciaPrograma(String entrada) {
        try{
            Licencia.valueOf(entrada.toUpperCase());
            return true;
        } catch (IllegalArgumentException e){
            return false;
        }
    }

    public static void mostrarLicencias() {
        for (Licencia licencia : Licencia.values()) {
            System.out.println(licencia.getName());
        }
    }
}