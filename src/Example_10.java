import java.util.Scanner;

public class Example_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        squareOfFirstDigit(num, num2);
    }
    private static void squareOfFirstDigit(int a, int b){
        int remainder = a % b;
        if(remainder == 0) {
            System.out.println("The first number " + a + " is a square of " + b);
        } else {
            System.out.println("The first number " + a + " is not a square of " + b + ", remainder = " + remainder);
        }
    }
}
