import java.util.*;
public class function5 {
   public static int  factorial(int n)
   {
      int f =1;
      for (int i = 1 ; i <=n ; i++)
      {
         f = f * i;
      }
      return f;

   }
   public static int bio(int n , int r)
   {
      int function7 =  factorial(n);
      int function8 =  factorial(r);
      int combination = factorial(n-r);
      int c = function7/(function8*combination);
      return c;
   }
   public static void main(String args[])

   {
      Scanner sc = new Scanner(System.in);
      // int a = sc.nextInt();
      // int b = sc.nextInt();
      int u= bio(5,2);
      System.out.print("binomail funtion  = "  +u);
   }
}
