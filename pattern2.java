// Output of this program is as follows
// 1
// 21
// 321
// 4321

import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            for(int j = i; j >=1; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
