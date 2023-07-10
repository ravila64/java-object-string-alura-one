package com.bytebank.modelo;

public class Contador extends Funcionario{
	@Override  // Kay un metodo abstracto en funcionario
	public Double getBonificacion(){
		return 200.0;
	}
}
