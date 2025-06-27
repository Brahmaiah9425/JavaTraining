import java.util.*;

import javax.print.DocFlavor.STRING;
public class CollectionOperations {
	public static void main(String[]args) {
		System.out.println("===ArrayList===");
		ArrayList<String> students = new ArrayList<>();
		students.add("Brahmaiah");
		students.add("Mahesh");
		students.add("Ajith");
		students.add("Nagarjuna");
		students.add("Madhavi");
		students.add("Naveen");
		students.add("Hari");
		System.out.println("Original List of the students:"+students);
		students.set(1, "GopiChand");
		System.out.println("Updated list of the studnets:"+students);
		students.remove("Madhavi");
		System.out.println("After remove:"+students);
		
		System.out.println("\n====HashSet====");
		HashSet<String> uniqueNames = new HashSet<>();
		uniqueNames.add("Apple");
		uniqueNames.add("orange");
		uniqueNames.add("mango");
		uniqueNames.add("Apple");
		System.out.println("original set:"+uniqueNames);
		uniqueNames.remove("mango");
		System.out.println("After remove set:"+uniqueNames);
		uniqueNames.add("Grapes");
		System.out.println("After update:"+uniqueNames);
		
		
		System.out.println("\n===HashMap===");
		HashMap<Integer, String> studentMap = new HashMap<>();
		studentMap.put(1,"Brahmaiah");
		studentMap.put(2,"Rahul");
		studentMap.put(3,"Geetha");
		studentMap.put(4,"Abhi");
		studentMap.put(5,"Mahesh");
		System.out.println("original set:"+studentMap);

		studentMap.put(2, "Rithin");
		System.out.println("After update:"+studentMap);

		studentMap.remove(1);
		System.out.println("After remove set:"+studentMap);

		

		

		

		

		

	}

}
