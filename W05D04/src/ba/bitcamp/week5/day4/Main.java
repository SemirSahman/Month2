package ba.bitcamp.week5.day4;

public class Main {

	public static void main(String[] args) {
		
		Building b = new Building();
		b.area = 1000;
		b.location = "Hrasnicka cesta 17";
		b.area = 1000;
		
		University u = new University();
		u.name = "International University Sarajevo";
		u.isItPublic = false;
		u.numberOfFaculties = 3;
		u.numberOfStaff = 200;
		u.area=500;
		u.location = "Hrasnicka cesta 17";
		u.population = 1200;
		
		Hospital h = new Hospital();
		h.area=100;
		h.location = "Adresa 1";
		h.population = 50;
		h.hasCTMachine = true;
		h.isItPublic = true;
		h.numberOfBeds = 100;
		h.numberOfSurgeons = 1;
		
		Jail j =new Jail();
		j.area=10000;
		j.location = "Adresa 2";
		j.population = 5000;
		j.hasGym = true;
		j.numberOfCells = 700;
		j.numberOfFreeCells = 100;
		j.securityLevel = "High";
		
		
		System.out.println(u.getPopulationDensity());
		System.out.println(h.getPopulationDensity());
		System.out.println(j.getPopulationDensity());
		
		
		
		System.out.println(j.getNumberOfOccupiedCells());
		

	}

}
