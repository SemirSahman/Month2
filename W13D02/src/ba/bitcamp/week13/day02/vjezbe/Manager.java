package ba.bitcamp.week13.day02.vjezbe;

public class Manager {

	private int id;
	private String name;

	public Manager(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Manager [id=" + id + ", name=" + name + "]";
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	

}
