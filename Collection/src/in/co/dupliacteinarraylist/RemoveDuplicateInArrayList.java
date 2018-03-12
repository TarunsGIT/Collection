package in.co.dupliacteinarraylist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateInArrayList {

	public static void main(String[] args) {

		List<Integer> L = new ArrayList<Integer>();

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

		Set<Integer> S = new HashSet<Integer>();

		for (Integer i : L) {

			S.add(i);

		}

		System.out.println("After Removing Duplicate Elements " + S);

		Set<Integer> SET = new HashSet<Integer>();
		SET.addAll(L);
		L.clear();
		L.addAll(SET);
		System.out.println("After Exculding");

		for (Integer elements : L) {
          System.out.print(" " +elements);
		}

	}
}