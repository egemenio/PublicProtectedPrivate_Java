package io.egemen.src;

public class Developer extends Employee {

	public String title;

	public Developer(String firstName, String lastName, String title) {
		super(firstName, lastName);
		this.title = title;
	}

	public String getFullNameWithTitle() {
		// public, from child class
		return this.firstName + " " + this.lastName + ", " + this.title;
	}

	public boolean isSSNValid() {
		// protected, from child class
		return SSN != null && SSN.length() == 11;
	}

	public boolean isFemale() {
		// private from child class
		// return sex == 'F'; ERROR!!!

		// public method, from child class
		return getSex() == 'F';
	}
}
