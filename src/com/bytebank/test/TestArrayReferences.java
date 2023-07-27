package com.bytebank.test;

import com.bytebank.modelo.banco.CuentaCorriente;
import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.banco.Cuenta;
import com.bytebank.modelo.banco.CuentaAhorros;

public class TestArrayReferences {
	public static void main(String[] args) {
		// cc es la referencia al obj cuentaCorriente
		CuentaCorriente cc = new CuentaCorriente(100, 1000);
     // CuentaCorriente[] referencias=new CuentaCorriente[5];
	 //	Cuenta[] referencias=new CuentaCorriente[5];
		
	// este Cuenta[], tambien se puede cambiar por Object y funciona
		Object[] referencias=new Object[5];
	// Ahora si defino un cliente, puedo guardarlo teniendo el tipo Object
	 Cliente cliente=new Cliente();
	 cliente.setClave("1022");
	 referencias[4]= cliente;
	 System.out.println("Cuentas 4, cliente "+cliente.toString());
	//Cuenta[] referencias=new Cuenta[5];
 	//  puede guardar cualquier tipo de cuenta ca o cc
		referencias[1]=cc;
		
		CuentaAhorros ca = new CuentaAhorros(55, 77);
		referencias[3]=ca;
		
	// casting
		CuentaCorriente cc2 = (CuentaCorriente) referencias[1];
		System.out.println(cc2);
		
	// cast a clientes
		Cliente obtenido = (Cliente) referencias[4];
		System.out.println("Cliente obtenido "+obtenido);
		
	//	CuentaAhorros cc3 = (CuentaAhorros) referencias[1];
		// sale error cc3 porque referencias[1] es cc no ca
		
		System.out.println(referencias[1]);
		System.out.println(cc);
		
		referencias[0] = new CuentaCorriente(11,99);
		System.out.println(referencias[0]);
		System.out.println("****************");
		for (int i = 0; i < referencias.length; i++) {
			System.out.println(referencias[i]);
		}
		
	}
}
