import java.util.*;
public class statement1 
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter you age = ");
      int age = sc.nextInt();
      if(age >= 18)
      {
         System.out.println("Adult");
      }
      if(age >= 13 && age < 18)
      {
         System.out.println("teenager");

      }
      else
      {
         System.out.println("Not Adult");
      }

   }
  
   
}
