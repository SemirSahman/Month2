package ba.bitcamp.SearchingAndSorting.vjezbe;

public class Employee {

	private static int countId = 1000;
	private String name;
	private String lastName;
	private String gender;
	private int payment;
	private Date dateOfBirth;
	private int id;
	
	public Employee() {
		this.name = "Unkown";
		this.lastName = "Ünknown";
		this.gender = "none";
		this.payment = 0;
		this.dateOfBirth = new Date(1, 1, 2000);
		this.id = countId++;
		
	}

	public Employee(String name, String lastName, String gender, int payment,
			int day, int month, int year) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.gender = gender;
		this.payment = payment;
		this.dateOfBirth = new Date(day, month, year);
		
		this.id = countId++;
	}

	class Date {
		private int day;
		private int month;
		private int year;

		public Date(int day, int month, int year) {
			super();
			this.day = day;
			this.month = month;
			this.year = year;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Date other = (Date) obj;
			if (day != other.day)
				return false;
			if (month != other.month)
				return false;
			if (year != other.year)
				return false;
			return true;
		}


		@Override
		public String toString() {
			return "Date [day=" + day + ", month=" + month + ", year=" + year
					+ "]";
		}

		public int getDay() {
			return day;
		}

		public void setDay(int day) {
			this.day = day;
		}

		public int getMonth() {
			return month;
		}

		public void setMonth(int month) {
			this.month = month;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		
		
		
	}

	public static int getId() {
		return countId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public int getPayment() {
		return payment;
	}

	public void setPayment(int payment) {
		this.payment = payment;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (payment != other.payment)
			return false;
		return true;
	}

	@Override
	public String toString() {

		return name + " " + lastName + " " + "[" + gender + "]" + "(" + payment
				+ " $)" + "{" + dateOfBirth + "}";

	}

}
