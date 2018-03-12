package in.co.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetSize {

	public static void main(String[] args) {
		Set<Integer> s = new HashSet<Integer>();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(4);
		s.add(5);
		s.add(6);
		s.add(7);

		System.out.println("SIZE: " + s.size());

		Iterator<Integer> it = s.iterator();
		while (it.hasNext()) {
			System.out.print(" " + it.next());

		}

		System.out.println("\n" + "Alternate Elements");

		Iterator<Integer> iit = s.iterator();
		for (int i = 0; i <= s.size(); i+= 2) {
			System.out.print(" " + iit.next());

		}

	}

}
