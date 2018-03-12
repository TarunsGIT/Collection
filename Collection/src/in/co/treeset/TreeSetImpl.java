package in.co.treeset;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetImpl {

	public static void main(String[] args) {

		Set<Integer> s = new TreeSet<Integer>();

		s.add(1);
		s.add(10);
		s.add(2);
		s.add(9);
		s.add(3);
		s.add(8);
		s.add(4);
		s.add(7);
		s.add(5);
		s.add(6);

		Iterator<Integer> it = s.iterator();
		while (it.hasNext()) {
			int i = it.next();
			System.out.println(i);
		}

	}

}
