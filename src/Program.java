import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Program {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length-1; i++) {
            int low = arr[i+1];
            int lowIndex = i+1;
            boolean needSwap = false;
            
            // Iterates through remaining array and finds index of lowest number
            for (int j = i+1; j < (arr.length); j++) {
                
                if (arr[j] < arr[i]) {
                    if (arr[j] <= arr[lowIndex]) {
                        lowIndex = j;
                        needSwap = true;
                    }
                }
            }
            if (needSwap == true) {
                int temp = arr[lowIndex];
                arr[lowIndex] = arr[i];
                arr[i] = temp;
                count++;
                System.out.println("Swapped");
            }
        }
        return count;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];
        System.out.println("input found");
        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        System.out.println("Items parsed");

        int res = minimumSwaps(arr);

        System.out.println(res);

        scanner.close();
    }
}
