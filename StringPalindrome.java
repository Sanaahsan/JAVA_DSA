import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String word = input.next();
        String reversed="";

         for(int i=word.length()-1; i>=0; i--){
            reversed= reversed + word.charAt(i);
         }
         if(word.equals(reversed)){
            System.out.println("Palindrome");
         }
         else{
            System.out.println("Not a palindrome");
         }
    }
}
