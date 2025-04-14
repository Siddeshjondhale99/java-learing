import java.util.*;
public class binary {
   public static int binarysearch(int number[] , int key){
      int start = 0;
      int end = number.length - 1 ;
      while(start <= end){
         int mid = (start + end )/2;
         if(number[mid] == key){
            return mid;
         }
         if(number[mid] < key ){
            return mid + 1;
         }
         else{
            return mid-1;
         }
      }
      return -1;

   }
   public static void main(String args[])
   { 
      int number[] = {1,3,5,4,6,7};
       
      int key = 25; 
      System.out.print("Index of the number is  = " + binarysearch(number, key));

   }
   
}
