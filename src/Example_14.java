import java.util.Scanner;

public class Example_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number from the segment [10, 99]: ");
        int n = sc.nextInt();
        showTheLargestDigitOfNumber(n);
    }
    public static void showTheLargestDigitOfNumber(int n) {
        int firstDigit = n / 10;
        int secondDigit = n % 10;

        int maxDigit = Math.max(firstDigit, secondDigit);
        System.out.println("Max digit: " + maxDigit);
    }
}
