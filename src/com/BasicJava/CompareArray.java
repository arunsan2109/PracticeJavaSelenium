package com.BasicJava;

import java.util.Arrays;

public class CompareArray {

	public int arr1[] = { 3, 4, 1, 6, 2 };

	public void compare() {

		Arrays.sort(arr1);
		
		for (int i=0;i<arr1.length;i++){
			
			System.out.println(arr1[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompareArray c1 = new CompareArray();
		c1.compare();
	}

}
