// Write a code to find the sum of digits of any given number
// Example: 1234 => 1+2+3+4 = 10
import java.util.Scanner;

class DigitSumCalculator {
    private int number; 

    public DigitSumCalculator(int number) {
        this.number = number;
    }

    public int calculateSumOfDigits() {
        int sum = 0;
        int tempNumber = number; 
        while (tempNumber > 0) {
            sum += tempNumber % 10;
            tempNumber = tempNumber / 10;
        }
        return sum;
    }
}

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Create an object of the DigitSumCalculator class
        DigitSumCalculator calculator = new DigitSumCalculator(number);

        // Use the method to calculate the sum of digits
        int sum = calculator.calculateSumOfDigits();
        System.out.println("Sum of digits: " + sum);
        sc.close();
    }
}
