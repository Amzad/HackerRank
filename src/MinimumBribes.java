
public class MinimumBribes {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,5,3,7,8,6,4};
		// 5 1 2 3 7 8 6 4
		minimumBribes(arr);
		
	}
	
	static void minimumBribes(int[] q) {
		int count = 0;
		boolean chaotic = false;
		
		for (int i = 0; i < q.length; i++) {
			//System.out.println("Current number is " + arr[i] + " current place is " + index);
			if (q[i] != (i+1)) { 
				int difference = q[i] - (i+1);
				if (difference > 2) {
					System.out.println("Too chaotic");
					chaotic = true;
					break;
				} 
				if (difference <= 2 && (difference > 0)) {
					count += difference;
				}
				if (difference < 0) {
					int temp = q[i];
					for (int j = i; j < q.length; j++) {
						if (temp > q[j] && (temp-q[j] <=2)) {
							count++;
						}
					}
				}
			}
			
			
		}
		if (chaotic == false) System.out.println(count);
	}

}
