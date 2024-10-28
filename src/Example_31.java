import static util.ArrayUtil.createMatrix;
import static util.ArrayUtil.printMatrix;

public class Example_31 {
    public static void main(String[] args) {
        int[][] matrix = createMatrix(3, 4, 1, 20);
        printMatrix(matrix);
        System.out.println(sumDiagonal(matrix));
    }

    public static int sumDiagonal(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }
}
