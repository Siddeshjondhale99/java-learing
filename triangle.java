import java.util.*;
public class triangle{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("length of triangle = ");
      float length = sc.nextFloat();
      System.out.print("breath of triangle = ");
      float breath = sc.nextFloat();
      System.out.println("Area  of triangle = " + (length*breath));
      System.out.println("parimeter of triangle = " + 2 *(length + breath));


   }
}