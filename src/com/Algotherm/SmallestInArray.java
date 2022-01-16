package com.Algotherm;
import java.util.Scanner;

public class SmallestInArray {

	public void getSmallestInArray(int[] arr, int key) {

		for (int i = 0; i < arr.length; i++) {

			int temp;

			for (int j = 1; j < arr.length; j++) {

				if (arr[j - 1] > arr[j]) {

					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("Array is :");
		for (int i = 0; i<arr.length; i++){
			
			System.out.print(arr[i] +" ");
		}
		
		System.out.println("\n" +key +" smallest Number is :" +arr[key-1]);
	}

	@SuppressWarnings("resource")
	public static void main(String args[]) {

		SmallestInArray sia = new SmallestInArray();
		int[] arr = { 5, 6, 3, 89, 22, 56 };
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter what smallest number want to see :");
		int key = scanner.nextInt();
		sia.getSmallestInArray(arr, key);
	}
}
