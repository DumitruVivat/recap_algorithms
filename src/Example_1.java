import java.util.Scanner;

public class Example_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        if(a == b * b) {
            System.out.println("First number is a square of second number: ");
        } else {
            System.out.println("First number is not a square of second number: ");
        }

    }
}
