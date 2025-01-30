import java.util.*;
public class cal {
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the valu of a = ");
      int a = sc.nextInt();
      System.out.print("Enter the value of b = ");
      int b = sc.nextInt();
      char ch = sc.next().charAt(0);
      switch (ch)
      {
      case '+' : System.out.println(a+b);
      break;
      case '-' : System.out.print(a-b);
      break;
      case '/' : System.out.println(a/b);
      break;
      default : System.out.println("sorry can't help you.... ");
      }
   }
}
