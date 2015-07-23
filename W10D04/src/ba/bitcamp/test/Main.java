package ba.bitcamp.test;

import java.util.ArrayList;

import ba.bitcamp.test.HistoricalArtifacts.Period;

public class Main {

	public static void main(String[] args) {

		// Initializing objects and ArrayLists in which we want to put objects

		ArrayList<HistoricalArtifacts> historicalArtifacts = new ArrayList<HistoricalArtifacts>();

		HistoricalArtifacts ha1 = new HistoricalArtifacts(1010,
				"Tutankammons mask", "Mask from Tutankammon the Egypt pharaon",
				"Egypt", Period.CLASSIC);
		HistoricalArtifacts ha2 = new HistoricalArtifacts(
				1011,
				"T-Rex leg bone",
				"Big leg bone from one of the most vicious predator in Jurrasic era",
				"Pangea", Period.CLASSIC);
		HistoricalArtifacts ha3 = new HistoricalArtifacts(1012, "Stonehenge",
				"Large rock boulders sorted in strange way", "Great Britany",
				Period.CLASSIC);
		HistoricalArtifacts ha4 = new HistoricalArtifacts(
				1013,
				"Charter of Ban Kulin",
				"Trade agreement between the Banate of Bosnia and the Republic of Ragusa",
				"Bosnia", Period.MEDIEVAL);

		historicalArtifacts.add(ha1);
		historicalArtifacts.add(ha2);
		historicalArtifacts.add(ha3);
		historicalArtifacts.add(ha4);

		historicalArtifacts.sort(null);

		System.out.println(historicalArtifacts);

		ArrayList<WorksOfArt> worksOfArt = new ArrayList<WorksOfArt>();

		WorksOfArt wof1 = new WorksOfArt(1020, "Mona Lisa",
				"Paint painted by Italian artist Leonardo da Vinci",
				"Leonardo da Vinci",
				ba.bitcamp.test.WorksOfArt.Period.RENAISSANCE);
		WorksOfArt wof2 = new WorksOfArt(1021, "Chauvet cave paintings",
				"Portraits of animals from ice age", "Homo sapiens",
				ba.bitcamp.test.WorksOfArt.Period.ANCIENT_TIME);
		WorksOfArt wof3 = new WorksOfArt(1022,
				"The Beheading of Saint John the Baptist",
				"Shows a murderous moment in a prison yard", "Caravaggio",
				ba.bitcamp.test.WorksOfArt.Period.NEOCLASSIC);
		WorksOfArt wof4 = new WorksOfArt(1023,
				"Self-Portrait with Two Circles",
				"Rembrandt is looking at you", "Rembrandt",
				ba.bitcamp.test.WorksOfArt.Period.NEOCLASSIC);

		worksOfArt.add(wof1);
		worksOfArt.add(wof2);
		worksOfArt.add(wof3);
		worksOfArt.add(wof4);

		worksOfArt.sort(null);

		System.out.println(worksOfArt);

		ArrayList<Employee> employees = new ArrayList<Employee>();

		Employee emp1 = new Employee("Employee1", 25, 2500, "Male");
		Employee emp2 = new Employee("Employee2", 30, 2500, "Female");
		Employee emp3 = new Employee("Employee3", 45, 5000, "Male");
		Employee emp4 = new Employee("Employee4", 32, 3500, "Female");

		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);

		System.out.println(employees);

		Museum Louvre = new Museum(worksOfArt, historicalArtifacts, employees);

		System.out.println(Louvre);

	}

}
