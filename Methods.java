import java.util.*;
public class Methods {
	static int amount;
	static int currentamount = 5000;
	static Scanner sc = new Scanner(System.in);
	//System.out.println("Please enter name:");
	static String name = sc.nextLine();	
	public static void greetCustomer() {
		System.out.println( "Hello," +name+ " Welcome to our Bank,");
	}
	public static void deposit(int amount) {
		currentamount = currentamount + amount;
		System.out.println("The current amount is:"+(currentamount));
		
	}
	public static int debit(int debitamount) {
		System.out.println("Amount debited");
		return currentamount = currentamount - debitamount; 
		
	}
	public void fortherInformation() {
		System.out.println("Is there anything else from your side ?");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods m = new Methods();
		Methods.greetCustomer();
		Methods.deposit(500);
		Methods.debit(50);
		System.out.println("The current amount is:"+(currentamount));
		m.fortherInformation();

		

	}

}
