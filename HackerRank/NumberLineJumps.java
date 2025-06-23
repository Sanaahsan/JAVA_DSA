public  class NumberLineJumps{
    public static void main(String[] args) {
      System.out.println(kangaroo(1, 9, 1,2));  
    }

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
            if(x1==x2 ){
               if(v1==v2){
                return "YES";
               }
               else{
                return "NO";
               }
            }
            
            if(x1>x2 && v1>=v2 || x1<x2 && v1<=v2){
                return "NO";
            }
            
            else if((x1-x2)%(v2-v1)==0){
                return "YES";
            }
            else {
                return "NO";
            }
    
        }
}

