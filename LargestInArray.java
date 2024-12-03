import java.util.*;

class largestNumber{
    private int[] a;
    public largestNumber(int[] a){
        this.a = a;
    }
    public int findLargest(){
        int max = a[0];
        for(int i = 1; i < a.length; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        return max;
    }
}
public class LargestInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements: ");
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        largestNumber largest = new largestNumber(a);
        int max = largest.findLargest();
        System.out.println("The largest number is: " + max);
        sc.close();
    }
}
