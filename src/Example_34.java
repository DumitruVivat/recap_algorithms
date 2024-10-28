import static util.ArrayUtil.createMatrix;
import static util.ArrayUtil.printMatrix;

public class Example_34 {
    public static void main(String[] args) {
        int[][] matrix = createMatrix(4, 4, 1, 15);
        printMatrix(matrix);
        findSumInColumns(matrix);
    }
    private static void findSumInColumns(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < cols; i++) {
            int sum = 0;
            for (int j = 0; j < rows; j++) {
                sum += matrix[i][j];
            }
            System.out.println("sum in columns: " + sum);
        }
    }
}
