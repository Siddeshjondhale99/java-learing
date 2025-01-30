package loop;
import java.util.*;

public class pattern1 {
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number = ");
      for(int i = sc.nextInt(); i <= 6; i++)
      {
         for(int j = 1; j <= i ; j++){
            System.out.print("*");
         }
         System.out.println();
      }
   }
   
}
