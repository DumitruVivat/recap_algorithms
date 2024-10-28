import java.util.Scanner;

import static java.lang.Character.isDigit;

public class Example_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Write number or 'q' to exit: ");
            String input = sc.nextLine();
            if (input.equals("q")) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                int sum = 0;
                while (number > 0) {
                    sum += number % 10;
                    number /= 10;
                }
                if (sum % 2 == 0) {
                    System.out.println("STOP");
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("ERROR");
            }
        }
        sc.close();
    }
}
