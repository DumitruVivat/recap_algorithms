import java.util.Scanner;

public class Example_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        checkNumber(n);
    }
    public static void checkNumber(int n) {
        if (n > 0) {
            System.out.println("positive number");
        } else if (n < 0) {
            System.out.println("negative number");
        } else {
            System.out.println("zero");
        }
    }
}
