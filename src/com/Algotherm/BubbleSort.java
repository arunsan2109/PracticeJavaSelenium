package com.Algotherm;

public class BubbleSort {

	public void getBubbleShot(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			int temp = 0;

			for (int j = 1; j < arr.length; j++) {

				if (arr[j] < arr[j - 1]) {

					temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
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

		BubbleSort bs = new BubbleSort();
		int[] arr = { 5, 6, 3, 89, 22, 56 };
		System.out.println("Before Sort :");
		bs.getDisplay(arr);
		bs.getBubbleShot(arr);
		System.out.println("After Sort :");
		bs.getDisplay(arr);
	}
}
