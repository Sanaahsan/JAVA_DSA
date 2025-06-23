import java.util.*;

// Keep taking integer inputs from the user and keep storing them in an arraylist until the user input is '0'. Then at last print the arraylist and then print the sum of all the numbers in the arraylist. Write two custom functions "evenSum()" and "oddSum()" to return the sum of all the even numbers and odd numbers respectively.

public class Practice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        

        while (true) { // for infinite loop
            int n = in.nextInt();
            if (n == 0) {
                break;
            }

            list.add(n);
            

        }
        System.out.println(list);
        
        System.out.println("Sum of all the odd numbers is: "+ oddSum(list));
        System.out.println("Sum of all the even numbers is: "+ evenSum(list));
        System.out.println("Sum of all the numbers is: "+ sum(list));
        remove(list);
        System.out.println("List after removing even numbers: " + list);
        

        

    }
    static int oddSum(ArrayList<Integer> list){
        int odd=0;
        for(int i=0; i<list.size();i++){
            
            if(list.get(i)%2!=0){
                odd= odd +list.get(i);
            }
        }

        return odd;
    }

    static int evenSum(ArrayList<Integer> list){
        int even= 0;
        for(int i=0;i<list.size();i++)  {
            if(list.get(i)%2==0){
                even= even+list.get(i);
            }
        }        

          return even;
    }
    
    static int sum(ArrayList<Integer> list){
        int sum= 0;
        for(int i=0;i<list.size();i++)  {
            sum = sum + list.get(i);
        }        

          return sum;
    }

    // write a custom function that accepts a list and then removes all the even numbers from it.

    static void remove(ArrayList<Integer> list){
        for(int i=0;i<list.size();i++)  {
            if(list.get(i)%2==0){
                list.remove(list.get(i));
            }
            
    }

    }}
    
