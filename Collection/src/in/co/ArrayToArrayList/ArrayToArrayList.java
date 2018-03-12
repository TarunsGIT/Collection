package in.co.ArrayToArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayToArrayList {

	public static void main(String[] args) {

		String arr[] = { "Indore", "Mysore", "Hyderabad", "Chennai" };

		List<String> L = new ArrayList<String>(Arrays.asList(arr));
		Iterator<String> it=L.iterator();
		while(it.hasNext()){
			String s=it.next();
			System.out.print(s + " ");
		}

	}
}