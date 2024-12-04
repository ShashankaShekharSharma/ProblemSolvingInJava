import java.util.*;
class OddEven{
    private int n;
    public OddEven(int n){
        this.n = n;
    }
    public void EvenCheck(){
        if(n%2==0){
            System.out.println(n + " is an even number");
        }
        else{
            System.out.println(n + " is not an even number");
        }
    }
    public void OddCheck(){
        if(n%2!=0){
            System.out.println(n + " is an odd number");
        }
        else{
            System.out.println(n + " is not an odd number");
        }
    }
}
public class P03OddEvenCheck{
    public static void main(String[] args) {
        Scanner sd = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sd.nextInt();
        OddEven oddEven = new OddEven(n);
        oddEven.EvenCheck();
        oddEven.OddCheck();
    }
}