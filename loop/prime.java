package loop;
import java.util.Scanner;

public class Prime {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter your number: ");
      int n = sc.nextInt();

      if (n <= 1) {
         System.out.println("Number is not prime");
      } else if (n == 2) {
         System.out.println("Number is prime");
      } else {
         boolean primenumber = true;
         for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
               primenumber = false;
               break; // Exit loop as soon as a factor is found
            }
         }
         if (primenumber) {
            System.out.println("Number is prime");
         } else {
            System.out.println("Number is not prime");
         }
      }
      sc.close(); // Always close the scanner
   }
}
