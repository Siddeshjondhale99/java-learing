public class functionoverloading {
   //sum of two number
   public static int sum(int a,int b)
   {
      return a+b;
   }
   // sum of three number
   public static int sum(int a , int b ,int c){
      return a+b+c;
   }
   public static void main(String args[])
   {
      System.out.println(sum(5,2));
      System.out.println(sum(4,2,3));
      // this is the function overloading
      // multipal funtion run in the same class
   }
   
}
