package in.co.set;

import java.util.HashSet;

public class HashSetImpl {

	public static void main(String[] args) {

		HashSet<Integer> s = new HashSet<Integer>();
		s.add(null);
		s.add(2);
		s.add(5);
		s.add(1);
		s.add(3);
		s.add(4);
		System.out.println(s.size());

		for (Integer obj : s) {
			System.out.print(" " + obj);

		}
		System.out.println();
		
		System.out.println(s.size());
		for (Integer obj : s) {
			System.out.print(" " + obj);

		}

	}
}
