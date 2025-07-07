 package staticExample;
// 1.// note:outside classes cannot be static i.e, it can't be static class InnerClasses,only inner classescan be static

//     class Test{

//     static String name;
      
//         public Test(String name){
//             Test.name=name;
//         }
//      }
// public class InnerClasses {
//  public static void main(String[] args) {
//     Test a= new Test("Sana");
//     Test b= new Test("Harsh");

//     System.out.println(a.name);
//     System.out.println(b.name);
//  }
// }

// // o/p Harsh
// //     Harsh

// 2.
public class InnerClasses {

    static class Test{
        String name;
        public Test(String name){
            this.name=name;
        }
    }
    public static void main(String[] args) {
        
        Test a= new Test("Sana");
        Test b= new Test("Harsh");

        System.out.println(a.name);
        System.out.println(b.name);

    }
}
// o/p Sana
    //   Harsh

