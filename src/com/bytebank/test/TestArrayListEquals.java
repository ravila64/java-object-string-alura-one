package com.bytebank.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.banco.*;

public class TestArrayListEquals {
	public static void main(String[] args) {
		ArrayList<Cuenta> lista = new ArrayList<Cuenta>();
		//List<Cliente> listClientes = new LinkedList<>();
		
		//List<Cuenta> lista = new LinkedList<>();
	    
		Cuenta cc1 = new CuentaCorriente(22, 22);
	    Cuenta cc2 = new CuentaCorriente(22, 22);

	    lista.add(cc1);
	    boolean existe = lista.contains(cc2); //nuevo
	    System.out.println("Ya existe, cc2? " + existe);

	    //creación de cuentas omitidas

	    boolean igual = cc1.esIgual(cc2);
	    System.out.println(igual); //debe imprimir true
	    
	    for(Cuenta cuenta : lista){
	        System.out.println(cuenta);
	    }
	}
}
