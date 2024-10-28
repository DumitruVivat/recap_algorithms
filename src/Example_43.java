import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Example_43 {
    public static void main(String[] args) {
        String input = "Hello my world";
        String result = reverseWords(input);
        System.out.println(result);
    }

//    private static String reverseWords(String input) {
//
//        String[] words = input.split(" ");
//        StringBuilder reversed = new StringBuilder();
//
//        for(int i = words.length - 1; i >= 0; i--) {
//            reversed.append(words[i]).append(" ");
//        }
//        return reversed.toString();
//    }
    private static String reverseWords(String input) {
        return Arrays.stream(input.split(" "))
                .toList()
                .stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.joining(" "));
    }
}
