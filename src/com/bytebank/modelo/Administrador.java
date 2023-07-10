package com.bytebank.modelo;

public class Administrador extends Funcionario implements Autenticable {

	//private String clave;
	private AutenticacionUtil util;
	
	public Administrador() {
		this.util = new AutenticacionUtil();
	}

	@Override
	public Double getBonificacion() {
		// TODO Auto-generated method stub
		return 0.0;  // coloco this.salario; // para gerente
	}

	// clase Autenticable abstracta
	@Override
	public boolean iniciarSesion(String clave) {
		// TODO se implementa logica de iniciar sesion en Administrador
		return this.util.iniciarSesion(clave);
	}

	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		this.util.setClave(clave);
	}
}
