package com.BasicJava;

public class Switch {

	static int a = 5;
	static int b = 6;
	public static void main(String args[]){
		
		b= a+b;
		a= b-a;
		b= b-a;
		System.out.println("a is " +a +" and " +"b is " +b);
	}
}
