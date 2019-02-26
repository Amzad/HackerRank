
public class LeftRotation {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		rotateLeft(array, 3);
		printArray(array);

	}
	
	static void rotateLeft(int[] array, int count) {
		// int[] temp = new int[array.length];
		int rotations = 0;
		while (rotations < count) {
			int temp = array[0];
			for (int i = 0; i < array.length - 1; i++) {
				array[i] = array[i + 1];
			}
			array[array.length - 1] = temp;
			rotations++;
		}
	}
	
	static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
