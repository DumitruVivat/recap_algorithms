import java.util.Scanner;

public class Example_39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text: ");
        String str = sc.nextLine();
        System.out.println("Vowels count: " + findVowels(str));
    }

    private static int findVowels(String str) {
        String vowels = "aeiouyAEIOUY";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (vowels.contains(String.valueOf(currentChar))) {
                count++;
            }
        }
        return count;
    }
}
