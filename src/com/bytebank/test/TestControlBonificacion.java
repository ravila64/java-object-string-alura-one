package com.bytebank.test;

import com.bytebank.modelo.Contador;
import com.bytebank.modelo.ControlBonificacion;
import com.bytebank.modelo.Funcionario;
import com.bytebank.modelo.Gerente;
import com.bytebank.modelo.Ingeniero;

public class TestControlBonificacion {
	public static void main(String[] args) {
		Funcionario rene = new Ingeniero();
		rene.setSalario(2000.0);
		rene.setDocumento("12345");
		rene.setNombre("Rene Avila");
		rene.setTipo(0);
		System.out.println("Pase x TestControlBonificacion");
	
		Gerente jimena=new Gerente();
		jimena.setSalario(10000.0);
		jimena.setTipo(1);
		
		Contador alexis=new Contador();
		alexis.setSalario(5000.0);
		
		ControlBonificacion ctrlBonif = new ControlBonificacion();
		ctrlBonif.RegistrarSalario(rene);
		ctrlBonif.RegistrarSalario(jimena);
		ctrlBonif.RegistrarSalario(alexis);
				
	}

}

