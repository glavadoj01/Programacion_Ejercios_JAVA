/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 Partimos de una lista con objetos de la clase Multa (matrícula, fecha de la multa y el importe de la misma) y queremos obtener:
	a. Relación de las matrículas con sus multas. Ordenar por matrícula y por fecha.
	b. Relación de matrículas con el número de multas y el importe total de esas multas. Ordenar también por matrícula.

 */
package ejercicio09;

import java.util.*;

public class App {

	public static void main(String[] args) {
		ColeccionMultas registroDGT = new ColeccionMultas();

		System.out.println("*******************");
		System.out.println("Registro inicial:");
		System.out.println(registroDGT);

		System.out.println("*******************");
		System.out.println("Registro ordenado:");
		registroDGT.getMultas().sort(Comparator.naturalOrder());
		System.out.println(registroDGT);



		System.out.println("*******************");
		System.out.println("Registro - Resumen por Vehículo:");
		Map<String, List<Multa>> cantidadTotal = new HashMap<>();
		for (Multa m : registroDGT.getMultas()) {
			if (cantidadTotal.containsKey(m.getMatricula())) {
				cantidadTotal.get(m.getMatricula()).add(m);
			} else {
				cantidadTotal.put(m.getMatricula(), new ArrayList<>(List.of(m)));
			}
		}
		double total;
		for (Map.Entry<String, List<Multa>> entrada : cantidadTotal.entrySet()) {
			System.out.println("Matricula nº: " + entrada.getKey());
			total = 0;
			for (Multa multa : entrada.getValue()) {
				total += multa.getImporteMulta();
			}
			System.out.println("Importe Total: " + total + "\tCantidad de multas: " + cantidadTotal.get(entrada.getKey()).size());
		}
	}
}
