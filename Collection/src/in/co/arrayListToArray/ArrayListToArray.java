package in.co.arrayListToArray;

import java.util.ArrayList;
import java.util.List;

public class ArrayListToArray {
	public static void main(String[] args) {
		List<Integer> L = new ArrayList<Integer>();
		L.add(1);
		L.add(2);
		L.add(3);
		L.add(4);
		L.add(4);
		L.add(5);
		L.add(6);
		L.add(6);
		L.add(7);
		L.add(8);
		L.add(9);
		L.add(10);
		L.add(10);

		int arr[] = new int[L.size()];

		for (int i = 0; i < L.size(); i++) {

			arr[i] = L.get(i);

		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
	}

}
