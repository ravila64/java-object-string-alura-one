package com.bytebank.test;

import com.bytebank.modelo.GuardadorDeCuentas;
import com.bytebank.modelo.banco.Cuenta;
import com.bytebank.modelo.banco.CuentaCorriente;

public class TestGuardadorDeCuentas {
	public static void main(String[] args) {
        GuardadorDeCuentas guardador = new GuardadorDeCuentas();
        Cuenta cc = new CuentaCorriente(22, 11);
        guardador.adicionar(cc);
        Cuenta cc2 = new CuentaCorriente(22, 22);
        guardador.adicionar(cc2);
        
        int tamano = guardador.getCantidadDeElementos();
        System.out.println("Tamaño  "+tamano);
        
        Cuenta ref = guardador.getReferencia(0);
        System.out.println("Referencia 1:"+ref.getNumero());
        
        System.out.println("Referencia 2:"+guardador.getReferencia(1).getNumero());

	}
}
