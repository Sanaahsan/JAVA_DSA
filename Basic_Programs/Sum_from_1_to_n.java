import java.util.Scanner;
public class Sum_from_1_to_n {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sum =0;
        int n = input.nextInt();
        for(int i=1; i<=n;i++){
            sum= sum + i;
            
        }
        System.out.println(sum);

    }
}
