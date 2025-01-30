package loop;
import java.util.*;
public class prime1 {
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number =  ");
      int n = sc.nextInt();
      if(n <= 1){
         System.out.print("Number is not prime ");
      }
         else if(n == 2)
         {

            System.out.print("Numbeer is prime ");

         }
         else
         {
            boolean isprime = true;
            for(int i = 2; i <= n-1; i++)
            {
               if(n % i == 0)
               {
                  isprime = false;
                  break;

               }
            }
               if(isprime){
                  System.out.print("number is prime ");
               }
               else{
                  System.out.print("number is not prime");
               }
               

               
            }

         }
      }
   
   

