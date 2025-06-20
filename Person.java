
public class Person {
	String name;
	int age;
	public Person(String n, int a) {
		name = n;
		age = a;
	}
	public void display() {
		System.out.println("Name: " +name + "Age:" +age);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Brahmaiah",22);
		p1.display();
	}

}
