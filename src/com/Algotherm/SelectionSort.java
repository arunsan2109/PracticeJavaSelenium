package com.Algotherm;

public class SelectionSort {

	public void getSelectionSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			int index = i, temp = 0;

			for (int j = 0; j < arr.length; j++) {

				if (arr[index] < arr[j]) {

					temp = arr[index];
					arr[index] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public void getDisplay(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] +" ");
		}
		System.out.println();
	}

	public static void main(String args[]) {

		SelectionSort ss = new SelectionSort();
		int[] arr = { 5, 6, 3, 89, 22, 56 };
		System.out.println("Before Sort :");
		ss.getDisplay(arr);
		ss.getSelectionSort(arr);
		System.out.println("After Sort");
		ss.getDisplay(arr);
	}
}
