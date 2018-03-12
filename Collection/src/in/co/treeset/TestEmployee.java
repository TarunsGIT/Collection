package in.co.treeset;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestEmployee {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.setName("ARUN");
		e1.setSalary(50000);

		Employee e2 = new Employee();
		e2.setName("TARUN");
		e2.setSalary(10000);

		Employee e3 = new Employee();
		e3.setName("ZAKIR");
		e3.setSalary(5000);

		System.out.println("----------------BY NAME---------------");

		Set<Employee> byName = new TreeSet<Employee>(new OrderByName());

		byName.add(e2);
		byName.add(e1);
		byName.add(e3);

		Iterator<Employee> it = byName.iterator();
		while (it.hasNext()) {
			Employee e = it.next();
			System.out.println("NAME: " + e.getName() + " SALARY: "
					+ e.getSalary());
		}

		System.out.println("-----------------BY SALARY-------------------");

		Set<Employee> bySalary = new TreeSet<Employee>(new OrderBySalary());

		bySalary.add(e1);
		bySalary.add(e2);
		bySalary.add(e3);

		Iterator<Employee> it1 = bySalary.iterator();

		while (it1.hasNext()) {

			Employee em = it1.next();
			System.out.println("NAME: " + em.getName() + " SALARY: "
					+ em.getSalary());

		}

	}

}
