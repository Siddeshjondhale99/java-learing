import java.util.*;
public class pass {
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the student marks = ");
      int marks = sc.nextInt();
//       if(marks < 35)
//       {
//          System.out.println("Fail");
//       }
//       else
//       {
//          System.out.println("pass");
//       }
//    }
   
// }
 String element = (marks < 35)? "fail" : "pass";
 System.out.println(element);
   }
   }
// this is done by the two method
