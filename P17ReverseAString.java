import java.util.*;
class ReverseString{
    private String a;
    public ReverseString(String a){
        this.a = a;
    }
    public void reverse(){
        char[] string = a.toCharArray();
        for(int i = a.length()-1; i >= 0; i--){
            System.out.print(string[i]);
        }
    }
}
public class P17ReverseAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String a = sc.nextLine();
        ReverseString reverse = new ReverseString(a);
        reverse.reverse();
        sc.close();
    }
}
