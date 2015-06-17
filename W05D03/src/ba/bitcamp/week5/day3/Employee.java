package ba.bitcamp.week5.day3;

public class Employee {

	protected String name;
	protected String gender;
	public Employee(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}

	public String toString() {
		return "Employee class: " + name + " " + gender;
	}
	
	
	
}
