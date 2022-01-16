package com.SearchingProgram;

public class LinearSearch {

	public void getSearch(int[] arr, int key) {

		int found = 0, j = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == key) {
				j=i;
				found++;
			}
		}

		if (found >= 1) {
			System.out.println("Element is in the Array " +j);
		} else
			System.out.println("Element is not in the Array " );

	}

	public static void main(String args[]) {

		LinearSearch is = new LinearSearch();
		int[] arr = { 5, 6, 3, 89, 22, 56 };
		is.getSearch(arr, 89);
	}
}
