import static util.ArrayUtil.printArray;

public class Example_29 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
//        printArray(numbers);
        printReverseArray(numbers);
    }

    public static void printReverseArray(int[] numbers){
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = temp;
        }
        printArray(numbers);
    }
}
