import java.util.*;
public class function2 {
   public static int sum( int num1 ,int num2 )// prammeter of or formal prameeter
   {
      int sum = num1 + num2;
      return sum;

   }
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      
       int c = sum( a, b); // and is actual parameter or argument
      System.out.print("sum of the value is   " + c);

   }
}
