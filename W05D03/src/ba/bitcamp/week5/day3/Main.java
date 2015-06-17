package ba.bitcamp.week5.day3;

public class Main {

	public static void main(String[] args) {

		Employee e = new Employee("John","Male");
		System.out.println(e);
		
		SalaryEmployee se = new SalaryEmployee("Sue","Female",2000);
		System.out.println(se);
		
		HourlyEmployee he = new HourlyEmployee("John", "Male", 15);
		System.out.println(he);

	}

}
