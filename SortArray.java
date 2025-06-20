import java.util.Arrays;
public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]  arr = {5,3,2,9,1,3,7,};
		Arrays.sort(arr);
		System.out.println("Sorted Array:");
		for(int num : arr) {
			System.out.println(num + "");
		}
		

	}

}
