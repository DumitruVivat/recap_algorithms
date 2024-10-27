import java.util.Scanner;

public class Example_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        if (num % 7 == 0 && num % 23 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
