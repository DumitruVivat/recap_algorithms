import static util.ArrayUtil.createMatrix;
import static util.ArrayUtil.printMatrix;

public class Example_30 {
    public static void main(String[] args) {
        int[][] matrix = createMatrix(3, 4, 1, 10);
        printMatrix(matrix);
        System.out.println("===================");
        replaceEvenElementToSquare(matrix);
        printMatrix(matrix);
    }

    public static void replaceEvenElementToSquare(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(i % 2 == 0 && j % 2 == 0) {
                    matrix[i][j] = matrix[i][j] * matrix[i][j];
                }
            }
        }
    }
}
