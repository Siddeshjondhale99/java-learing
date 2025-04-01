public class daytwo{
   public static void update(int marks[])
   {
      for(int i = 0 ; i < marks.length; i++)
      {
         marks[i] = marks[i] * 3;
      }
   }
   public static void main(String args[])
   {
      int marks[] = { 10,20,30,40};
      update(marks);
      for(int i = 0 ; i < marks.length ; i++)
      {
         System.out.print(marks[i] + " ");
      }
      System.out.println();
   }
   
}
