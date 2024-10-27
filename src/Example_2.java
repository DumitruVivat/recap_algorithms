import java.util.Scanner;

public class Example_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer number: ");
        int n = sc.nextInt();
        int count = -n;
        while (count <= n){
            System.out.print(count + " ");
            count++;
        }

    }
}
