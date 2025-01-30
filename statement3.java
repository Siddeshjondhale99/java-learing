import java.util.*;
public class statement3 {
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the n number = ");
      int n = sc.nextInt();
      if (n % 2 == 0){
         System.out.println("Number is Even");
      }
      else{
         System.out.print("Number is ODD");
      }
   }
   
}
