package in.co.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Employee implements Comparable<Employee> {

	private long empID;
	private String firstName;
	private String lastName;
	private String emailID;

	public Employee(long empID, String firstName, String lastName,
			String emailID) {
		this.empID = empID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailID = emailID;

	}

	@Override
	public int compareTo(Employee e) {
		if (empID > e.empID) {

			return 1;

		} else if (empID < e.empID) {
			return -1;

		} else if (empID == e.empID) {

			int compare;
			compare = firstName.compareTo(e.firstName);
			if (compare == 0) {
				compare = lastName.compareTo(e.lastName);
				return compare;
			}

		}
		return 0;
	}

	public static void main(String[] args) {

		Employee e = new Employee(101, "Tarun", "Jadhav", "Tarun@gmail.com");
		Employee e1 = new Employee(101, "Tarun", "Andhav", "Arun@gmail.com");
		Employee e2 = new Employee(100, "Tarun Sagar", "Jadhav",
				"TarunSagar@gmail.com");
		List<Employee> L = new ArrayList<Employee>();

		L.add(e);
		L.add(e1);
		L.add(e2);

		Collections.sort(L);

		Iterator<Employee> it = L.iterator();
		while (it.hasNext()) {
			Employee out = it.next();
			System.out.print(out.empID + "\t");
			System.out.print(out.firstName + "\t");
			System.out.print(out.lastName + "\t");
			System.out.print(out.emailID);
			System.out.println();

		}

	}

}
