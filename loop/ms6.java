package loop;
import java.util.*;

public class ms6 {
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      do{
         System.out.print("Enter yiur number =  ");
         int n = sc.nextInt();
         if(n % 10 == 0){
            break;
         }
         System.out.println(n);
         
      }while(true);
   }
   
}
