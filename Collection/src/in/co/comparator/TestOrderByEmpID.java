package in.co.comparator;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestOrderByEmpID {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setEmpID("CAPG1001");
		e1.setFirstName("SALIL");
		e1.setLastName("PAREEKH");
		e1.setAge(50);
		e1.setContact("8080808080");

		Employee e2 = new Employee();
		e2.setEmpID("CAPG1002");
		e2.setFirstName("VISHAL");
		e2.setLastName("SIKKA");
		e2.setAge(40);
		e2.setContact("8319836945");

		List<Employee> L = new LinkedList<Employee>();

		L.add(e1);
		L.add(e2);

		/*Collections.sort(L, new OrderByEmployeeID());*/
		Collections.sort(L, new OrderByEmpIDDESC());

		Iterator<Employee> it = L.iterator();
		while (it.hasNext()) {

			Employee e = it.next();
			System.out.println(" " + e.getEmpID() + " " + e.getFirstName()
					+ " " + e.getLastName() + " " + e.getAge() + " "
					+ e.getContact());

		}

	}

}
