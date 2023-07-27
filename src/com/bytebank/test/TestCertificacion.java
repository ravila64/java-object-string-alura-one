package com.bytebank.test;

import com.bytebank.modelo.banco.CuentaCorriente;

public class TestCertificacion {

	public static void main(String[] args) {
		CuentaCorriente[] cuentas = new CuentaCorriente[10];
		CuentaCorriente ca1 = new CuentaCorriente(11,22);
		CuentaCorriente ca2 = new CuentaCorriente(33,44);
		cuentas[0] = ca1;
		cuentas[4] = ca2;
		System.out.println(cuentas[0].getNumero());
		System.out.println(cuentas[4].getAgencia());
		// si tomo una pos null, sale error, puedo tomar la pos 0 y 4
		
	}

}
