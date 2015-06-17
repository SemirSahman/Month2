package ba.bitcamp.week5.day2;

public class User {

	public static int userCount = 0;

	private String name;
	private String surname;
	private Integer age;
	private int id;

	public User(String name, String surname, Integer age) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.id = ++userCount;
	}
	
	public User(User other){
		this(other.name, other.surname, other.age);
		userCount--;
		this.id = other.id;
	}

	@Override
	public String toString() {
		String output = String.format("Name: %s, Surname: %s, Id: %d", name,
				surname, id);
		return output;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public boolean equals(User other) {
		if (this.name.equals(other.name) && this.surname.equals(other.surname)
				&& this.age == other.age) {
			return true;
		} else {
			return false;
		}
	}

}
