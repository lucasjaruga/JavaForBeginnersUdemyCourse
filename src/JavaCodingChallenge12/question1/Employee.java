package JavaCodingChallenge12.question1;

public class Employee {
	private final String name;
	private double salary;
	private String organization;
	
	public Employee (String employeeName, double employeeSalary, String employeeOrganization) {
		this.name = employeeName;
		this.salary = employeeSalary;
		this.organization = employeeOrganization;
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Employee: [" + this.name + ", " + this.salary + ", " + this.organization + "]";
	}
	
}