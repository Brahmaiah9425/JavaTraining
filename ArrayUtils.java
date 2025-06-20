
public class ArrayUtils {
	public static int max(int[] arr) {
		int max = arr[0];
		for (int num : arr) {
			if(num > max) max = num;
		}
		return max;
	}
	public static int min(int[]arr) {
		int min = arr[0];
		for (int num : arr) {
			if(num < min ) min = num;
		}
		return min;
	}
	public static void reverse(int[] arr) {
		System.out.println("Reversed Array:");
		for (int i = arr.length -1; i >=0; i--);{
			int i = 0;
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {8, 3, 4, 5, 1, 9};
		System.out.println("Max: " +max(arr));
		System.out.println("Min: " +min(arr));
		reverse(arr);
		

	}

}
