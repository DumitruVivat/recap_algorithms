import java.util.Scanner;

import static util.ArrayUtil.fillArrayWithRandomIntegers;
import static util.ArrayUtil.printArray;

public class Example_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        fillArrayWithRandomIntegers(arr, 100, 1000);
        printArray(arr);
        System.out.println("Count of even numbers in array: " + evenNumber(arr));
    }
    public static int evenNumber(int[] arr) {
        int evenNumber = 0;
        for (int j : arr) {
            if (j % 2 == 0) {
                evenNumber++;
            }
        }
        return evenNumber;
    }
}
