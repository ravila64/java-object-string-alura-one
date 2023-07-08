package bytebank.test;

import bytebank.modelo.Cuenta;
import bytebank.modelo.CuentaAhorros;
import bytebank.modelo.SaldoInsuficienteException;

public class TestCuentaExceptionSaldo {
	public static void main(String[] args) {
		Cuenta ca= new CuentaAhorros(123, 456);
		ca.depositar(200);
		try {
			ca.retirar(200);
			ca.retirar(10);// mostraria excepcion en consola saldo<retiro
		} catch (SaldoInsuficienteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
