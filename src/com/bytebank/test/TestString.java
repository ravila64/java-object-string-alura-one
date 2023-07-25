package com.bytebank.test;
import java.lang.String; 

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
		System.out.println("Despues todo a maysuculas "+letra);
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

	}
	
}
