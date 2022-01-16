package com.BasicJava;

public class CharToArray {
	
	char[] cCarMake = {'A','R','U','N'};
	String sCarMake = String.valueOf(cCarMake);
	String sCarMakeOne = new String(cCarMake);
	
	char cTest = 'A';
	String sString = Character.toString(cTest);
	
	public void getChange(){
		
		
		System.out.println(cCarMake);
		System.out.println(sCarMake);
		System.out.println(sCarMakeOne);
		System.out.println(cTest);
	}
	
	public static void main(String[] args){
		
		CharToArray charToArray = new CharToArray();
		charToArray.getChange();
	}
}
