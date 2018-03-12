package in.co.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateInArray {

	final static public List<Integer> duplicateInArray(int arr[]) {

		int array[] = arr;
		Set<Integer> s = new HashSet<Integer>();
		List<Integer> L = new ArrayList<Integer>();
		for (Integer elements : array) {

			if (!s.add(elements)) {
				L.add(elements);

			}

		}

		return L;

	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		int array[] = { 1, 2, 3, 4, 4, 5, 6, 6, 7, 8, 8, 9, 10, 10 };
		list = DuplicateInArray.duplicateInArray(array);
		for (Integer i : list) {
			System.out.print(i + " ");
		}
	}

}
