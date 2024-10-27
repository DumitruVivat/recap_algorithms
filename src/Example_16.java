import java.util.Scanner;
import static util.ArrayUtil.*;

public class Example_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        int [] numbers = new int[size];
        fillArrayWithRandomIntegers(numbers, 1, 10);

        containsNumber(numbers, number);

    }

    private static void containsNumber(int[] numbers, int number) {
        for (int i = 0; i < numbers.length ; i++) {
            if (numbers[i] == number) {
                System.out.println(numbers[i]);
                break;
            }
        }
    }
}
