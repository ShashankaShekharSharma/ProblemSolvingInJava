//Sum of ASCII values of each vowel character in a String
import java.util.Scanner;

public class AsciiVowelSum {
        public static void main(String[] args) {
        String s; int sum = 0;
        Scanner sc = new Scanner(System.in);
        s=sc.next();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) =='a'||s.charAt(i) =='e'||s.charAt(i) =='i'||s.charAt(i) =='o'||s.charAt(i) =='u') {
                sum = sum + s.charAt(i);
            }
        }
        System.out.println(sum);
    }
    
}
