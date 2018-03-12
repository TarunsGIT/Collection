package in.co.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetCopy {

	public static void main(String[] args) {
		Set<Integer> s = new HashSet<Integer>();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		s.add(6);
		s.add(7);

		Object arr[] = new Object[s.size()];
		arr = s.toArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}

	}

}
