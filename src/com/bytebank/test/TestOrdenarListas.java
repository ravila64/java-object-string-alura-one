package com.bytebank.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Comparator;

import com.bytebank.modelo.banco.Cuenta;
import com.bytebank.modelo.banco.CuentaAhorros;
import com.bytebank.modelo.banco.CuentaCorriente;

public class TestOrdenarListas {
	public static void main(String[] args) {
		Cuenta cc1=new CuentaCorriente(22,33);
		cc1.depositar(333.0);
		
		Cuenta cc2=new CuentaAhorros(22,44);
		cc1.depositar(444.0);
		
		Cuenta cc3=new CuentaCorriente(22,22);
		cc1.depositar(222.0);
			
		Cuenta cc4=new CuentaAhorros(22,55);
		cc1.depositar(444.0);
		
		List<Cuenta> lista=new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		System.out.println("Lista Cuentas en desorden");
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		// ordenar las cuentas
		//           cualq clase hija de Cuenta/ o Cuenta
		// comparator <? extend Cuenta> c
		// Java new
		Comparator<Cuenta> comparator = new ordenadoPorNumeroCuenta();
		lista.sort(comparator);
		// Java 8
		// lista.sort(new ordenadoPorNumeroCuenta());
		// Java 7
		//Collections.sort(lista, new ordenadoPorNumeroCuenta());
		System.out.println("Lista Cuentas en orden");
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
	}
}

class ordenadoPorNumeroCuenta implements Comparator<Cuenta>{
	@Override
	public int compare(Cuenta c1, Cuenta c2) {
		// forma basica
//		if(c1.getNumero()==c2.getNumero()) {
//			return 0;
//		}else if(c1.getNumero() > c2.getNumero()) {
//			return 1;
//		}else {
//			return -1;
//		}
		
		// forma intermedia
		//return c1.getNumero() - c2.getNumero();
		
		// forma wrapper
		return Integer.compare(c1.getNumero(),c2.getNumero());
	}
}