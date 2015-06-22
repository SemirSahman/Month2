package ba.bitcamp.week6.day1.vjezbe.task1task2;

public class Line implements Shape, Drawable {

	private int length;

	@Override
	public void drawOnConsole() {
		for (int i = 1; i < length; i++) {
			System.out.print("*");
		}
		System.out.println();

	}

	@Override
	public int getCircumference() {
		return length;
	}

	@Override
	public int getArea() {
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Line other = (Line) obj;
		if (length != other.length)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Line [length=" + length + "]";
	}

	public Line(int length) {
		super();
		this.length = length;
	}

}
