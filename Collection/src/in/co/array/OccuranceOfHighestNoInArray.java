package in.co.array;

import java.util.Scanner;

public class OccuranceOfHighestNoInArray {

	public static void main(String[] args) {
		int n;
		int[] arr;

		Scanner in = new Scanner(System.in);
		System.out.println("Enter Length of Array");
		n = in.nextInt();
		arr = new int[n];
		System.out.println("Enter Elements in array");
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}

		int greatest = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > greatest) {
				greatest = arr[i];
			}

		}
		System.out.println("Greatest Number " + greatest);

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (greatest == arr[i]) {
				count++;
			}

		}

		System.out.println("Number of Occurance of " + greatest + ":" + count
				+ " times");
		
		in.close();
	}

}
