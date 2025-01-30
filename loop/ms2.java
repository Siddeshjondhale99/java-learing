package loop;
import java.util.*;

public class ms2 {
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value =  ");

      int n = sc.nextInt();
      while(n > 0)
      {
         int number = n % 10;
         System.out.print(number);
          n = n/10;
      }
      // System.out.println();
   }
   
}
