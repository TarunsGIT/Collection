package in.co.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestEmployee {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.setFirstName("Tarun");
		e1.setLastName("Jadhav");
		Employee e2 = new Employee();
		e2.setFirstName("Arun");
		e2.setLastName("Jadhav");
		List<Employee> L = new ArrayList<Employee>();
		L.add(e1);
		L.add(e2);

		Collections.sort(L, new OrderByFirstName());

		System.out.println("ORDER BY FIRST NAME");
		Iterator<Employee> it = L.iterator();
		while (it.hasNext()) {
			Employee e = (Employee) it.next();
			System.out.print(" " + e.getFirstName() + " " + e.getLastName());
		}

	}
}