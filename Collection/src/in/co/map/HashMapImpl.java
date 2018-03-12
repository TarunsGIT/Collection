package in.co.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapImpl {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(3, "three");
		map.put(1, "one");
		map.put(2, "two");
		map.put(null, null);
		map.put(1, "four");

		System.out.println("--------------USING FOR EACH--------------");
		for (Integer keys : map.keySet()) {

			System.out.println("KEYS: " + keys + " VALUES: " + map.get(keys));

		}

		/* USING INTERATOR */
		System.out.println("--------------USING ITERATOR--------------");
		Set<Integer> keySet = map.keySet();
		Iterator<Integer> it = keySet.iterator();

		while (it.hasNext()) {
			Integer key = it.next();
			System.out.println("KEYS: " + key + " VALUES: " + map.get(key));

		}

		System.out.println("--------KEYSET--------");

		for (Integer keys : map.keySet()) {
			System.out.println("KEYS " + keys);

		}

		System.out.println("----------VALUES--------");

		for (String values : map.values()) {
			System.out.println("VALUES: " + values);

		}

		System.out.println("-----------KEY-VALUE PAIR---------");

		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
		for (Entry entry : entrySet) {
			System.out.println("KEYS: " + entry.getKey() + " VALUES: "
					+ entry.getValue());

		}

	}
}
