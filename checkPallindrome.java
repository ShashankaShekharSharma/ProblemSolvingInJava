//Write a code to determiine if a given string is a pallindrome or not
import java.util.*;

class PallindromChecker{
    private String a;
    public PallindromChecker(String a){
        this.a = a;
    }
    public boolean check(){
        int i = 0;
        int j = a.length()-1;
        while(j>i){
            if(a.charAt(i) != a.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

public class checkPallindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String a = sc.nextLine();
        PallindromChecker checker = new PallindromChecker(a);
        if(checker.check()){
            System.out.println("The string is a pallindrome");
    }else{
        System.out.println("The string is not a pallindrome");
    }
        sc.close();
    }   
}