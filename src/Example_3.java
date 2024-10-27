import java.util.Scanner;

public class Example_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hundred number: ");
        int number = sc.nextInt();
        if (number > 99 && number < 1000) {
            int firstDigit = number / 100;
            int secondDigit = number % 10;
            int total = firstDigit + secondDigit;
            System.out.println(total);
        }else {
            System.out.println("Not a valid number");
        }
    }
}
