public class Employee
{
	private String name;
	private String position;
	private double salary;
	
	public Employee(String name, String position, double salary)
	{
		super();
		this.name = name;
		this.position = position;
		this.salary = salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getPosition() {
		return this.position;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return this.salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", position=" + position + ", salary=" + salary + "]";
	}
	
}
