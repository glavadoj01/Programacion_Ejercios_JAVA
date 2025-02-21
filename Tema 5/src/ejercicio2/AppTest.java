package ejercicio2;

public class AppTest {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("12345678A", "Juan", "Pérez", "666555444");
        Cliente cliente2 = new Cliente("87654321B", "María", "López", "666333222");

        CuentaBancaria cuenta1 = new CuentaBancaria(cliente1, 1000, "ES1234567890123456789012");
        CuentaBancaria cuenta2 = new CuentaBancaria(cliente2, 2000, "ES9876543210987654321098");

        System.out.println("Saldo cuenta1: " + cuenta1.getSaldo());
        System.out.println("Saldo cuenta2: " + cuenta2.getSaldo());

        System.out.println("Cuenta 1: Deposito de 200€");
        cuenta1.depositar(200);
        System.out.println("Saldo cuenta1: " + cuenta1.getSaldo());

        System.out.println("Transferencia cuenta 1 a cuenta 2 de 500€");
        cuenta1.transferencia(500, cuenta2);
        System.out.println("Saldo cuenta1: " + cuenta1.getSaldo());
        System.out.println("Saldo cuenta2: " + cuenta2.getSaldo());
    }
}
