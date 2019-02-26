
public class SixBySixArray {

	static int count = 0;
	static int sum = 0;
	static int[] highest = new int[2];
	static int[][] array = {
		    {1, 1, 1, 0, 0, 0},
			{0, 1, 0, 0, 0, 0},
			{1, 1, 1, 0, 0, 0},
			{0, 0, 2, 4, 4, 0},
			{0, 0, 0, 2, 0, 0},
			{0, 0, 1, 2, 4, 0}
	};
	
	public static void main(String[] args) {
		//print(array[1][0]);
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				checkHourglass(i, j);
				printHourglass(i, j);
			}
		}
		
		System.out.println("Highest sum is " + sum + "\nTotal Hourglasses is " + count);
		printHourglass(highest[0],highest[1]);
			
	}
	
	static void checkHourglass(int i, int j) {
		int temp = array[i][j] + array[i][j+1] + array[i][j+2]
							+ array[i+1][j+1] +
				array[i+2][j] + array[i+2][j+1] + array[i+2][j+2];
		
		if (sum > temp) {
			
		} else if ( temp > sum) {
			sum = temp;
			highest[0] = i;
			highest[1] = j;
		}
		
	}
	
	static void printHourglass(int i, int j) {
		System.out.println(array[i][j] + " " + array[i][j+1] + " " + array[i][j+2]);
		System.out.println("  " + array[i+1][j+1] + "  " );
		System.out.println(array[i+2][j]+ " " + array[i+2][j+1] + " " + array[i+2][j+2]);
		System.out.println();
		count++;
	}
}
