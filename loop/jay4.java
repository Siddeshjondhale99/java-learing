package loop;
import java.util.*;


public class jay4 {
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("enter the valu = ");
      int n = sc.nextInt();
      int sum = 0;
      int i = 1;
      while(i <= n)
      {
         sum += i;
         i++;
      }
      System.out.print(sum);
   }
   
}
