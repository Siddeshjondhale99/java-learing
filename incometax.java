import java.util.*;
public class incometax {
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter your income = ");
      float income = sc.nextFloat();
      if(income < 300000) 
      {
         System.out.println("zero income tax for you");
         System.out.println(income);
      }
      else if(income >= 300000 && income <= 1000000)
      {
         System.out.println("20 Persent");
         System.out.println(income*(0.2));

      }
      else
      {
         System.out.println("30 Persent");
         System.out.println(income*(0.3));


      }

      
   }
   
}
