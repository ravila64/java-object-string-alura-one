package com.bytebank.test;

import com.bytebank.modelo.Funcionario;
import com.bytebank.modelo.Gerente;

public class TestReferencias {
	public static void main(String[] args) {
		Funcionario funcionario = new Gerente();
		funcionario.setNombre("RENE");
		
		Gerente gerente = new Gerente();
		gerente.setNombre("Ximena");
		
		funcionario.setSalario(8000.0);
		gerente.setSalario(100000.0);
		if (gerente.iniciarSesion("12345")) {
			System.out.println("Inicio sesion OK");
		}else {
			System.out.println("No pudo iniciar sesion....");
		};
		System.out.println("Funcionario salario"+funcionario.getSalario());
		System.out.println("Gerente salario"+gerente.getSalario());
		
	}
}
