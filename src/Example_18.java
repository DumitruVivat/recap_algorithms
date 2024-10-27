import static util.ArrayUtil.printArray;

public class Example_18 {
    public static void main(String[] args) {
//        int[] array = new int[] {1, 3, 2, 4, 2, 3};
        int[] array = new int[] {2, 3, 1, 7, 5, 6, 3};

        int[] arrayResult = getArrayResult(array);
        printArray(arrayResult);
    }
    private static int[] getArrayResult(int[] array) {
        int[] arrayResult = new int[array.length/2];

        int left = 0;
        int right = array.length-1;
        while (left < right) {
            arrayResult[left] = array[left] * array[right];
            left++;
            right--;
        }
        return arrayResult;
    }
}
