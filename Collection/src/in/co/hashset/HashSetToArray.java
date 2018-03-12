package in.co.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetToArray {

	public static void main(String[] args) {
		HashSet<Integer> s = new HashSet<Integer>();
		// System.out.println(s.size());

		s.add(1);
		s.add(2);
		s.add(null);
		s.add(3);
		s.add(4);
		s.add(5);

		Integer arr[] = new Integer[9];
		

		s.toArray(arr);
		System.out.println("Size " + s.size());
		System.out.println("Set To Array");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
		// System.out.println(arr.length);

		arr[6] = new Integer(5);
		arr[7] = new Integer(6);
		arr[8] = null;
		System.out.println("\n" + "After Adding Two new elements");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}

		for (int i = 0; i < arr.length; i++) {
			s.add(arr[i]);

		}
		System.out.println();
		System.out.println("Size " + s.size());
		
		Iterator<Integer> it = s.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}

	}

}
