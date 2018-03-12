package in.co.set;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetImpl {

	public static void main(String[] args) {
		Set<Integer> s = new LinkedHashSet<Integer>();
		s.add(null);
		s.add(2);
		s.add(5);
		s.add(1);
		s.add(3);
		s.add(4);

		for (Integer obj : s) {
			System.out.println(" " + obj);

		}
		
		
	}

}
