import java.util.*;
public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String input = sc.nextLine();
		String reversed = "";
		for(int i = input.length()-1; i>=0; i--) {
			reversed += input.charAt(i);
		}
		System.out.println("Reversed String :"+reversed);
		int vowels = 0, consonants = 0;
		input = input.toLowerCase();
		for (int i = 0; i < input.length();i++) {
			char ch = input.charAt(i);
			if(ch>= 'a' && ch<='z') {
				if(ch == 'a' || ch=='e' || ch=='i' ||ch=='o' || ch=='u'){
					vowels++;
				}else{
					consonants++;
				}
			}
		}
		
		System.out.println("Vowels:"+vowels);
		System.out.println("Vowels:"+consonants);

	}

}
