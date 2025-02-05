 import java.util.*;
 i
 public class function7 {
   public static boolean isprime(int n){
      boolean isprime = true;
      for(int i = 2 ; i <= Math.sqrt(n); i++)
      {
         if(n % i == 0)
         {
            isprime = false;
         }
      }
      return isprime;
   }
   
}
