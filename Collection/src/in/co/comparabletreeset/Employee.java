package in.co.comparabletreeset;

public class Employee implements Comparable<Employee> {

	private int empdID;
	private String firstName;
	private String lastName;

	public int getEmpdID() {
		return empdID;
	}

	public void setEmpdID(int empdID) {
		this.empdID = empdID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public int compareTo(Employee e) {

		if (this.empdID > e.empdID)
			return -1;
		else if (this.empdID < e.empdID)
			return 1;
		else
			return 0;
	}

}
