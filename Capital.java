package Strings;
import java.util.*;

public class Capital {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter a string");
//        String str = sc.nextLine();
//        String replace = str.replaceAll("\\s{2,}"," ").trim();
//        String[] bada = replace.split(" ");
//        System.out.print("Capital String is: ");
//        for(String words:bada){
//            System.out.print( words.substring(0,1).toUpperCase()+words.substring(1)+" ");
//        }
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string: ");
        String str = sc.nextLine();
        String replace  = str.replaceAll("\\s{2,}"," ");
        String[] ans = replace.split(" ");
        System.out.println("capital string is : ");
        for(String word:ans){
            System.out.print (word.substring(0,1).toUpperCase()+word.substring(1)+" ");
        }

    }
}
