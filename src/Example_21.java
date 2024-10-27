import static util.ArrayUtil.printArray;

public class Example_21 {
    public static void main(String[] args) {

        int[] numbers = { 1, -5, 6, -7, 3 };
        swapSigns(numbers);
        printArray(numbers);

    }
    public static void swapSigns(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = -numbers[i];
        }
    }
}
