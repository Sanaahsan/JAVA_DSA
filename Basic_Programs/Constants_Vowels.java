
import java.util.Scanner;

public class Constants_Vowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char letter= input.next().trim().charAt(0);
        letter=Character.toLowerCase(letter);
        if(letter=='a'|| letter=='e'|| letter=='i'||letter=='o'||letter=='u' ){
            System.out.println("Vowel");

        }
        else{
            System.out.println("Consonant");
        }
    }
}
