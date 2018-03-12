package in.co.treeset;

import java.util.Comparator;

public class OrderByName implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {

		System.out.println(e1.getName().compareToIgnoreCase(e2.getName()));
		return e1.getName().compareToIgnoreCase(e2.getName());
	}

}
