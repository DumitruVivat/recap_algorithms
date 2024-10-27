import java.util.Scanner;

public class Example_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hundred number:");
        int number = sc.nextInt();

        secondNumberPow(number);
    }

    private static void secondNumberPow (int number) {
        if (number > 99 && number < 1000) {
            int secondNumber = number / 10 % 10;
            int thirdNumber = number % 10;
            int result = pow(secondNumber, thirdNumber);
            System.out.println("result: " + result);
        } else {
            System.out.println("wrong number");
        }
    }
    private static int pow(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++){
            result = result * a;
        }
        return result;
    }
}
