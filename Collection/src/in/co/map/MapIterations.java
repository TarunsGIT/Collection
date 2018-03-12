package in.co.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapIterations {

	public static void main(String[] args) {
		HashMap<Integer, String> m = new HashMap<Integer, String>();

		m.put(1, "One");
		m.put(2, "Two");
		m.put(3, "Three");
		m.put(4, "Four");
		m.put(5, "Five");
		// m.put(null, "Six");
		// BY FOR EACH
		for (int i : m.keySet()) {

			System.out.print(i + " : " + m.get(i) + " ");

		}
		System.out.println("\n");
		// BY ITERATOR

		Set<Integer> s = m.keySet();

		Iterator<Integer> it = s.iterator();
		while (it.hasNext()) {
			Integer keys = it.next();
			System.out.print(keys + " : " + m.get(keys) + " ");

		}

		System.out.println("\n" + "KEYS");
		for (Integer i : m.keySet()) {
			System.out.print(i + " ");

		}
		System.out.println("\n" + "VALUES");

		for (String str : m.values()) {
			System.out.print(str + " ");

		}
		System.out.println();
		System.out.println("\n" + "BY MAP ENTRY OBJECT");

		Set<Map.Entry<Integer, String>> entrySet = m.entrySet();
		for (Entry<Integer, String> entry : entrySet) {

			System.out.print(entry.getKey() + " : " + entry.getValue() + " ");

		}

		int a1 = 5;
		double a2 = (float) a1;
		System.out.println(12>>2);

	}

}
