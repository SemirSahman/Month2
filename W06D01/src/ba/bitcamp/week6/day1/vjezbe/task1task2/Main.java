package ba.bitcamp.week6.day1.vjezbe.task1task2;

public class Main {

	public static void main(String[] args) {
		
		
		Line l = new Line(10);
		
		l.drawOnConsole();
		System.out.println(l.getArea());
		System.out.println(l.getCircumference());
		
		
		Rectangle r = new Rectangle(4, 3);
		
		r.drawOnConsole();
		System.out.println(r.getArea());
		System.out.println(r.getCircumference());
		
		Drawable[] d = new Drawable[50];
		
		for(int i = 0; i < d.length; i++){
			if(i % 2 == 0){
				d[i] = new Line((int) (Math.random()*5+1));
			} else {
				d[i] = new Rectangle ((int) (Math.random()*5+1), (int) (Math.random()*5+1));
				
				
			}
		}
		

	}

}
