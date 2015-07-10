package ba.bitcamp.SearchingAndSorting.vjezbe;

import java.util.ArrayList;

public class Company {

	ArrayList<Employee> employees = new ArrayList<Employee>();

	public void hireEmployee(Employee e) {

		if (employees.contains(e)) {
			System.out.println("Employee is already part of company");
		} else {
			employees.add(e);
		}

	}

	public void fireEmployee(Employee e) {

		if (employees.contains(e)) {

			employees.remove(e);

		} else {
			System.out.println("Employee is not part of your company");
		}

	}

	public boolean isWorkingHere(Employee e) {

		for (int i = 0; i < employees.size(); i++) {
			if (employees.get(i).equals(e)) {
				return true;
			}
		}
		return false;
	}

	public boolean hasFemaleEmployee() {

		for (int i = 0; i < employees.size(); i++) {
			if (employees.get(i).getGender().equals("female")) {
				return true;
			}
		}
		return false;

	}

	public void sortByID() {
		int minIdx;
		int n = employees.size();
		for (int i = 0; i < n - 1; i++) {
			minIdx = i;
			for (int j = i + 1; j < n; j++)
				if (employees.get(j).getId() < employees.get(minIdx).getId())
					minIdx = j;
			Employee smallerNumber = employees.get(minIdx);
			employees.set(minIdx, employees.get(i));

			employees.set(i, smallerNumber);

		}

	}

	public void sortByAge() {

		int minIdx;
		int n = employees.size();
		for (int i = 0; i < n - 1; i++) {
			minIdx = i;
			for (int j = i + 1; j < n; j++)
				if (employees.get(j).getDateOfBirth().getYear() < employees
						.get(minIdx).getDateOfBirth().getYear())
					minIdx = j;
			Employee smallerNumber = employees.get(minIdx);
			employees.set(minIdx, employees.get(i));

			employees.set(i, smallerNumber);

		}

	}

	public void sortBySalary() {
		for (int i = 1; i < employees.size(); i++) {
			Employee temp = employees.get(i);

			int j;
			for (j = i - 1; j >= 0; j--) {
				if (employees.get(j).getPayment() < temp.getPayment()) {
					break;
				}
				employees.set(j + 1, employees.get(j));

			}

			employees.set(j + 1, temp);

		}
	}

	public void sortByGender() {
		for (int i = 1; i < employees.size(); i++) {
			Employee temp = employees.get(i);

			int j;
			for (j = i - 1; j >= 0; j--) {
				if (employees.get(j).getGender().compareTo(temp.getGender()) > 0) {
					break;
				}
				employees.set(j + 1, employees.get(j));

			}

			employees.set(j + 1, temp);
		}
	}

	public boolean areEmployeeSortedById() {
		boolean isSorted = false;
		for (int i = 0; i < employees.size() - 1; i++) {
			if (employees.get(i).getId() < employees.get(i + 1).getId()) {
				isSorted = true;
			} else {
				isSorted = false;
				break;
			}
		}
		return isSorted;
	}

	public void getEmployee(int id) {

		int low = 0;
		int high = employees.size() - 1;

		while (high >= low) {
			int middle = (low + high) / 2;
			if (employees.get(middle).getId() == id) {
				System.out.println(employees.get(middle));
			}
			if (employees.get(middle).getId() < id) {
				low = middle + 1;
			}
			if (employees.get(middle).getId() > id) {
				high = middle - 1;
			}
		}

		System.out.println("There is not employee with that ID number");

	}

	public ArrayList<Employee> getEmployeeList() {

		return employees;

	}

	public void addEmployee(Employee... e) {

		for (int i = 0; i < e.length; i++) {
			if (!employees.contains(e[i])) {
				employees.add(e[i]);
			} else {
				System.out.println("Employee is already part of your company");
			}
		}

	}

	public void addEmployee2(Employee[] e) {
		for (int i = 0; i < e.length; i++) {
			if (!employees.contains(e[i])) {
				employees.add(e[i]);
			} else {
				System.out
						.println("Employees are already part of your company");
			}
		}

	}

	public void addEmployee3(ArrayList<Employee> e) {

		for (int i = 0; i < e.size(); i++) {
			if (!employees.contains(e.get(i))) {
				employees.add(e.get(i));
			} else {
				System.out
						.println("Employees are already part of your company");
			}
		}

	}

	public int indexOfEmployee(Employee e) {
		if (employees.contains(e)) {
			return employees.indexOf(e);
		} else {
			return -1;
		}
	}

	public void removeEmployee(int idx) {

		for (int i = 0; i < employees.size(); i++) {
			if (employees.indexOf(i) == idx) {
				employees.remove(idx);
			} else {
				System.out
						.println("There is no employee on that index in your company");
			}
		}

	}

	public void removeEmployee(Integer id) {

		for (int i = 0; i < employees.size(); i++) {
			if (employees.indexOf(i) == id) {
				employees.remove(id);
			} else {
				System.out
						.println("There is no employee on that index in your company");
			}
		}

	}

	public void sortByName() {
		for (int i = 0; i < employees.size() - 1; i++) {
			for (int j = employees.size() - 2; j >= 0; j--) {
				if (employees.get(j).getName().charAt(0) > (employees
						.get(i + 1).getName().charAt(0))) {
					Employee temp = employees.get(j);
					employees.set(j, employees.get(j + 1));
					employees.set(j + 1, temp);

				}

			}

		}
	}

	public Employee[] getEmployeeArray(ArrayList<Employee> e) {

		Employee[] empl = new Employee[e.size()];

		for (int i = 0; i < empl.length; i++) {
			empl[i] = e.get(i);
		}

		return empl;

	}

	public ArrayList<String> getNameList(ArrayList<Employee> e) {

		ArrayList<String> names = new ArrayList<String>();

		for (int i = 0; i < e.size(); i++) {
			names.set(i, employees.get(i).getName());
		}

		return names;

	}

}
