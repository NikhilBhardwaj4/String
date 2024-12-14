package Strings;
import java.util.*;

public class Palindro {
   static  boolean isplaindorm(String word){
        String rev ="";
        for(int i=word.length()-1; i>=0;i--){
            rev=rev+word.charAt(i);
        }
       return word.equals(rev);
   }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int count =0 ;
        System.out.println("enter a sentence: ");
        String input = sc.nextLine();
        StringTokenizer st = new StringTokenizer(input," .?!");
        while(st.hasMoreTokens()){
            String word = st.nextToken().toLowerCase();
            if(isplaindorm(word)){
                System.out.println("The palindrome Words are: " +word );
                count++;
            }
        }
        System.out.println(count);
    }
}
