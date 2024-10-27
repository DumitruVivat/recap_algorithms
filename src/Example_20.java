public class Example_20 {
    public static void main(String[] args) {
        int[] numbers = { 1, 3, 4, 19, 3 };
        int numberToFind = 2;
        if (isNumberPresent(numbers, numberToFind))
        {
            System.out.println("Is present");
        }
        else
        {
            System.out.println("Not present");
        }
    }

    public static boolean isNumberPresent(int[] numbers, int numberToFind) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == numberToFind){
                return true;
            }
        }
        return false;
    }
}
