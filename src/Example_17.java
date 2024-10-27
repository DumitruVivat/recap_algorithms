import static util.ArrayUtil.printArray;

public class Example_17 {
    public static void main(String[] args) {

        int [] array = new int[] {-3, -4, -5, 6, 8, 4, 7, 9, -1, 3};

        for (int i = 0; i < array.length; i++) {
            array[i] *= -1 ;
        }
        printArray(array);
    }
}
