package com.bytebank.test;

public class TestWrappers {
	public static void main(String[] args) {
		// esto funciona
		Integer ref = Integer.valueOf("3");
        ref++;
        System.out.println(ref);
        // wrappers
        Double numDouble = 33.0; // autoboxing
        Boolean verd=true;		// autoboxing
        Double numD2= Double.valueOf(33);
        System.out.println(numD2);
        String numStr = "57"; // autobox
        String numStr2 = new String("57");
        Double strToDouble = Double.valueOf(numStr);
        Integer strToInt = Integer.valueOf(numStr);
        System.out.println(strToDouble);
        System.out.println(strToInt);
        
        Number num = Integer.valueOf(5);
        System.out.println(num);
        Double doubNumPrimitivo=num.doubleValue()+100;
        System.out.println(doubNumPrimitivo);
        
        Boolean falso = Boolean.FALSE;
        
	}
}
