package com.bytebank.test;

import com.bytebank.modelo.SaldoInsuficienteException;
import com.bytebank.modelo.banco.Cuenta;
import com.bytebank.modelo.banco.CuentaAhorros;

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
