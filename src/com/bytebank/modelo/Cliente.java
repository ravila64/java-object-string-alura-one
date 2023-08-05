package com.bytebank.modelo;

public class Cliente implements Autenticable{
	private String nombre;
	private String identidad;
	private String profesion;
	private String telefono;
	
	private AutenticacionUtil util;
	
	// private String clave;  eliminar porque nadie la usa
	// ya esta en AutenticacionUtil
	
	/* constructor de AutenticacionUtil */
	
	/* getters and setters-no estan en ultimo cap. 07 de este curso */
	public String getNombre() {
		return nombre;
	}

	// ultimo tema del cap 3 - polimorfismo
	public Cliente() {
		// super();  // lo genero automaticamente el constructor
		this.util = new AutenticacionUtil();
	}

	public String getIdentidad() {
		return identidad;
	}

	public String getProfesion() {
		return profesion;
	}	
	// set Nombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	// Lo genera porqye Autenticable se volvio abstracta
	@Override
	public boolean iniciarSesion(String clave) {
		// TODO se implementa logica de iniciar sesion en cliente
		return this.util.iniciarSesion(clave);
	}

	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		this.util.setClave(clave);
	}
	
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", identidad=" + identidad + ", profesion=" + profesion + ", telefono="
				+ telefono + "]";
	}

// Esto lo coloca al colocar Autenticable como abstract
// es un metodo que no le corresponde por diseño
//	@Override
//	public Double getBonificacion()   return 0.0; 	}
}
