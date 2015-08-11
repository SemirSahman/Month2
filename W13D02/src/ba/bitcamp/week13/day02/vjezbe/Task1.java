package ba.bitcamp.week13.day02.vjezbe;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Task1 {

	static private ArrayList<Object> list = new ArrayList<Object>();
	static private ArrayList<Manager> list2 = new ArrayList<Manager>();

	public static void main(String[] args) {

		FileReader fileReader;
		FileReader fileReaderManager;
		try {
			fileReader = new FileReader(new File("semir.csv"));
			fileReaderManager = new FileReader(new File("src/manager.csv"));
			BufferedReader br = new BufferedReader(fileReader);
			BufferedReader brManager = new BufferedReader(fileReaderManager);
			br.readLine();
			while (br.ready()) {

				String[] line = br.readLine().split(",");

				int id = Integer.parseInt(line[0]);
				String name = line[1];
				int year = Integer.parseInt(line[2]);
				int salary = Integer.parseInt(line[3]);

				Object o = new Object(id, name, year, salary);

				// searchOne(o);
				// searchTwo(o);
				// System.out.println(searchThree(o));
				System.out.println(searchFour(o));

				// list.add(o);

			}
			brManager.readLine();
			while (brManager.ready()) {
				String[] line = br.readLine().split(",");
				int id = Integer.parseInt(line[0]);
				String name = line[1];

				Manager m = new Manager(id, name);
				list2.add(m);
			}

			for (Object o : list) {
				System.out.println(o);

				Manager myManager = null;
				for (Manager m : list2) {
					if (o.getId() == m.getId()) {
						myManager = m;
					}
				}
				if (myManager == null) {
					System.out.println("null");
				} else {

					System.out.println(" " + myManager.getName());
				}
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// System.out.println(list);

	}

	public static void searchOne(Object o) {

		if (o.getSalary() > 5000) {
			list.add(o);
		}

	}

	public static void searchTwo(Object o) {

		if (o.getId() > 2 && o.getSalary() < 1000) {
			list.add(o);
		}
	}

	public static ArrayList<String> searchThree(Object o) {
		ArrayList<String> names = new ArrayList<String>();
		String s = o.getName();
		names.add(s);
		return names;
	}

	public static ArrayList<String> searchFour(Object o) {
		ArrayList<String> list2 = new ArrayList<String>();
		String s = o.getName();
		String s2 = Integer.toString(o.getSalary());
		list2.add(s);
		list2.add(s2);
		return list2;
	}

}
