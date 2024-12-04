import java.util.*;
class Calculator{
    private int a,b;
    public Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void add(){
        System.out.println("Addition of " + a + " and " + b + " is: " + (a+b));
    }
    public void sub(){
        System.out.println("Subtraction of " + a + " and " + b + " is: " + (a-b));
    }
    public void mul(){
        System.out.println("Multiplication of " + a + " and " + b + " is: " + (a*b));
    }
    public void div() {
        System.out.println("Division of " + a + " and " + b + " is: " + ((float)a / b));
    }
}
public class P04CalculatorUsingSwitch {
    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter the operation you want to perform: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int choice = sc.nextInt();
        Calculator calculator = new Calculator(a,b);
        switch(choice){
            case 1:
                calculator.add();
                break;
            case 2:
                calculator.sub();
                break;
            case 3:
                calculator.mul();
                break;
            case 4:
                calculator.div();
                break;
            default:
                System.out.println("Invalid choice");
        }
        sc.close();
    }
}
