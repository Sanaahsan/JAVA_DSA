import java.util.Scanner;


public class Fibonacci{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n1=0;
        int n2=1;
        int n = input.nextInt();

        if(n<=0){
            System.out.println("Harsh behen ka l****");
        }

        else if(n==1){
            System.out.print(n1);
        }
        else if(n==2){
            System.out.print(n2);
        }

        
        else {
            int temp=0;
            
            for(int i=3; i<=n; i++){
                temp = n1+n2;
                
                n1=n2;
                n2=temp;


                
            }
            System.out.println(temp);
        }

    }   
}
