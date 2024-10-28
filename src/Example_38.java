import java.util.Scanner;

public class Example_38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write some words: ");
        String str = sc.nextLine().replaceAll(" ", "");
        printCharArray(stringToCharArray(str));
    }
    private static char[] stringToCharArray(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }
    private static void printCharArray(char[] chars) {
        for (char aChar : chars) {
            System.out.printf("'%s' ",aChar);
        }
        System.out.println();
    }
}
