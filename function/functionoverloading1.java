// function overloading diff perameter
public class functionoverloading1 {
   public static int sum(int a,int b){
      return a+b;
   }
   public static float sum(float a, float b){
      return a+b;
   
   }
   public static void main(String args[]){
      System.out.println(sum(2,3));
      System.out.print(sum(2.22f,3.33f));
   }
}
