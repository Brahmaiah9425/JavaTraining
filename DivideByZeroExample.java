
public class DivideByZeroExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 0;
		int results;
		try {
			results = a/b;
			System.out.println("Results :" + results);
		}catch(ArithmeticException e) {
			System.out.println("Error: Division by zero is not allowed.");
		} 
		System.out.println("Program continues....");

	}

}
