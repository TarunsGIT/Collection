package in.co.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetToArrayList {

	public static void main(String[] args) {
		HashSet<Integer> HS = new HashSet<Integer>();
		HS.add(1);
		HS.add(5);
		HS.add(3);
		HS.add(2);
		HS.add(4);
		HS.add(null);
		System.out.println("Hash Set");

		for (Object obj : HS) {
			System.out.print(obj + " ");

		}
		

		System.out.println("\n" + "Array List");

		List<Integer> L = new ArrayList<Integer>(HS);
		for (Object obj : L) {
			System.out.print(obj + " ");

		}

	}

}
