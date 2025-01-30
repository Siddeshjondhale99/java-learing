package loop;

public class pattern2 {
   public static void main(String args[])
   {
      for(int i = 1 ; i <= 4 ; i++)// for the line
      {
         for(int j = 1 ; j <= 4-i+1 ; j++)// for the star
         { 
            System.out.print("*");// systeprint
         }
         System.out.println();// these for the next line
      }
   }
   
}
