package com.bytebank.modelo.banco;

public class CuentaAhorros extends Cuenta {

	public CuentaAhorros(int agencia, int numero) {
		super(agencia, numero);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;		
	}
	
	@Override
	public String toString() {
	    return "CuentaAhorros, " + super.toString();
	}
}
