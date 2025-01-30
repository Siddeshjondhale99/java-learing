import java.util.*;
public class area{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("length of tranagle = ");
      float length = sc.nextFloat();
      System.out.print("breath  of tranagle = ");

      float breath = sc.nextFloat();

   float triangle = 1/2*length * breath;
      System.out.print("area of tranagle = "+ triangle);

   }
}