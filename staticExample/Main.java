package staticExample;
// Human and Main are in the same folder so no need to import
public class Main {
    public static void main(String[] args) {
        // creating objects of class Human
        Human  Sana = new Human(24,"Sana",10000,false);
        Human  Harsh= new Human(23,"Harsh",10000,false);

         System.out.println(Harsh.age);  

         System.out.println(Human.population);
         System.out.println(Sana.population);

        
}

static void fun(){
    // greeting(); cannot use this because it requires an instance but the function we using in it does not depend on the instance
    // we cannot access non static stuff without referencing their instances in a static context

    // this is how it is referenced
     Main obj= new Main();
     obj.greeting();
}
void fun2(){
    greeting();
}

// this is not static so it belongs to an object
void greeting(){
    System.out.println("Greeting");
}
}