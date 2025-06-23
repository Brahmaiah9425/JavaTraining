
public class Employee {
	private String name;
	private int id;
	private double salary;
	public Employee( String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public double getsalary() {
		return salary;
	}
	public void setName(String name) {
		this.name =name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void displayData() {
		System.out.println("Employee ID:"+name);
		System.out.println("Name:" +id);
		System.out.println("Salary:"+salary);
	}
	public static void main(String[] args) {
		Employee emp = new Employee("Brahmaiah",1001,65000.00);
		emp.displayData();
	}
}


