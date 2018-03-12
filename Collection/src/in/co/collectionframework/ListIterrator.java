package in.co.collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ListIterrator {

	public static void main(String[] args) {

		List<Integer> L = new ArrayList<Integer>();
		L.add(85);
		L.add(45);
		L.add(87);
		L.add(78);
		L.add(63);
		L.add(20);
		L.add(23);
		L.add(2);
		ListIterator<Integer> it = L.listIterator();
		System.out.println("::FORWARD::");
		while (it.hasNext()) {
			Integer i = it.next();
			//it.set(34);
			System.out.println(" INDEXS: " + it.nextIndex() + " VALUES " + i);

		}

		it.add(100);
		Collections.sort(L);

		System.out.println("::BACKWARD::");
		while (it.hasPrevious()) {
			Integer i = it.previous();
			System.out.println(i);

		}

	}

}
