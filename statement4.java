// this code of if and else if 
// in this if the conddion is true the another is not check
// they reduce the compile time
import java.util.*;
public class statement4 {
  public static void main(String args[]) 
  {
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter the age's = ");
   int age = sc.nextInt();
   if(age >= 18 )
   {
      System.out.println("Adult");
   }
   else if (age >= 13 && age < 18)
   {
      System.out.println("teenager");
   }
   else
   {
      System.out.println("Children");
   }

  }
}
