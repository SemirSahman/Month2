package ba.bitcamp.week13.day02.vjezbe;

public class Object {

	private int id;
	private String name;
	private int year;
	private int salary;

	public Object(int id, String name, int year, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.year = year;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Object [id=" + id + ", name=" + name + ", year=" + year
				+ ", salary=" + salary + "]";
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

	public int getSalary() {
		return salary;
	}

}
