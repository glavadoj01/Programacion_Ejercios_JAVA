package ejercicio09;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ColeccionMultas {
	private final List<Multa> multas = new ArrayList<>();
	
	public ColeccionMultas() {
		Random rnd = new Random();
		String[] matriculas = { "1299-BMX", "3899-KML", "9099-JKL", "3737-NMS",
					"4566-CMC", "9001-BMT", "3201-KKL", "8012-BCD"};
		Double[] importes = { 50.0, 100.0, 150.0, 200.0, 250.0, 300.0 };
		for (int i = 0; i < 20; i++) {
			multas.add(new Multa(matriculas[rnd.nextInt(matriculas.length)],
					LocalDate.of(2000 + rnd.nextInt(22)  , rnd.nextInt(12) + 1, rnd.nextInt(28) + 1),
					importes[rnd.nextInt(importes.length)]));
		}
		multas.add(new Multa("1299-BMX",LocalDate.of(2002,2,2) ,125.00));
		multas.add(new Multa("1299-BMX",LocalDate.of(2002,2,3) ,125.00));
	}

	public List<Multa> getMultas() {
		return multas;
	}

	@Override
	public String toString() {
		String salida = "";
		for (Multa multa : multas) {
			salida += multa.toString() + "\n";
		}
		return salida.substring(0, salida.length() - 1);
	}
}
