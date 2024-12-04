//Calculate the frequency of each character in a string
import java.util.*;
class Fequency{
    private String a;
    public Fequency(String a){
        this.a = a;
    }
    public void check(){
        int[] freq = new int[a.length()];
        char[] string = a.toCharArray();
        for(int i = 0; i < a.length(); i++){
            freq[i] = 1;
            for(int j = i+1; j < a.length(); j++){
                if(string[i] == string[j]){
                    freq[i]++;
                    string[j] = '0';
                }
            }
        }
        System.out.println("Character Frequency");
        for(int i = 0; i < freq.length; i++){
            if(string[i] != ' ' && string[i] != '0'){
                System.out.println(string[i] + " - " + freq[i]);
            }
        }
    }
}
public class FrequencyOfCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String a = sc.nextLine();
        Fequency frequency = new Fequency(a);
        frequency.check();
    }
}
