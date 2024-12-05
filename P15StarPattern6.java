//Butterfly pattern
// *                 *
// * *             * *
// * * *         * * *
// * * * *     * * * *
// * * * * * * * * * *
// * * * * * * * * * *
// * * * *     * * * *
// * * *         * * *
// * *             * *
// *                 *
public class P15StarPattern6 {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < i+1; j++){
                System.out.print("*");
            }
            for(int k = 0; k < 2*(5-i-1); k++){
                System.out.print(" ");
            }
            for(int l = 0; l < i+1; l++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0; i < 5; i++){
            for(int j = 5; j > i; j--){
                System.out.print("*");
            }
            for(int k = 0; k < 2*i; k++){
                System.out.print(" ");
            }
            for(int l = 5; l > i; l--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
