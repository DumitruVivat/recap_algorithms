public class Example_40 {
    public static void main(String[] args) {
        char[][] charArray = new char[][]{{'a','b'},{'c','d'},{'e','f'}};
        String result = createStringFrom2DArray(charArray);
        System.out.println(result);

    }
    private static String createStringFrom2DArray(char[][] arr) {
        StringBuilder sb = new StringBuilder();
        for (char[] chars : arr) {
            for (char aChar : chars) {
                sb.append(aChar);
            }
        }
        return sb.toString();
    }
}
