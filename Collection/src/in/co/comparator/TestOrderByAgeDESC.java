package in.co.comparator;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestOrderByAgeDESC {

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
		e2.setAge(49);
		e2.setContact("8080808080");
		
		Employee e3 = new Employee();
		e3.setEmpID("CAPG1003");
		e3.setFirstName("U B Pravin");
		e3.setLastName("RAO");
		e3.setAge(52);
		e3.setContact("8080808080");
		
		Employee e4 = new Employee();
		e4.setEmpID("CAPG1004");
		e4.setFirstName("S D ");
		e4.setLastName("Shibulal");
		e4.setAge(63);
		e4.setContact("8080808080");
		
		
		Employee e5 = new Employee();
		e5.setEmpID("CAPG1005");
		e5.setFirstName("Nandan");
		e5.setLastName("Nilekani");
		e5.setAge(61);
		e5.setContact("8080808080");


		List<Employee> L = new LinkedList<Employee>();

		L.add(e1);
		L.add(e2);
		L.add(e3);
		L.add(e4);
		L.add(e5);

		Collections.sort(L, new OrderByAgeDesc());
		
		Iterator<Employee> it = L.iterator();
		while (it.hasNext()) {

			Employee e = it.next();
			System.out.println(" " + e.getEmpID() + " " + e.getFirstName()
					+ " " + e.getLastName() + " " + e.getAge() + " "
					+ e.getContact());

		}


	}

}
