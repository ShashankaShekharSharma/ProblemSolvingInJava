// Output of this program is as follows
//    1
//   121
//  12321
// 1234321
import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");
            }
            for (int j=i-1; j >= 1; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
