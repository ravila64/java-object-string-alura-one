package com.bytebank.modelo;

public class ControlBonificacion {
	private Double suma=0.0;
	public Double RegistrarSalario(Funcionario funcionario) {
		this.suma = funcionario.getBonificacion()+this.suma;
		System.out.println("Suma actual F:"+this.suma);
		return this.suma;
	}

	public Double getSuma() {
		return suma;
	}
}
