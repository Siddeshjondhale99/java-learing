import java.util.*;
public class largestnumber {
   public static int getlargest(int number[]){
      int largest = Integer.MIN_VALUE;//-integer value
      int smallest = Integer.MAX_VALUE; // +integer
      for(int i = 0; i < number.length; i++){
         if(largest < number[i])
         {
            largest = number[i];
         }
         if(smallest > number[i])
         {
            smallest = number[i];
         }
      }
      System.out.println("The smallest value "  +smallest);
      return largest;
   }
   
   public static void main(String args[]){
      int number[] = {5,2,3,4,5,6};
      System.out.println("the largest number" +getlargest(number));
   }
   
   
}
