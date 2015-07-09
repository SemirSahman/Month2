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
		for (int i = 0; i < employees.size()-1; i++) {
			if (employees.get(i).getId() < employees.get(i + 1).getId()) {
				isSorted = true;
			} else {
				isSorted = false;
				break;
			}
		}
		return isSorted;
	}
	
	public void getEmployee(int id){
		
		 int low = 0;
         int high = employees.size() - 1;
          
         while(high >= low) {
             int middle = (low + high) / 2;
             if(employees.get(middle).getId() == id) {
                 System.out.println(employees.get(middle));
             }
             if(employees.get(middle).getId() < id) {
                 low = middle + 1;
             }
             if(employees.get(middle).getId() > id) {
                 high = middle - 1;
             }
        }
         
         System.out.println("There is not employee with that ID number");
        
		
	}

}
