public class Example_37 {
    public static void main(String[] args) {

        char[] array = {'a', 'b', 'c', 'd', 'e', 'f'};

        System.out.println(charToString(array));
    }

    private static String charToString(char[] ch) {
        StringBuilder str = new StringBuilder();
        for (char c : ch) {
            str.append(c);
        }
        return str.toString();
    }
}
