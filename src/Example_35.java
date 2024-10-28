import static util.ArrayUtil.createMatrix;
import static util.ArrayUtil.printMatrix;

public class Example_35 {
    public static void main(String[] args) {
        int[][] matrix = createMatrix(2, 3, 1, 15);
        printMatrix(matrix);
        transposeMatrix(matrix);
    }

    public static void transposeMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] transpose = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        printMatrix(transpose);
    }
}
