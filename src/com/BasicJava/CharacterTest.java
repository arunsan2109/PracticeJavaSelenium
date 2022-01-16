package com.BasicJava;

public class CharacterTest {
	
static char[] cTest = {'a','r','u','n'};
	
	public void CharToString(char x){
		
		String y = Character.toString(x).toUpperCase();
		System.out.println("CharToString : " +y);
	}
	
	public void CharToString(char[] x){
		
		String z = new String(x);
		System.out.println(z);
	}
	
	public void StringToCharArray(String x){
		
		char[] cTest = x.toCharArray();
		System.out.println(cTest);
	}
	
	public void StringToChar(String y){
		
		char cTest = y.charAt(0);
		System.out.println("StringToChar : " +cTest);
	}
	
	public static void main(String args[]){
		
		CharacterTest ct = new CharacterTest();
		ct.CharToString('g');
		ct.CharToString(cTest);
		ct.StringToCharArray("singh");
		ct.StringToChar("arun");
	}

}
