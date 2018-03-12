package in.co.hashset;

import java.util.HashSet;

public class HashSetClone {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		HashSet<Integer> s = new HashSet<Integer>();

		HashSet<Integer> s1 = new HashSet<Integer>();

		s.add(1);
		s.add(2);
		s.add(null);
		s.add(3);
		s.add(4);
		s.add(5);

		System.out.println(s);

		s1 = (HashSet<Integer>) s.clone();
		s1.remove(null);
		System.out.println(s1);

	}

}
