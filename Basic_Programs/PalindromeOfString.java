import java.util.Scanner;

public class PalindromeOfString {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        String word= input.next();
        
        
       int countV=0;
       int countC=0;

       for(int i= word.length()-1;i>=0;i--){
        char ch= word.charAt(i);
           if( Character.toUpperCase(ch)=='A'|| Character.toUpperCase(ch)=='E'|| Character.toUpperCase(ch)=='I'|| Character.toUpperCase(ch)=='O'|| Character.toUpperCase(ch)=='U'){
               countV++;
           }
           else{
            countC++;
           }

       }
       System.out.println(countV);
       System.out.println(countC);
    }
}
       

        
       
