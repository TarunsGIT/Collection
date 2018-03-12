package in.co.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestOrderByNames {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.setFirstName("Tarun");
		e1.setLastName("Jadhav");
		Employee e2 = new Employee();
		e2.setFirstName("tarun");
		e2.setLastName("adhav");
		List<Employee> L = new ArrayList<Employee>();
		L.add(e1);
		L.add(e2);
		Collections.sort(L, new OrderByNames());

		Iterator<Employee> it = L.iterator();
		while (it.hasNext()) {
			Employee e = it.next();
			System.out.println(e.getFirstName() + " " + e.getLastName());
		}

	}

}
