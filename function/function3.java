import java.util.*;
public class function3 {
   public static int product(int a , int b)
   {
      int product1 = a * b;
      return product1;
   }
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int num2 = sc.nextInt();
       int c = product(num , num2);
       System.out.print(c);

   }
}
