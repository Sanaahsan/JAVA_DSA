import java.util.Scanner;
public class Rev_String {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next().trim();
        String rev= "";

        for(int i=word.length()-1; i>=0;i--){
             char ch= word.charAt(i); 
            rev=rev+ch;

        }
        System.out.println(rev);
    }   
} 
