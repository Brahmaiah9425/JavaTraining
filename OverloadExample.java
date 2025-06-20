
public class OverloadExample {
	public void display() {
		System.out.println("No parameters");
	}
	public void display(String name) {
		System.out.println("Name:"+name);
	}
	public void display(int age) {
		System.out.println("Age: " +age);
	}
	public void display(String name, int age) {
		System.out.println("Name: "+name + ", Age: " +age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadExample obj = new OverloadExample();
		obj.display();
		obj.display("Mahesh");
		obj.display(25);
		obj.display("Brahmaiah", 22);

	}

}
