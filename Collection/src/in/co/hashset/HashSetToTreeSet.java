package in.co.hashset;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetToTreeSet {
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

		System.out.println("\n" + "Tree Set");

		TreeSet<Integer> TS = new TreeSet<Integer>(HS);
       
		for (Object obj : TS) {
			System.out.print(obj + " ");

		}

	}

}
