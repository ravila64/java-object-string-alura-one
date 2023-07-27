package com.bytebank.test;

import java.util.Iterator;

public class TestFormaLiteralArrays {
	public static void main(String[] args) {
		int[] numeros = new int[6];
		numeros[0] = 1;
		numeros[1] = 2;
		numeros[2] = 3;
		numeros[3] = 4;
		numeros[4] = 5;
		int[] refs = {1,2,3,4,5};
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		System.out.println("-----------------");
		for (int i = 0; i < refs.length; i++) {
			System.out.println(refs[i]);
		}
	}
}
