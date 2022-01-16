package com.BasicJava;

import java.util.Scanner;

public class PrimeNumber {

	public void getPrimeNumber(int userData) {

		for (int i = 2; i < userData; i++) {
			int count = 0;

			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					count = count + 1;
				}
			}

			if (count < 1) {

				System.out.print(i + ",");
			}
		}
	}

	public static void main(String args[]) {

		PrimeNumber pn = new PrimeNumber();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the limit for prime numbers: ");
		pn.getPrimeNumber(scanner.nextInt());
	}
}
