public class Main{
static class Employee {
	private double id;
	private  String name;
	private double salary;
	
	public Employee(double d, String name, double salary) {
		this.id =d;
		this.name = name;
		this.salary = salary;
	}
	//public Employee(double salary, String a, int i) {
		// TODO Auto-generated constructor stub
	//}
	public void displayData() {
		System.out.println("Employee ID :" +id);
		System.out.println("Employee Name :" +name);
		System.out.println("Salary :" +salary);


		
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee(1001. , "Brahmaiah", 60000);
		emp.displayData();
	}
	}
}

