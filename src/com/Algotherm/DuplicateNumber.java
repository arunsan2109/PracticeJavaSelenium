package com.Algotherm;

import java.util.Arrays;

public class DuplicateNumber {

	public void getDuplicateNumber(int[] arr) {

		System.out.println("Sorted Array is :");
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {

			int count = 0;
			for (int j = 0; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					count++;
				}

			}
			if (count > 1) {

				System.out.println("This is duplicate Number :" + arr[i]);
			}
		}

	}

	public static void main(String args[]) {

		DuplicateNumber dn = new DuplicateNumber();
		int[] arr = { 5, 6, 3, 89, 22, 22, 5, 56, 22 };
		Arrays.sort(arr);
		dn.getDuplicateNumber(arr);
	}
}
