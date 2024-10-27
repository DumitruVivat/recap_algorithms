import java.util.Scanner;

public class Example_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Enter third number: ");
        int c = sc.nextInt();
        System.out.println(findMedian(a, b, c));
    }
    public static int findMedian(int a, int b, int c) {
        if ((a >= b) && (a <= c) || (a >= c) && (a <= b)) {
            return a;
        } else if ((b >= a) && (b <= c) || (b >= c) && (b <= a)) {
            return b;
        } else {
            return c;
        }
    }


}
