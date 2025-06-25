
public class MultipleExceptionsExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {10, 20, 30};
		int a = 10;
		int b = 0;
		try {
			int results = a/b;
			System.out.println("Results:"+results);
			System.out.println("Array value:" + numbers[5]);
			String text = null;
			System.out.println("Text length : "+text.length());
		}catch (ArithmeticException e) {
			System.out.println("Error: Cannot divide by zero");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: Array index is out of bounds.");
		}catch(NullPointerException e) {
			System.out.println("Error: Null reference encountered.");
		}
		System.out.println("Program continues...");

	}

}
