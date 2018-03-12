package in.co.comparabletreeset;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestEmployeeUTreeset {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setEmpdID(1001);
		e1.setFirstName("CS");
		e1.setLastName("Chandrashekhar Rao");

		Employee e2 = new Employee();
		e2.setEmpdID(1000);
		e2.setFirstName("Salil");
		e2.setLastName("Parkih");

		Set<Employee> TS = new TreeSet<Employee>();
		TS.add(e1);
		TS.add(e2);
		
		

		Iterator<Employee> it = TS.iterator();

		while (it.hasNext()) {
			Employee e = it.next();
			System.out.println(e.getEmpdID() + " " + e.getFirstName() + " "
					+ e.getLastName());
		}

	}

}
