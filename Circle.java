package ba.bitcamp.week5.day2;

public class Circle {
	
	Point point;
	double radius;
	
	
	
	public Circle(Point point, double radius) {
		this.point = point;
		this.radius = radius;
	}
	
	
	public Circle(Circle other) {
		this.point = other.point;
		this.radius = other.radius;
	}


	@Override
	public String toString() {
		return "Circle [point=" + point + ", radius=" + radius + "]";
	}
	
	
	public boolean isIntersecting(Circle other){
		if(this.point.distance(other.point)<this.radius+other.radius){
			return true;
		}else{
			return false;
		}
		
	}
	
	

}
