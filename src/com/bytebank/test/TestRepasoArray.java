package com.bytebank.test;

import java.util.ArrayList;
import java.util.List;

public class TestRepasoArray {
 public static void main(String[] args) {
	int[] numeros = new int[10];
	int num=40;
	// cuando esta tachado es deprecated, no usarlo mas
	// ejemplo integer
	// WRAPPER
	//Integer numObj = new Integer(num);
	Integer numObj = Integer.valueOf(num);
	List<Integer> lista = new ArrayList<>();
	// primitivo != object
	lista.add(num); // autoboxing
	//lista.add(new Integer(num)); ejecuta autoboxing
	lista.add(Integer.valueOf(50));
	lista.add(numObj);
	// unboxing
	//int vrPrimitivo = numObj;
	int vrPrimitivo = numObj.intValue();
	System.out.println(vrPrimitivo);
	byte numbyte = numObj.byteValue();
	System.out.println("Byte "+numbyte);
	double numdouble = numObj.doubleValue();
	System.out.println("Double "+numdouble);
	float numfloat = numObj.floatValue();
	System.out.println("Float "+numfloat);
	
	// maximo valor que acepta
	System.out.println(numObj.MAX_VALUE);
	System.out.println(Integer.MAX_VALUE);
	System.out.println(Integer.MIN_VALUE);
	// Tamaño bITES
	System.out.println(Integer.SIZE);
	// bytes
	System.out.println(Integer.BYTES);
	
 }
}
