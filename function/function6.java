import java.util.*;
public class function6 {
   public static boolean isprime(int n)
   {
      boolean isprime = true;
      for(int i = 2 ; i <=n-1;i++)
      {
         if(n % i ==0)
         {
            isprime = false;
         }
      }
      return isprime;
   }
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
         System.out.print(isprime(n));
   }
   
}
