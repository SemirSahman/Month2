package ba.bitcamp.test;

public class Employee implements Searchable {

	// Variables

	private String name;
	private int year;
	private int salary;
	private String gender;

	// Getters and Setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	// ****************************************

	/**
	 * Employee constructor
	 * 
	 * @param name
	 *            name of Employee
	 * @param year
	 *            year of Employee
	 * @param salary
	 *            salary of Employee
	 * @param gender
	 *            gender of Employee
	 */

	public Employee(String name, int year, int salary, String gender) {
		super();
		this.name = name;
		this.year = year;
		this.salary = salary;
		this.gender = gender;
	}

	// Equals method

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary != other.salary)
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	// toString method

	@Override
	public String toString() {
		return "Employee: " + name + " Year: " + year + " Salary: " + salary
				+ " Gender: " + gender;
	}

	/**
	 * Overrided method from Searchable interface param String s string we want
	 * to compare to
	 */

	@Override
	public boolean fiitsSearch(String s) {
		if (getName().equals(s)) {
			return true;
		} else if (Integer.toString(getYear()).equals(s)) {
			return true;
		} else if (Integer.toString(getSalary()).equals(s)) {
			return true;
		} else if (getGender().equals(s)) {
			return true;
		} else {
			return false;
		}
	};

}
