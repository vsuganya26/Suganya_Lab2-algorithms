package com.gl.main;

import java.util.Scanner;

import com.gl.services.SortCurrency;

public class Main {

	public static void main(String[] args) {

		NotesCount nc = new NotesCount();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations : ");
		int size = sc.nextInt();

		int[] currency = new int[size];
		System.out.println("Enter the currency denominations values : ");

		for (int i = 0; i < size; i++) {
			currency[i] = sc.nextInt();
		}

		// Get the amount to be paid from user
		System.out.println("Enter the amount you want to pay : ");

		int amount = sc.nextInt();

		// Sort Denomination in descending order
		SortCurrency sd = new SortCurrency();
		sd.sort(currency, 0, currency.length - 1);
		nc.notesCountCalculator(currency, amount);
	}
}
