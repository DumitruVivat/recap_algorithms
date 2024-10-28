import java.util.Scanner;

import static util.ArrayUtil.fillArrayWithRandomIntegers;
import static util.ArrayUtil.printArray;

public class Example_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        fillArrayWithRandomIntegers(arr, 0, 9);
        printArray(arr);
        System.out.println(formNaturalNumber(arr));
    }

    public static int formNaturalNumber(int[] array){
        int sum = 0;
        for (int j : array) {
            sum *= 10;
            sum += j;
        }
        return sum;
    }
}
