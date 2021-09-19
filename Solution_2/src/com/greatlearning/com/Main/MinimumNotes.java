package com.greatlearning.com.Main;

import java.util.Scanner;

public class MinimumNotes {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {

		System.out.println("Enter the size of currency denominations");
		int size = sc.nextInt();

		int[] Notes = new int[size];
		int[] NumNotes = new int[size];

		System.out.println("Enter the currency denominations value : ");
		for (int i = 0; i < size; i++) {

			Notes[i] = sc.nextInt();
		}

		MergeSortImplementation ms = new MergeSortImplementation();
		ms.sort(Notes, 0, Notes.length - 1);

		// To check the Sorting Output

		/*
		 * for (int i = 0; i < size; i++) {
		 * 
		 * System.out.println(Notes[i]); }
		 */

		System.out.println("Enter the amount you want to pay ");
		int Amount = sc.nextInt();

		for (int i = 0; i <= Notes.length - 1; i++) {

			int NotesCount = (Amount / Notes[i]);
			NumNotes[i] = NotesCount;

			Amount = Amount - (NotesCount * Notes[i]);

			if (i == Notes.length - 1 && Amount != 0) {
				System.out.println("Not possible to pay with the exact given denominations.");
			}

			else if (i == Notes.length - 1 && Amount == 0) {
				System.out.println("Your payment approach in order to give min no of notes will be");
				for (int j = 0; j < NumNotes.length; j++) {
					if (NumNotes[j] > 0) {
						System.out.println(Notes[j] + ":" + NumNotes[j]);
					}

				}
			}

		}
	}

}
