public class pairnumber {
   public static void pairnumber1(int number[]){
      for(int i = 0 ; i < number.length ; i++){
         int curr = number[i];
         for (int j = i+1 ; j < number.length ; j++){
            System.out.print("(" + curr + "," + j + ")");
         }
         System.out.println();
      }
   }
   public static void main(String args[])
   {
      int number[] = {2,4,6,8,10};
      pairnumber1(number 1);

   }
   
}
