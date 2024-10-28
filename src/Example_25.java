import java.util.Scanner;

import static util.ArrayUtil.fillArrayWithRandomIntegers;
import static util.ArrayUtil.printArray;

public class Example_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        fillArrayWithRandomIntegers(arr, 1, 100);
        printArray(arr);
        System.out.println("Count of number ending with 1 and divided by 7: " + findDividedNumbers(arr));
    }
    private static int findDividedNumbers(int[] array) {
        int count = 0;
        for (int number : array) {
            if (number % 10 == 1 && number % 7 == 0) {
                count++;
            }
        }
        return count;
    }
}
