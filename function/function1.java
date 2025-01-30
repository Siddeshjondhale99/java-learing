import java.util.*;
public class function1
 {
   public static void sum()// these is the function
   {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int sum = a + b;
      System.out.print("sum value is  " + sum);
      return;
   }
   public static void main(String args[])
   {
      sum();
   }
   
}
