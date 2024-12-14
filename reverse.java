package Strings;
import java.util.*;

public class reverse {
    public static void main(String[] args) {
//        Scanner sc =  new Scanner(System .in);
//        String input = sc.nextLine();
//        StringBuilder str = new StringBuilder(input);
//        String reverse = str.reverse().toString();
//        System.out.println(reverse);

//        String str = "nikhil";
//        String str1 = str.toUpperCase();
//        System.out.println(str1);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        StringBuilder strb =new StringBuilder(str);
        String replace  = strb.reverse().toString();
        System.out.println(replace);
   }
}
