public class day2
 {
   public static void update(int marks[])
   {
    for(int i = 0 ; i < marks.length ; i++)
    {
       marks[i] = marks[i] + 1 ;
    }
   }
   public static void main(String args[])
   {
      int marks[] = {20,30,40,50}; // array made
      update(marks);// calling the update function
      //marks print 
      for(int i = 0 ; i < marks.length ; i++)
      {
         System.out.print(marks[i] + " ");
      }
      System.out.println();

      

   }
   
}
