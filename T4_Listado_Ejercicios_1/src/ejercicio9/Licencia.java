package ejercicio9;

public enum Licencia {
    GNU ("Licencia Pública General de GNU (GPL)"),
    OSL3("Licencia de Open Software 3.0"),
    CCA4("Creative Commons Attribution 4.0");

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
}