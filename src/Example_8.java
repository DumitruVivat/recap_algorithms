import java.util.Scanner;

public class Example_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hundred number: ");
        int n = sc.nextInt();

        deleteMiddleDigit(n);
    }

    private static void deleteMiddleDigit(int n) {
        if (n > 99 && n < 999) {
            int firstDigit = n / 100;
            int thirdDigit = n % 10;
            int result = firstDigit * 10 + thirdDigit;
            System.out.println("result: " + result);
        } else {
            System.out.println("wrong number");
        }
    }
}
