package io.egemen.src;

public class Employee {

	public String firstName;
	public String lastName;
	protected String SSN;
	private char sex;

	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getSSN() {
		// protected, from same class
		return SSN;
	}

	public void setSSN(String SSN) {
		// protected, from same class
		this.SSN = SSN;
	}

	public void setSex(char sex) {
		// private, from same class
		this.sex = sex;
	}

	public char getSex() {
		// private, from same class
		return this.sex;
	}

	public String getFullName() {
		// public, from same class
		return this.firstName + " " + this.lastName;
	}
}