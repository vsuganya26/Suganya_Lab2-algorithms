package com.gl.Transactions;

import java.util.Scanner;

public class Targets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int target;

		System.out.println("Enter the size of transaction array");
		int size = sc.nextInt();
		int arr[] = new int[size];

		System.out.println("Enter the values of array");

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter the total no of targets that needs to be achieved");
		int targetNo = sc.nextInt();

		while (targetNo > 0) {
			System.out.println("Enter the target values");
			target = sc.nextInt();

			// Calculate no of transactions
			int transactionCount = getTargetTransactions(arr, target);

			// Check if the target is achieved
			if (transactionCount > 0)
				System.out.println("Target achieved after " + transactionCount + " transactions");
			else
				System.out.println("Given target is not acheived");

			targetNo--;

		}
	}

	static int getTargetTransactions(int[] arr, int target) {
		int sum = 0, steps = 0;

		// Get sum and no of transactions to achieve the target
		for (int i = 0; i < arr.length; i++) {
			steps += 1;
			sum = sum + arr[i];

			// Check target achieved
			if (sum >= target) {
				return steps;
			}
		}
		return 0;
	}

}
	
	

