package loop;
import java.util.*;

public class jay5 {
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the value = ");
      int n = sc.nextInt();
      int i = 1;
      int sum = 0;
      while(i <= n)
      {
         System.out.println(i);
         
         sum += i;// there cycle is continous going on
         

      
         i++;
         
      }
      System.out.print(" the sum of the vale"   +   sum);
   }
   
}
