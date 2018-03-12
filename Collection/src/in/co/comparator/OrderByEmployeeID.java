package in.co.comparator;

import java.util.Comparator;

public class OrderByEmployeeID implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {

		return e1.getEmpID().compareTo(e2.getEmpID());
	}

}
