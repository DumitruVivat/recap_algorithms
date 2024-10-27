import java.util.Scanner;

public class Example_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input natural number N: ");
        int n = sc.nextInt();
        printNumberSeparateByComma(n);

    }
    private static void printNumberSeparateByComma(int numb){
        if(numb < 10){
            System.out.println(numb);
            return;
        }
        StringBuilder result = new StringBuilder();
        boolean firstDigit = true;

        while(numb > 0){
            int currentDigit = numb % 10;
            numb = numb / 10;

            if(!firstDigit){
                result.insert(0, ",");
            }
            result.insert(0, currentDigit);
            firstDigit = false;
        }
        System.out.println(result);
    }
}
