package com.Algotherm;

import java.util.Scanner;

public class LargestInArray {

	public void getLargestNumberInArray(int[] arr, int key) {

		for (int i = 0; i < arr.length; i++) {

			int temp = 0;
			
			for (int j = 1; j < arr.length; j++) {

				if (arr[j-1] < arr [j]){
					
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("Array is :");
		for (int i=0;i<arr.length;i++){
			
			System.out.print(arr[i] +" ");
		}
		
		System.out.println("\n" +key +" Largest is :" +arr[key-1]);
	}

	@SuppressWarnings("resource")
	public static void main(String args[]) {

		LargestInArray lia = new LargestInArray();
		int[] arr = { 5, 6, 3, 89, 22, 56 };
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter What Largest Number want to see :");
		int n = scanner.nextInt();
		lia.getLargestNumberInArray(arr, n);
	}
}
