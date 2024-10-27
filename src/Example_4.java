import java.util.Scanner;

public class Example_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        checkDivisibility(a,b);
    }

    public static void checkDivisibility(int firstNumber, int secondNumber) {
        if (firstNumber % secondNumber == 0) {
            System.out.println("Divisible");
        } else {
            System.out.println("Not divisible");
        }
    }

}
