public class Example_42 {
    public static void main(String[] args) {
        String input = "A man, a plan, a canal, Panama!";
        boolean isPalindrome = isPalindrome(input);
        System.out.println(isPalindrome);
    }

    private static boolean isPalindrome(String input) {
        String cleanedString = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = cleanedString.length() - 1;

        while (left < right) {
            if (cleanedString.charAt(left) != cleanedString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
