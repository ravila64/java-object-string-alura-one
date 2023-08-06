package com.bytebank.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.bytebank.modelo.banco.Cuenta;
import com.bytebank.modelo.banco.CuentaAhorros;
import com.bytebank.modelo.banco.CuentaCorriente;

public class TestLambda {
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
		//Comparator<Cuenta> comparator = new ordenadoPorNumeroCuenta();
		//lista.sort(comparator);
		
		// se quito para ejecutar con new Comparator<Cuenta>()
		// CLASES ANOMIMAS
//		lista.sort(new Comparator<Cuenta>() {
//			@Override
//			public int compare(Cuenta o1, Cuenta o2) {
//				// ejemplo ordenar x numero cuenta
//			    return Integer.compare(o1.getNumero(),o2.getNumero());
//			}
//		});
		// funciones lambda, programacion funcional
		 
//		lista.sort((Cuenta o1, Cuenta o2)->{
//			return Integer.compare(o1.getNumero(),o2.getNumero());
//		});
		// se puede con el return arriba corchetes y return o asi esta lambda
		lista.sort((Cuenta o1, Cuenta o2)->
			Integer.compare(o1.getNumero(),o2.getNumero())
		);
		
		
//			@Override
//			public int compare
		
		// Java 8
		// lista.sort(new ordenadoPorNumeroCuenta());
		// Java 7
//		Collections.sort(lista, new ordenadoPorNumeroCuenta());
		// EJeMPLO DE CLASE ANOMIMAS
		Collections.sort(lista, new Comparator<Cuenta>() {
			@Override
			public int compare(Cuenta o1, Cuenta o2) {
				// ORDENAR X NOMBRE DE TITULAR
				return o1.getTitular().getNombre().compareTo(o2.getTitular().getNombre());
			}
		});
		// con lambdas quedaria
		//            es decir (Cuenta c1, Cuenta c2)
		Collections.sort(lista,(c1, c2) ->{
			return c1.getTitular().getNombre().compareTo(c2.getTitular().getNombre());
		});
				
				
		System.out.println("Lista Cuentas en orden");
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		// listar las cuentas con LAMBDAs
		lista.forEach((Cuenta cuenta)->{
			System.out.println(cuenta);
		});
		
		// Una interfaz no se puede instanciar
		
	}
}
