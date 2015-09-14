package io.egemen.src;

public class Main {

	public static void main(String[] args) {

		Employee employee = new Employee("egemen", "io");

		// public, from irrelevant class
		System.out.println(employee.firstName);
		System.out.println(employee.getFullName());

		// protected, from irrelevant class
		// employee.SSN = "123-45-6789"; ERRORR!!

		// public method, from irrelevant class
		employee.setSSN("123-45-6789");

		Developer developer = new Developer("egemen", "io", "Developer");

		// private, from irrelevant class
		// developer.Sex('F'); ERRORR!!

		// public method, from irrelevant class
		developer.setSex('F');
		developer.setSSN("123-45-6789");

		// public methods, from irrelevant class
		System.out.println(developer.getFullNameWithTitle());
		System.out.println(developer.isSSNValid());
		System.out.println(developer.isFemale());
	}
}