import java.util.*;
class MultiplicationTable{
    private int n;
    public MultiplicationTable(int n){
        this.n = n;
    }
    public void table(){
        for(int i = 1; i <= 10; i++){
            System.out.println(n + " * " + i + " = " + (n*i));
        }
    }
}
public class P06MultipicationTable{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print the multiplication table: ");
        int n = sc.nextInt();
        MultiplicationTable table = new MultiplicationTable(n);
        table.table();
        sc.close();
    }
}