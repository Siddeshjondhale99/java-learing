import java.util.*;
public class linersearch
{
   public static int linaer( int marks[], int key){
      for(int i = 0 ; i <= marks.length ; i++)
      {
         if(marks[i] == key ){
             return i;
         }
      }
      return -1;
   }

   public static void main(String args[])
   { 
      int marks[] = {20,30,40,50,60,80};
      Scanner sc = new Scanner(System.in);
      int key = sc.nextInt();
      int index =linaer(marks, key);
      {
         if(index == -1){
            System.out.print("not found");
         }
         else{
            System.out.println("the index value " +index);
         }
      }

   }
}
