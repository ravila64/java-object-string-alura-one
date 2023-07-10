package com.bytebank.test;

import com.bytebank.modelo.SaldoInsuficienteException;
import com.bytebank.modelo.banco.Cuenta;
import com.bytebank.modelo.banco.CuentaCorriente;

public class TestRetirar {

	public static void main(String[] args) {
		Cuenta cuenta = new CuentaCorriente(123, 321);
        cuenta.depositar(200.0);
        try {
            cuenta.retirar(210.0);
        } catch(SaldoInsuficienteException ex) {
            System.out.println("Exception: " + ex.getMessage());
            ex.printStackTrace();
        }
        System.out.println(cuenta.getSaldo());
    }
}
