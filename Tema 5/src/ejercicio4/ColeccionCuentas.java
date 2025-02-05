package ejercicio4;

import java.util.ArrayList;
import java.util.Random;

public class ColeccionCuentas {
	
	private ArrayList<CuentaBancaria> listadoCuentas = new ArrayList<>();

	
	public ColeccionCuentas() {
		Cliente [] clientes = {new Cliente("1", "Sara Baras", "654456777"), new Cliente("2", "Paloma Alba", "653336777"), 
				new Cliente("3", "Ferm�n Cacho", "37377377"), new Cliente("4", "Gimena Asa", "388399399")};
		Random rnd = new Random();
		
		for (int i = 0; i < 10; i++) {
			listadoCuentas.add(new CuentaBancaria("1000"+i, clientes[rnd.nextInt(clientes.length)], 2000));
		}
	}
	
	public void mostrarCuentas() {
		for (CuentaBancaria cuenta : listadoCuentas) {
			System.out.println(cuenta);
		}
	}
	
	//retorna el nº de cuentas actualizadas e incrementa en la cantidad pasada las cuentas de ese cliente.
	public int incrementarSaldoCuentasDe (String dniCliente, double cantidad) {
		int cont=0;
		for (CuentaBancaria cuenta : listadoCuentas) {
			if (cuenta.getCliente().getDni().equals(dniCliente)) {
				cuenta.depositar(cantidad);
				cont++;
			}
		}
		return cont;
	}
	
	//retorna la cuenta con ese número
	public CuentaBancaria buscarCuenta(String numeroCuenta) {
		for (CuentaBancaria cuenta : listadoCuentas) {
			if (cuenta.getNumeroCuenta().equals(numeroCuenta)) {
				return cuenta;
			}
		}
		return null;
	}
	
	//retorna true si se pudo hacer la transferencia y false en caso contrario
	public boolean transferirCantidad(String cuentaOrigen, String cuentaDestino, double cantidad) {
		CuentaBancaria cuentaO = buscarCuenta(cuentaOrigen);
		CuentaBancaria cuentaD = buscarCuenta(cuentaDestino);
        return cuentaO.transferencia(cuentaD, cantidad);
	}
}