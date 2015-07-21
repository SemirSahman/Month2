package ba.bitcamp.week10.day2.streams.vjezbe;

import java.io.Serializable;

public class Employee implements Serializable {
	private static final long serialVersionUID = -2522565035569533146L;
	private String name;
	private int year;
	public Employee(String name, int year) {
		super();
		this.name = name;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", year=" + year + "]";
	}
	
	

}
