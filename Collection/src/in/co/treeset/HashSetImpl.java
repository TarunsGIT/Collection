package in.co.treeset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetImpl {

	public static void main(String[] args) {
		Set<Integer> s = new HashSet<Integer>(5);
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(3);
		s.add(4);
		
		if(s.contains(5)){
			System.out.println("Present"+"5");
		}
		
		if(s.contains(4)){
			System.out.println("Present"+"4");
		}

		Iterator it = s.iterator();
		while (it.hasNext()) {
			Integer value = (Integer) it.next();
			System.out.println(value);

		}

	}

}
