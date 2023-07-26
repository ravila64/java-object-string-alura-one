package com.bytebank.test;
import java.lang.String;

import com.bytebank.modelo.banco.CuentaAhorros;
import com.bytebank.modelo.banco.CuentaCorriente; 

public class TestString {
	public static void main(String[] args) {
		String nom="Alura";
		// No utilizada en el mundo real
		//String nom2=new String("Alura");
		System.out.println("Antes de metodo replace "+nom);
		nom=nom.replace("A", "E");
		System.out.println("Despues de metodo replace "+nom);
		nom=nom.replace("E", "A");
		nom=nom.concat(" Cursos Online");
		System.out.println("Despues de metodo concatenar "+nom);
		nom=nom.toUpperCase();
		System.out.println("Despues todo a mayusculas con metodo "+nom);
		nom=nom.toLowerCase();
		System.out.println("Despues todo a minusculas "+nom);
		char letra = nom.charAt(3);
		System.out.println("Despues todo a mayusculas "+letra);
		int ind = nom.indexOf(letra);
		System.out.println("Posicion letra "+letra+" es "+ind);
		String nombre = "Mario";
		nombre = nombre.replace('o', 'a');
		System.out.println(nombre);
		for(int i = 0; i < nombre.length(); i++) {
		    System.out.println(nombre.charAt(i));
		}
		if (!nombre.isEmpty()) {
			System.out.println(" nombre "+nombre+" no esta vacio");
		}else {
			System.out.println(" nombre "+nombre+" Esta vacio");
		}
		if (nombre.contains("a")) {
			System.out.println(" nombre "+nombre+" contiene letra [a]");
		}
		// definir obj Object
		Object cuenta = new CuentaCorriente(500, 555);
		System.out.println(cuenta.toString());
		// pruebas para printLine() con sobrecarga
		printLine(nombre);
		printLine(nombre.length());
		printLine(nombre.charAt(0));
		printLine(new CuentaAhorros(500, 100));
	}
	
	// resume todos las clases abajo definidas
	// hace que se envie cualquier tipo en parametro, 
	// y lo toma segun si es String, int, double, char, boolean etc
	public static void printLine(Object  valor) {
		System.out.println(valor);
	}
//	public static void printLine(String valor) {
//		System.out.println(valor);
//	}
//	// sobrecargar metodo
//	public static void printLine(int valor) {
//		System.out.println(valor);
//	}
//	// sobrecarga tipo char
//	public static void printLine(char valor) {
//		System.out.println(valor);
//	}
	
}
