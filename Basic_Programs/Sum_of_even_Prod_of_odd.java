import java.util.Scanner;
public class Sum_of_even_Prod_of_odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum=0;
        int product=1;
        while(num>0){
            int temp = num%10;
            if(temp%2==0){
                sum= sum + temp;
            }
            else{
                product=product* temp;
            }
            num=num/10;
        }
        System.out.println(sum);
        System.out.println(product);

    }
}
