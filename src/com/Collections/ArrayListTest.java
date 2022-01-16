package com.Collections;

import java.util.ArrayList;

public class ArrayListTest {

	public void getArrayList(){
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("arun");
		al.add("singh");
		al.add("thakur");
		
		System.out.println(al);
		
		for (String test : al){
			System.out.println(test);
		}
		
	}
	
	public static void main(String args[]){
		
		ArrayListTest alt = new ArrayListTest();
		alt.getArrayList();
		
	}
}
