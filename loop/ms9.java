package loop;
import java.util.*;

public class ms9 {
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
   
   do{
      System.out.print("Enetr the number = ");
      int number = sc.nextInt();
      if(number % 10 == 0){
         continue;
      }
      System.out.println("your number is =   "  + number);
   }while(true);
   

   }
  
   
}
