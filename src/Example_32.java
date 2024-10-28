import static util.ArrayUtil.*;

public class Example_32 {
    public static void main(String[] args) {
        int[][] matrix = createMatrix(3, 3, 1, 10);
        printMatrix(matrix);
        int[] average = calculateRawAverages(matrix);
        System.out.print("Average: " );
        printArray(average);
    }
    public static int[] calculateRawAverages(int[][] matrix) {
        int[] average = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            average[i] = sum / matrix.length;
        }
        return average;
    }
}
