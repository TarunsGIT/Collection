package in.co.sortarray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortArrayUsingCollection {

	public static void main(String[] args) {

		int arr[];
		int n;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Size Of Array");
		n = in.nextInt();
		arr = new int[n];
		System.out.println("Enter Elements in Array");

		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();

		}

		ArrayList<Integer> L = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			L.add(arr[i]);

		}
		Collections.sort(L);

		for (int i = 0; i < L.size(); i++) {
			arr[i] = L.get(i);

		}

		System.out.println("Sorted Array");

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");

		}

	}
}
