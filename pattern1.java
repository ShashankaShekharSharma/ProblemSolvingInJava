// Output of this program is as follows
// 1
// 12
// 123
// 1234

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
