package com.greatlearning.com.Main;

import java.util.Scanner;

public class Transactions {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		// get the Transactions Size
		System.out.println("Enter the size of transaction array");
		int size = sc.nextInt();

		// Initializing Array for the Transactions.
		int[] transactions = new int[size];

		// Get the Transactions values.
		System.out.println("Enter the values of array");
		for (int i = 0; i < size; i++) {

			transactions[i] = sc.nextInt();
		}

		// Enter the number of targets.

		System.out.println("Enter the total no of targets that needs to be achieved");
		int numTargets = sc.nextInt();

		// loop for number of targets

		for (int i = 0; i < numTargets; i++) {
			// get the target
			System.out.println("Enter the value of target");
			int target = sc.nextInt();

			// again start a loop to calculate the sum
			int sum = 0;
			for (int j = 0; j < transactions.length; j++) {
				// sum till the element
				sum = sum + transactions[j];

				if (sum >= target) {
					System.out.println("Target acheived after " + (j + 1) + " transactions" + "\n");

					break;

				}

				if (j == transactions.length - 1 && sum < target) {

					System.out.println("Target is not reached.");

				}

			}

		}

	}

}
