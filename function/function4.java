import java.util.*;
public class function4 {
   public static int  factorial(int n)
   {
      int f =1;
      for (int i = 1 ; i <=n ; i++)
      {
         f = f * i;
      }
      return f;

   }
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the Factorial = ");
      int n = sc.nextInt();
      int c = factorial(n);
      System.out.print("The facorial number is  =  " +   c);
   }
   
}
