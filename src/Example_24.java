import static util.ArrayUtil.fillArrayWithRandomIntegers;
import static util.ArrayUtil.printArray;

public class Example_24 {
    public static void main(String[] args) {

        int[] array = new int[10];
        fillArrayWithRandomIntegers(array,1, 10);
        printArray(array);
        System.out.println(countPrimeNumber(array));
    }

    public static int countPrimeNumber(int[] array) {
        int count = 0;
        for (int j : array) {
            if (isPrime(j)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
