import java.util.Scanner;
public class Even_num_bw_1_to_n {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i=1; i<=n; i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
            

       }
        
        
     
}
