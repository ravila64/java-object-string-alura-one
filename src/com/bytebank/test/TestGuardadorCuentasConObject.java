package com.bytebank.test;

import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.GuardadorCuentasObject;
import com.bytebank.modelo.banco.Cuenta;
import com.bytebank.modelo.banco.CuentaCorriente;

public class TestGuardadorCuentasConObject {
	public static void main(String[] args) {
		GuardadorCuentasObject guardador = new GuardadorCuentasObject();
        Object  cc = new CuentaCorriente(22, 11);
        guardador.adicionar((Cuenta) cc);
        Object cc2 = new CuentaCorriente(22, 22);
        guardador.adicionar((Cuenta) cc2);
        
        Cliente cliente = new Cliente();
        guardador.adicionar(cliente);
        System.out.println("Cliente  "+cliente);
        
        int tamano = guardador.getCantidadDeElementos();
        System.out.println("Tamaño  "+tamano);
        
        Cuenta ref = (Cuenta) guardador.getReferencia(0);
        System.out.println("Referencia 1:"+ref.getNumero());
        Cuenta ref2 = (Cuenta) guardador.getReferencia(1); 
        System.out.println("Referencia 2:"+(ref2.getNumero()));
	}
}
