package ba.bitcamp.SearchingAndSorting.vjezbe;

public class Main {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee("Radnik2", "Prezime2", "male", 5000, 1, 5, 1994);
		Employee e3 = new Employee("Radnica", "Prezime", "female", 4000, 2, 7, 1990);
		Company c = new Company();
		c.hireEmployee(e1);
		c.hireEmployee(e2);
		c.hireEmployee(e3);
		System.out.println(c.isWorkingHere(e1));
		System.out.println(c.hasFemaleEmployee());
		c.sortByID();
		// c.sortByAge();
		// c.sortBySalary();
		// c.sortByGender();

		System.out.println(c.areEmployeeSortedById());
		// System.out.println(c);

	}

}
