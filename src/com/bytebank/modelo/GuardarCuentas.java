package com.bytebank.modelo;

import com.bytebank.modelo.banco.Cuenta;

public class GuardarCuentas {
	// crear un objeto para guardar muchas cuentas
	// Permitir agregar cuentas con un metodo
	// guardacuentas.adiciona(cuenta);
	// obtener, remover, etc.
	Cuenta[] cuenta = new Cuenta[10];
	
	int indice=0;
	public void adicionar(Cuenta cc) {
		cuenta[indice]=cc;
		indice++;
	}
	public Cuenta obtener(int ind) {
		return cuenta[ind];
	}
	
}
