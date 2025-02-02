import java.util.*;

public class Syntax {
    public static void main(String[] args) {
        
        ArrayList<String> Fruits= new ArrayList<>();
        ArrayList<Integer> list= new ArrayList<>();
        Scanner sc= new Scanner(System.in);

        Fruits.add("Papaya");
        Fruits.add("Apple");
        Fruits.add("Mango");
        Fruits.add("Grapes");
        Fruits.add("Orange");

        // list = {papaya,apple, mango, grapes, orange};

        System.out.println(Fruits);
        Fruits.set(1, "Guava");
        Fruits.remove(3);
        System.out.println(Fruits);
        System.out.println(Fruits.contains("Orange")); //whether the arraylist contains the element orange or not,will return true coz it's present

        //input syntax

        for(int i=0; i<5; i++){
            list.add(sc.nextInt());
            System.out.println(list);
        }

        // get item at any index
        for(int i=0; i<5; i++){
            System.out.println(list.get(3));
        }

    }

}
