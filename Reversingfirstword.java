package Strings;
import java.util.*;
public class Reversingfirstword {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter your string");
        String str = sc.nextLine();
        int start = 0 ; int end =0;
        char[] chars = str.toCharArray();

        for(char ch : chars){
            boolean flag = end == chars.length-1;
            if (ch ==' '||  flag) {
                end = flag ? end :--end;
                char temp = chars[end];
                chars[end]=chars[start];
                chars[start]=temp;
                end++;
                start = end+1;
            }
            end++;
        }
        System.out.println(chars);
    }

}
