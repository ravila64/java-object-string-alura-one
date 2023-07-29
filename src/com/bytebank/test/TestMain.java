package com.bytebank.test;

public class TestMain {

	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		int edad1=20;
		int edad2=15;
		int edad3=67;
		// quiero agruparlos
		int[] edades=new int[5];
		edades[0]=20;
		edades[1]=15;
		edades[2]=67;
		System.out.println(edades[2]);
		System.out.println(edades[0]);
		System.out.println(edades[4]);
		for (int i = 0; i < edades.length; i++) {
			System.out.println("Pos "+i+" Valor "+edades[i]);
		}
		System.out.println("longitud arreglo "+edades.length);

	}

}
