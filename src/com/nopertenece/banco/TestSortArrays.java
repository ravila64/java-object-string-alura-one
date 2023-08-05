package com.nopertenece.banco;

import java.util.Arrays;

public class TestSortArrays {
	public static void main(String[] args) {
		int[] numeros = new int[]{43, 15, 64, 22, 89};
		System.out.println("Array antes de ordenar");
		System.out.println(Arrays.toString(numeros));
		Arrays.sort(numeros); //método utilitário sort
		System.out.println("Array despues de ordenar");
        System.out.println(Arrays.toString(numeros)); //método utilitário toString

        //Salida : [15, 22, 43, 64, 89]

	}
}
