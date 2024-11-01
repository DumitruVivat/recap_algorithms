public class Example_22 {
    public static void main(String[] args) {

        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        double average = calculateAverage(numbers);
        System.out.println("Average is: " + average);
    }

    private static double calculateAverage(int[] numbers) {
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }
}
