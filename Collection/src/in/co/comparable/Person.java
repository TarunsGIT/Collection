package in.co.comparable;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Person implements Comparable<Person> {

	private String firstName;
	private String lastName;

	Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;

	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
	public int compareTo(Person p) {
		int compare;
		compare = firstName.compareToIgnoreCase(p.firstName);
		return (compare != 0 ? compare : lastName.compareToIgnoreCase(p.lastName));
	}

	public static void main(String[] args) {
		Person p = new Person("Tarun", "Jadhav");
		Person p1 = new Person("Arun", "Jadhav");
		Person p2 = new Person("Tarun", "Adiwal");
		List<Person> L = new LinkedList<Person>();
		L.add(p);
		L.add(p2);
		L.add(p1);

		System.out.println("Before Sorting");

		for (Person o : L) {
			System.out.println(o.getFirstName() + " " + o.getLastName());
		}

		System.out.println("\n" + "After Sorting");

		Collections.sort(L);
		Iterator<Person> it = L.iterator();
		while (it.hasNext()) {
			Person elements = it.next();

			System.out.println(elements.firstName + " " + elements.lastName);

		}

	}
}
