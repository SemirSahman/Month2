package ba.bitcamp.week10.day01;

public class Application {

	String name;
	int year;
	String version;
	double size;

	public Application(String name, int year, String version, double size) {
		super();
		this.name = name;
		this.year = year;
		this.version = version;
		this.size = size;
	}

	@Override
	public String toString() {
		return "Application [name=" + name + ", year=" + year + ", version="
				+ version + ", size=" + size + "]";
	}

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

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

}
