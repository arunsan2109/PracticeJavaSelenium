package com.BasicJava;

import java.util.ArrayList;

public class ArrayPractice {

	public void getArrayPractice(){
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add(0, "23");
		arrayList.add(1, "1");
		arrayList.add(2, "5");
		
		for (String list: arrayList){
			
			System.out.println(list);
		}
	}
	
	public static void main(String args[]){
		
		ArrayPractice ap = new ArrayPractice();
		ap.getArrayPractice();
	}
}
