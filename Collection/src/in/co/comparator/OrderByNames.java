package in.co.comparator;

import java.util.Comparator;

public class OrderByNames implements Comparator<Employee> {

	int result;

	@Override
	public int compare(Employee e1, Employee e2) {

		result = e1.getFirstName().compareToIgnoreCase(e2.getFirstName());

		if (result == 0) {
			return e1.getLastName().compareToIgnoreCase(e2.getLastName());

		}

		return e1.getFirstName().compareToIgnoreCase(e2.getFirstName());
	}

}
