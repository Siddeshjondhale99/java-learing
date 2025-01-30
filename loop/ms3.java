package loop;
import java.util.*;
public class ms3 {
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int rev = 0;
      while(n > 0)
      {
         int last = n % 10;
         rev = (rev*10)+last;
         n = n/10;
         
      }
      System.out.print(rev);
   }
   
}
