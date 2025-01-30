package loop;
import java.util.*;

public class ms7 {
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      do{
         System.out.print("Enter the number =  ");
         int number = sc.nextInt();
         if(number % 10 == 0)
         {
            break;

         }
         
      }
      while(true);
   }
   
}
