import java.util.*;
public class celcius{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("celcius = ");

      int c = sc.nextInt();

      float fahrenheit = (c * 9 / 5) + 32;
      System.out.println(+ fahrenheit);

        }
}