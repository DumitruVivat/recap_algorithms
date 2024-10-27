import java.util.Scanner;

public class Example_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        thirdNumber(num);
    }
    private static void thirdNumber(int a){
        if (a >= 100 || a <= -100) {
            while (a > 999){
                a = a / 10;
            }
            int thirdNumber = a % 10;
            System.out.println("Third number is " + thirdNumber);
        } else {
            System.out.println("No third number");
        }
    }
}
