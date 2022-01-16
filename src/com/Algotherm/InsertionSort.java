package com.Algotherm;

public class InsertionSort {

	public void getInsertionSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			int temp = 0;

			for (int j = 1; j < i; j++) {

				if (arr[j - 1] > arr[j]) {

					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}
		}
	}

	public void getDisplay(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String args[]) {

		InsertionSort is = new InsertionSort();
		int[] arr = { 5, 6, 3, 89, 22, 56 };
		System.out.println("Before Sorting :");
		is.getDisplay(arr);
		is.getInsertionSort(arr);
		System.out.println("After Sorting :");
		is.getDisplay(arr);
	}
}
