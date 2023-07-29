package com.bytebank.test;

import com.bytebank.modelo.GuardarCuentas;
import com.bytebank.modelo.banco.CuentaCorriente;
import com.bytebank.modelo.banco.Cuenta;

public class TestGuardaCuentas {
	public static void main(String[] args) {
		GuardarCuentas guardaCuentas = new GuardarCuentas();
		Cuenta cc = new CuentaCorriente(11,22);
		guardaCuentas.adicionar(cc);
		Cuenta cc2 = new CuentaCorriente(22, 44);
		guardaCuentas.adicionar(cc2);
		
		Cuenta ccc = guardaCuentas.obtener(1);
		
		System.out.println(ccc);
		System.out.println(guardaCuentas.obtener(1));
	}
}
