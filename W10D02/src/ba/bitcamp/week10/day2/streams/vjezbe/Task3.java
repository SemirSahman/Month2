package ba.bitcamp.week10.day2.streams.vjezbe;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class Task3 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		Employee e1 = new Employee("Employee 1", 30);
		Employee e2 = new Employee("Employee 2", 25);
		Employee e3 = new Employee("Employee 3", 27);

		ArrayList<Employee> employees = new ArrayList<Employee>();

		employees.add(e1);
		employees.add(e2);
		employees.add(e3);

		try {
			OutputStream os = new FileOutputStream( new File("task3.txt"));
			ObjectOutputStream oos = new ObjectOutputStream(os);
			oos.writeObject(employees);

			InputStream is = new FileInputStream(new File("task3.txt"));
			ObjectInputStream ois = new ObjectInputStream(is);
			ArrayList<Employee> fromFile = (ArrayList<Employee>) ois.readObject();
			System.out.println(fromFile);
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ex1) {
			ex1.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
