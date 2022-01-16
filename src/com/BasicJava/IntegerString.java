package com.BasicJava;

public class IntegerString {
	
	public void stringToInteger(String x){
		
		int iTest = Integer.parseInt(x);
		System.out.println("Integer is: " +iTest);
	}
	
	public void integerToString(int y){
		
		String sTest = Integer.toString(y);
		System.out.println("String is: " +sTest);
		
	}
	
	public static void main(String args[]){
		
		IntegerString is = new IntegerString();
		is.stringToInteger("65");
		is.integerToString(67);
	}

}
