package in.co.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapToArrayList {
	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(522601, "IBM");
		map.put(522602, "INFOSYS");
		map.put(522603, "TCS");
		map.put(522604, "AMAZON");

		LinkedList<Integer> keyList = new LinkedList<Integer>(map.keySet());
		System.out.println("KEYLIST -->");
		for (Integer keys : keyList) {
			System.out.print(keys + " ");

		}
		System.out.println("\n" + "VALUE LIST -->");

		LinkedList<String> valueList = new LinkedList<String>(map.values());

		for (String values : valueList) {
			System.out.print(values + " ");

		}

		System.out.println("\n"+"KEY-VALUE PAIR -->");

		List<Entry<Integer, String>> keyValueList = new ArrayList<Map.Entry<Integer, String>>(
				map.entrySet());

		for (Entry<Integer, String> kvL : keyValueList) {
			System.out.print(kvL + " " );

		}

	}

}
