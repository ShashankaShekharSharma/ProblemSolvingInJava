import java.util.*;

public class HighestFreqDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a number to analyze its digits: ");
        int n = sc.nextInt();

        // Initialize an array to count digit frequencies
        int[] frequency = new int[10];
        while (n > 0) {
            int digit = n % 10;
            frequency[digit]++;
            n /= 10;
        }

        // Display frequency of each digit
        System.out.println("\nFrequency of each digit:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " times");
            }
        }

        // Find the digit with the highest frequency
        int mostFrequentDigit = 0;
        int highestFrequency = 0;
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > highestFrequency) {
                mostFrequentDigit = i;
                highestFrequency = frequency[i];
            }
        }

        // Display the result
        System.out.println("\nThe digit with the highest frequency is: " + mostFrequentDigit);
        System.out.println("It appeared " + highestFrequency + " times.");
        
        sc.close();
    }
}
