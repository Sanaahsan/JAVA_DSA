import java.util.*;

public class GCD {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        
        int GCD=1;

        for(int i=1;i<=Math.min(n1,n2);i++){
            if(n1%i==0 && n2%i==0){
                GCD=i;
            }
        }
        System.out.println(GCD);

}
}

