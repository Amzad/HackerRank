import java.util.Arrays;

public class MinimumSwaps {

	public static void main(String[] args) {
		
		int[] arr = {1,3,5,2,4};
		
		int result = minimumSwaps(arr);
		System.out.println(result);
		System.out.println(Arrays.toString(arr));
	}
	
	static int minimumSwaps(int[] arr) {
		int count = 0;

		for (int i = 0; i < arr.length -1; i++) {			
				while (arr[i] != (i+1)) {	
					int temp = arr[arr[i]-1];  //

					arr[arr[i]-1] = arr[i]; // 
					arr[i] = temp;	
					count++;
				}
				
			
		}
		return count;
	}
}
