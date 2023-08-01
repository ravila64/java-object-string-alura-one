package com.bytebank.test;

import java.util.ArrayList;
import com.bytebank.modelo.banco.Cuenta;
import com.bytebank.modelo.banco.CuentaCorriente;

public class TestArrayList {
	public static void main(String[] args) {
		// Lista = conj elementos agrupados objeto mayor
		// <> forzando a que acepte un solo tipo de objeto
		// <Cuenta> es un generic
		ArrayList<Cuenta> lista = new ArrayList<>();
		Cuenta cc = new CuentaCorriente(11,22);
		Cuenta cc2= new CuentaCorriente(13,43);
		// ArrayList es ordenado automaticamente
		lista.add(cc);
		System.out.println("Cuenta 1 "+ cc);
		lista.add(cc2);
		System.out.println("Cuenta 2 "+ cc2);
		// Esto funciona si no se coloca el generic
		// in <Cuenta> para que no acepte clientes
//		Cliente cliente = new Cliente();
//		lista.add(cliente);
		
		// Aqui no va el cast (Cuenta) porque arrayList es de cuentas
		Cuenta obtenerCta = (Cuenta) lista.get(0);
		System.out.println(obtenerCta);
		// imprimir el arrayList
		System.out.println("Lista ArrayList con for");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		// Por cada Cuenta : lista
//		for (Object object : lista) {
//		}
		System.out.println("Lista ArrayList con for foreach");
		for (Cuenta object : lista) {
			System.out.println(object);
		}
		
	}
	
}
