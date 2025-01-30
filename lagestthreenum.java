import java.util.*;
public class lagestthreenum {
   public static void main(String argsa[])
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the first number = ");
      int A = sc.nextInt();
      System.out.print("Enter the Second number = ");
      int B = sc.nextInt();
      System.out.print("Enter the third number = ");
      int C = sc.nextInt();
      if(A >= B && A >= C )
      {
         System.out.println(A);

      }
      else if(B > C)
      {
         System.out.println(B);
      }
      else
      {
         System.out.println(C);
      }
      



   }
   
}
