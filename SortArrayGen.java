import java.util.*;
public class SortArrayGen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter "+ n+"elements:");
		for(int i = 0; i <n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i =0; i < n-1; i++) {
			for (int j = 0; j< n-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp =arr[j];
					arr[j]= arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted array in the ascending order:");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		
	}

}
