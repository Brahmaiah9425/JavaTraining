import java.util.*;
public class StudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> studentList = new ArrayList<>();
		studentList.add("Brahmaiah");
		studentList.add("Hari");
		studentList.add("Madhavi");
		studentList.add("Parvez");
		studentList.add("Mahesh");
		studentList.add("Madhu");
		studentList.add("Kiran");
		studentList.add("Brahmaiah");
		studentList.add("Madhavi");
		studentList.add("Brahmaiah");
		System.out.println("All students (ArrayList):"+studentList);
		HashSet<String> uniqueStudents = new HashSet<>();
		for (String name: studentList) {
			if(uniqueStudents.add(name)) {
				System.out.println(name);
			}
		}
		HashMap<Integer,String> studentMap = new HashMap<>();
		studentMap.put(101,"Brahmaiah");
		studentMap.put(102,"Mahesh");
		studentMap.put(103,"Madhavi");
		studentMap.put(104,"Naveen");
		studentMap.put(105,"Ajith");
		studentMap.put(106,"Hari");
		System.out.println("\nStudents with roll numbers (HashMap):");
		for (Map.Entry<Integer,String>entry :studentMap.entrySet()) {
			System.out.println("Roll No:" +entry.getKey() +", Name:"+entry.getValue());
			
		}
		int rollNo = 102;
		System.out.println("\n Student with RollNo:"+rollNo +"Student with name:"+studentMap.get(rollNo));





	}

}
