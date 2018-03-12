package in.co.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetHL {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(22);
		ts.add(05);
		ts.add(89);
		ts.add(36);
		ts.add(4);
		Iterator<Integer> it = ts.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");

		}
		System.out.println();

		System.out.println("BY DESENDING ITERATOR");
		Iterator<Integer> dts = ts.descendingIterator();
		while (dts.hasNext()) {
			System.out.print(dts.next() + " ");
		}
		System.out.println();
		int j = 5;
		for (int i = 0; i < j; i++) {
			if (i <= j--)
				System.out.print((i * j) + " ");
		}
	}
}
