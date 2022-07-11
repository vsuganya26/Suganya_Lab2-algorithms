package com.gl.main;

import java.util.Arrays;

public class NotesCount {

	public int notesCountCalculator(int currency[], int amount) {

		int size = currency.length;
		boolean flag = false;

		int[] currencyCount = new int[size];

		try {
			while (size > 0) {
				for (int i = 0; i < size; i++) {

					if (amount >= currency[i]) {
						currencyCount[i] = amount / currency[i];
						amount = amount - currencyCount[i] * currency[i];
					}

				}
				if (amount != 0) {
					// Remove 1st denomination from the array
					currency = Arrays.copyOfRange(currency, 1, size);
					size--;
					continue;

				} else {
					flag = true;
					break;
				}
			}

			if (flag == false) {
				System.out.println("Given amount is not achievable with given denominations.");
			}
			else {
				// Display the denomination with count
				System.out.println("Your payment approach in order to give min no of notes will be : ");
				for (int i = 0; i < currency.length; i++) {
					if (currencyCount[i] > 0)
						System.out.println(currency[i] + " : " + currencyCount[i]);
				}
			}

		} catch (Exception ex) {
			System.out.println("Exception " + ex);
		}
		
		return amount;

	}
}
