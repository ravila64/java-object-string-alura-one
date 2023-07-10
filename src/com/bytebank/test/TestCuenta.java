package com.bytebank.test;

import com.bytebank.modelo.SaldoInsuficienteException;
import com.bytebank.modelo.banco.CuentaAhorros;
import com.bytebank.modelo.banco.CuentaCorriente;

public class TestCuenta {

	public static void main(String[] args) throws SaldoInsuficienteException {
		CuentaCorriente cc = new CuentaCorriente(10, 5000);
		CuentaAhorros ca = new CuentaAhorros(20, 1000);
		cc.depositar(3000);
		ca.depositar(200);
		cc.transferir(1000, ca);
		System.out.println(cc.getSaldo());
		System.out.println(ca.getSaldo());
	}
}
