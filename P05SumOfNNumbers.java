import java.util.Scanner;
public class P05SumOfNNumbers{
    public static void main(String[] args){
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n to find the sum of first n numbers");
        int n = sc.nextInt();
        System.out.println("Sum of first " + n + " numbers using for loop");
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println("Sum of first " + n + " numbers is " + sum);
        System.out.println("Sum of first " + n + " numbers using while loop");
        sum = 0;
        int i = 1;
        while(i <= n){
            sum += i;
            i++;
        }
        System.out.println("Sum of first " + n + " numbers is " + sum);
        System.out.println("Sum of first " + n + " numbers using do while loop");
        sum = 0;
        i = 1;
        do{
            sum += i;
            i++;
        }while(i <= n);
        System.out.println("Sum of first " + n + " numbers is " + sum);
        sc.close();
    }
}