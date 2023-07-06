package automation.testsuite.ThangDuong;

public class Department extends Employee {
	private String nameDepartment;

	@Override
	public String toString() {
		return super.toString() + ", Department: " + this.nameDepartment;
	}

	public String getNameDeparment() {
		return nameDepartment;
	}

	public void setNameDepartment(String nameDepartment) {
		this.nameDepartment = nameDepartment;
	}

	@Override
	public void inputData() {
		super.inputData();
		System.out.print("Department: ");
		nameDepartment = sc.nextLine();
	}
}
