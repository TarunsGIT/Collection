package in.co.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetRemove {

	public static void main(String[] args) {
		Set<Integer> s = new HashSet<Integer>();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		s.add(6);
		s.add(7);
		System.out.println(s);
		System.out.println("SIZE " + s.size());
		boolean flag = s.remove(6);
		System.out.println(flag);
		System.out.println(s);
		System.out.println("R SIZE " + s.size());
	}

}
