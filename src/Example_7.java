import java.util.Scanner;

public class Example_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        printOddNumber(n);
    }
    public static void printOddNumber(int n) {
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
