import java.util.*;
public class function8 {
   public static  boolean isprime( int n)
   {
      boolean isprime = true;
      for(int i=2;i<=Math.sqrt(n);i++)
      {
         if(n % i == 0)
         {
            isprime = false; 
         }
      }
      return isprime ;
   }
   public static void primerange(int a)
   {
      for(int i = 2 ; i <= a; i++)
      {
         if(isprime( a))
         {
            System.out.print(i + " ");
         }
      }
      System.out.println();

   }
   public static void main(String args[])
   {
      // Scanner sc = new Scanner(System.in);
      // int n = sc.nextInt();
      System.out.println(primerange(10));
      

   }
   
}
