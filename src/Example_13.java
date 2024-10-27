import java.util.Scanner;

public class Example_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the X and Y coordinate separate by space: ");
        String[] coordinates = sc.nextLine().split(" ");
        int x = Integer.parseInt(coordinates[0]);
        int y = Integer.parseInt(coordinates[1]);

        if (x > 0 && y > 0) {
            System.out.println("1");
        } else if (x < 0 && y > 0) {
            System.out.println("2");
        } else if (x < 0 && y < 0) {
            System.out.println("3");
        } else if (x > 0 && y < 0) {
            System.out.println("4");
        } else {
            System.out.println("The point is on coordinate axis");
        }
    }
}
