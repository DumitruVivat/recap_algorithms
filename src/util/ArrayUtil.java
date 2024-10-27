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
}
