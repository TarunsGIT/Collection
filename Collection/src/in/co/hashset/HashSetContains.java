package in.co.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetContains {

	public static void main(String[] args) {
		Set<Integer> s = new HashSet<Integer>();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);

		boolean flag = s.contains(7);
		System.out.println("contains Element " + flag);

		for (Integer iobj : s) {
			System.out.println(iobj);
		}
	}

}
