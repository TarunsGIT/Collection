package in.co.dupliacteinarraylist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class FindDuplicateInArrayList {
	public static void main(String[] args) {
		List<Integer> L = new ArrayList<Integer>();
		List<Integer> DuplicateList = new ArrayList<Integer>();
		L.add(1);
		L.add(2);
		L.add(3);
		L.add(4);
		L.add(4);
		L.add(5);
		L.add(6);
		L.add(6);
		L.add(7);
		L.add(8);
		L.add(9);
		L.add(10);
		L.add(10);

		Set<Integer> s = new HashSet<Integer>();

		for (Integer elements : L) {
			if (!s.add(elements)) {
				DuplicateList.add(elements);
				System.out.println(elements);

			}

		}

		Iterator<Integer> it = DuplicateList.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}

	}

}
