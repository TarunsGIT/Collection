package in.co.comparator;

import java.util.Comparator;

public class OrderByEmpIDDESC implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {

		return e2.getEmpID().compareTo(e1.getEmpID());
	}

}
