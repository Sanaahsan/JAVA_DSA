import java.util.Scanner;
public class Products_of_digits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num= input.nextInt();
        int product=1;
        while(num>0){
           int temp=num%10;
           product= product*(temp);
           num=num/10;
        }
        System.out.println(product);

    }
}
