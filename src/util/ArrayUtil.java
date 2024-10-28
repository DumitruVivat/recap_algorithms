package util;

import java.util.Random;

public class ArrayUtil {
    public static void fillArrayWithRandomIntegers(int[] array, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(max - min + 1) + min; // Fill with random integers in the specified range
        }
    }
    public static void printArray(int[] array) {
        System.out.print("["); // Start with an opening bracket
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]); // Print the element
            if (i < array.length - 1) {
                System.out.print(", "); // Add a comma if it's not the last element
            }
        }
        System.out.print("]"); // End with a closing bracket
        System.out.println(); // Move to a new line
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("  [");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
                if (j < matrix[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("]");
            if (i < matrix.length - 1) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static int[][] createMatrix(int rows, int cols, int min, int max) {
        Random random = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(max - min + 1) + min;
            }
        }
        return matrix;
    }
}
