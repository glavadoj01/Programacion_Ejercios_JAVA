package ejercicio10;

/*
Diseña un programa Java que gestione un Parking con capacidad para 200 vehículos.

Debemos crear:
        - clase Vehículo con los atributos matrícula e instante de entrada (LocalDateTime).
*/

import java.time.LocalDateTime;
import java.util.Objects;

public class Vehiculo {
    private String matricula;
    private final LocalDateTime horaEntrada;

    public Vehiculo(String matricula) {
        this.matricula = matricula;
        this.horaEntrada = LocalDateTime.now();
    }

    public String getMatricula() {
        return matricula;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    @Override
    public String toString() {
        return "Vehiculo { " +
                "Matricula = " + matricula + " ;\t" +
                "Hora de Entrada = " + horaEntrada + " }";
    }

    @Override
    public boolean equals(Object entrada) {
        if (entrada == null || getClass() != entrada.getClass()) {
            return false;
        }
        Vehiculo vehiculoPrueba = (Vehiculo) entrada;
        return Objects.equals(getMatricula(), vehiculoPrueba.getMatricula());
    } // Solo la matricula

    @Override
    public int hashCode() {
        return Objects.hashCode(getMatricula());
    }
}
