package in.co.treeset;

import java.util.Comparator;

public class OrderBySalary implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		if (e1.getSalary() > e2.getSalary()) {
			return 1;

		} else {
			return -1;
		}
	}

}
