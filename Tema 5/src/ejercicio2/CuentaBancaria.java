package ejercicio2;

/*
Diseña también una clase llamada CuentaBancaria como se indica:
    - Atributos: cliente (clase Cliente), saldo (double) y número de cuenta (String).
    - Métodos: constructor, getters, setters y …
            - depositar: incrementa el saldo de la cuenta en la cantidad pasada como parámetro.
            - transferencia. Mover una cantidad a otra cuenta. Ambas, cantidad y cuenta, pasadas como parámetro.
                    La operación sólo se llevará a cabo si hay saldo suficiente.
                    Este metodo devolverá true/false según se pueda realizar o no la transferencia.
*/

public class CuentaBancaria {
	private Cliente cliente;
	private double saldo;
	private String nCuenta;

	public CuentaBancaria (Cliente cliente, double saldo, String nCuenta) {
		this.cliente = cliente;
		this.saldo = saldo;
		this.nCuenta = nCuenta;
	}

	public Cliente getCliente () {
		return cliente;
	}
	public void setCliente (Cliente cliente) {
		this.cliente = cliente;
	}
	public double getSaldo () {
		return saldo;
	}
	public void setSaldo (double saldo) {
		this.saldo = saldo;
	}
	public String getnCuenta () {
		return nCuenta;
	}
	public void setnCuenta (String nCuenta) {
		this.nCuenta = nCuenta;
	}

	public void depositar (double valor) {
		this.saldo += valor;
	}

	public boolean transferencia (double cantidad, CuentaBancaria cuentaObj) {
		if(this.saldo >= cantidad && cantidad > 0) {
			this.saldo -= cantidad;
			cuentaObj.depositar (cantidad);
			return true;
		}
		return false;
	}
}