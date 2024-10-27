import java.util.Scanner;

import static util.ArrayUtil.printArray;

public class Example_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hundred number : ");
        int number = sc.nextInt();

        int num_copy = number;
        int count = 0;
        while (num_copy != 0) {
            num_copy /= 10;
            count++;
        }

        int[] array = new int[count];
        int index = array.length - 1;
        while (number != 0) {
            array[index] = number % 10;
            number /= 10;
            index--;
        }
        printArray(array);
    }
}
