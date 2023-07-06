package automation.testsuite.ThangDuong;

import java.util.Scanner;

public class Employee {
	private String name;
	private int age;
	private String ID;
	private String phone;
	private String email;
	private int salary;

	Scanner sc = new Scanner(System.in);

	public Employee() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		this.name = newName;
	}

	public int getAge() {
		return age;
	}

	public void settAge(int newAge) {
		this.age = newAge;
	}

	public String getID() {
		return ID;
	}

	public void setID(String newID) {
		this.ID = newID;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String newPhone) {
		this.phone = newPhone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String newEmail) {
		this.email = newEmail;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int newSalary) {
		this.salary = newSalary;
	}

	public void inputData() {
		System.out.print("Name: ");
		name = sc.nextLine();

		System.out.print("Age: ");
		age = sc.nextInt();
		sc.nextLine();

		System.out.print("ID: ");
		ID = sc.nextLine();

		System.out.print("Phone: ");
		phone = sc.nextLine();

		System.out.print("Email: ");
		email = sc.nextLine();

		System.out.print("Salary: ");
		salary = sc.nextInt();
		sc.nextLine();
	}

	@Override
	public String toString() {
		return "Name: " + this.name + ", Age: " + this.age + ", ID: " + this.ID + ", Phone: " + this.phone + ", Email: "
				+ this.email + ", Salary: " + this.salary;
	}
}
