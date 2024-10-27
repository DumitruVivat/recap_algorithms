import java.util.Arrays;

import static util.ArrayUtil.printArray;

public class Example_23 {
    public static void main(String[] args) {

        int[] numbers = { 5, -3, 9, -1, 2, -7, 0 };
        int[] result = removeNegatives(numbers);
        printArray(result);
    }
    public static int[] removeNegatives(int[] nums) {
        return Arrays.stream(nums)
                .filter(n -> n >= 0)
                .toArray();
    }
}
