package ba.bitcamp.week6.day1.interfacepredavanja;

public class OuterClass {
	
	private int number;
	public InnerClass ic;
	
	
	
	public OuterClass() {
		super();
		this.number = 10;
	    ic = new InnerClass(0);
	}



	class InnerClass{
		
		private int innerNumber;
		private int number;
		
		public InnerClass(int number){
			this.number = number;
		}
		
		
		public void PrintVariables(int number){
			System.out.println("Param number: " + number);
			System.out.println("Inner number: " + this.number);
			System.out.println("Outer number: " + OuterClass.this.number);
		}
		
		
	}

}
