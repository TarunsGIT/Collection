package in.co.map;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableImpl {
	public static void main(String[] args) {
		Map<Integer, String> map = new Hashtable<Integer, String>();

		map.put(1, "One");
		map.put(3, "two");
		map.put(5, "Five");
		map.put(4, "four");

		for (Integer keys : map.keySet()) {

			System.out.println("KEYS: " + keys + "VALUES " + map.get(keys));

		}

		System.out.println("---------USING ITERATOR---------");

		Set<Integer> keySet = map.keySet();
		Iterator<Integer> it = keySet.iterator();

		while (it.hasNext()) {
			Integer key = it.next();
			System.out.println("KEYS: " + key + " VALUES: " + map.get(key));

		}

		System.out.println("----------KEYS--------------");

		for (Integer keys : map.keySet()) {

			System.out.println("KEYS " + keys);

		}

		System.out.println("------------VALUES----------");

		for (String values : map.values()) {
			System.out.println("VLAUES " + values);

		}

		System.out.println("-------KEYS-VALUES------");

		Set<Map.Entry<Integer, String>> entryset = map.entrySet();

		for (Entry entry : entryset) {

			System.out.println("KEYS: " + entry.getKey() + "VALUES: "
					+ entry.getValue());

		}

	}

}
