package com.bytebank.test;

import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.GuardaReferencias;
import com.bytebank.modelo.banco.Cuenta;
import com.bytebank.modelo.banco.CuentaCorriente;

public class TestGuardaReferencias {
	public static void main(String[] args) {
		GuardaReferencias guardaRef = new GuardaReferencias();
		Cuenta cc = new CuentaCorriente(11, 22);
		guardaRef.adicionar(cc);
		Cuenta cc2 = new CuentaCorriente(22, 44);
		guardaRef.adicionar(cc2);
		System.out.println("Cta cte 1 : "+guardaRef.obtener(0));
		System.out.println("Cta cte 2 : "+guardaRef.obtener(1));
		
		Cliente cliente = new Cliente();
		guardaRef.adicionar(cliente);
		System.out.println("Cliente  "+cliente);
		
		int tamano = guardaRef.getCantidadDeElementos();
		System.out.println("TamaNo  "+tamano);
	
	}
}
