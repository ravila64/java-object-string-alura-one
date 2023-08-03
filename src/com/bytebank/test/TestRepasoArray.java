package com.bytebank.test;

import java.util.ArrayList;
import java.util.List;

public class TestRepasoArray {
 public static void main(String[] args) {
	int[] numeros = new int[10];
	int num=40;
	Integer numObj = new Integer(num);
	List<Integer> lista = new ArrayList<>();
	// primitivo != object
	lista.add(num); // autoboxing
	//lista.add(new Integer(num)); ejecuta autoboxing
	lista.add(numObj);
	
 }
}
