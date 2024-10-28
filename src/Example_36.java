import static util.ArrayUtil.createMatrix;
import static util.ArrayUtil.printMatrix;

public class Example_36 {
    public static void main(String[] args) {
        int[][] matrix = createMatrix(2, 3, -10, 10);
        printMatrix(matrix);
        System.out.println("===================");
        replaceNegativeNumbers(matrix);
    }
    private static void replaceNegativeNumbers(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = -matrix[i][j];
            }
        }
        printMatrix(matrix);
    }
}
