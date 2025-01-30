import java.util.*;
public class calculator
 {
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the Value of a = ");
      int a = sc.nextInt();
      System.out.print("Enter the Value of b = ");
      int b = sc.nextInt();
      System.out.print("Enter the Symbol = ");
      char ch = sc.next().charAt(0);
      switch(ch)
      {
         case '+': System.out.println(a+b);
         break;
         case '-' : System.out.println(a-b);
         break;
         case '*' : System.out.println(a*b);
         break;
         case '/': System.out.println(a/b);
         break;
         default : System.out.println("my calculator is not so advance");

      }
   }
   
}
