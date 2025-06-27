
public class StringLoopsOperations {
	public static void main(String [] args) {
		String str = "Devops";
		System.out.println("Using For loop");
		for(int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i)+"");
		}
		System.out.println("\n using the while loop");
		int i= 0;
		while(i < str.length()) {
			System.out.println(str.charAt(i)+"");
			i++;
		}
		System.out.println("\n using the do-while loop:");
		int j = 0;
		do {
			System.out.println(str.charAt(j)+"");
			j++;
		} while (j < str.length());
		System.out.println("\n\n for each loop:");
		for(char ch:str.toCharArray()){
			System.out.print(ch +"");
		}
	}

}
