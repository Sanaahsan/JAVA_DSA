public class Harsh {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Inside main function:"); //1
        System.out.println(a);
        System.out.println(b);
        swap(a, b); //2
        System.out.println("Inside main function:");//3
        System.out.println(a);
        System.out.println(b);     
    }

    static void swap(int n1,int n2){
        int temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("Inside swap method");//2  
        System.out.println(n1);
        System.out.println(n2);   
    }
    
}
