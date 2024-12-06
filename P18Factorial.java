class Factorial{
    private int n;
    public Factorial(int n){
        this.n = n;
    }
    public void factorial(){
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact *= i;
        }
        System.out.println("Factorial of " + n + " is " + fact);
    }
}
public class P18Factorial {
    public static void main(String[] args) {
        Factorial f = new Factorial(5);
        f.factorial();
    }
}
