package ba.bitcamp.week5.day2;

public class Point {
	
	private int x;
	private int y;
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public Point(Point other){
		this(other.x, other.y);
	}
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
	public int getXPosition(){
		return x;
	}
	
	public int getYPosition(){
		return y;
	}
	
	public void setXPosition(int x){
		this.x = x;
	}
	
	public void setYPosition(int y){
		this.y = y;
	}
	
	public double distance(Point other){
		double d = Math.sqrt((this.x - other.x)*(this.x - other.x) + (this.y - other.y)*(this.y - other.y));
		return d;
	}

}
