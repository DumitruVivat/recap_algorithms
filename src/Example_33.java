import static util.ArrayUtil.createMatrix;
import static util.ArrayUtil.printMatrix;

public class Example_33 {
    public static void main(String[] args) {
        int[][] matrix = createMatrix(3, 4 , 1, 15);
        printMatrix(matrix);
        findMaxRows(matrix);
    }
    private static void findMaxRows(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            int max = matrix[i][0];
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            System.out.println("max number of row: "+ max);
        }
    }
}
