package com.Collections;

import java.util.*;

public class TestPractice {

	/*
	 * Array1 >> 7,2,10,8,8,2,7 and Array2 >> 7,6,8,10,12 find common in both
	 */

	public void getCommonInteger() {

		int[] arrOne = { 2,7,8,10 };
		int[] arrTwo = { 3,6,7,8,9,9,8,7 };
		
		List<Integer> listCommon = new ArrayList<Integer>();

		for (int i = 0; i < arrOne.length; i++) {
			int count = 0;
			for (int j = 0; j < arrTwo.length; j++) {
					
				if(arrOne[i]==arrTwo[j]){
					count++;
				}
			}
			
			if(count>0){
				listCommon.add(arrOne[i]);
				System.out.println(arrOne[i] + " count " +count);
			}
		}
	}

	public static void main(String[] args) {
		TestPractice rs = new TestPractice();
		rs.getCommonInteger();
	}
}
