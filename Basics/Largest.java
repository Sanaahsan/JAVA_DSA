import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();

        
        if(num1==num2 && num2==num3 && num3==num4 && num4==num5){
            System.out.println("All are equal");
        }
        else{
            System.out.println("The larger number is: " + Math.max(num1, Math.max(num2,Math.max(num3,Math.max(num4,num5)))));
        }
        
        
        
        // if(num1>num2){
        //     System.out.println(num1+" Maximum");

        // }
        // else if(num2>num1){

        
        //     System.out.println(num2+ " is maximum");
        // }
        // else{
        //     System.out.println("Both are equal");

        // }
    }
}
