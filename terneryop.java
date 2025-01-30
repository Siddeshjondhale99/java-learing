import java.util.*;
public class terneryop {
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the element");
      int A = sc.nextInt();
      String element = ((A % 2 ) == 0)? "even" : "odd";// ternery oprator we can these with out condition  statement
      System.out.print(element);
   }
   
}
