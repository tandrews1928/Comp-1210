/**
*Activity 007
*Tyler Andrews-Comp1210-06.
*10/23/17
*/
public class Scores {
   private int[] numbers;
   /**
   *constructs everything.
   *@param numbersIn - the list of data.
   */ 
   public Scores(int[] numbersIn) {
      numbers = numbersIn;
   }
   /**
   *finds evens.
   *@return evens - the list of data.
   */ 
   public int[] findEvens() {
      int numberEvens = 0;
      int count = 0;
   
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {      
            numberEvens++;
         }
      }
      int[] evens = new int[numberEvens];
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            evens[count] = numbers[i];
            count++;
         }
      }
      return evens;
   }
   /**
   *finds evens.
   *@return odds - the list of data.
   */ 
   
   public int[] findOdds() {
      int numberOdds = 0;
      int count = 0;
   
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 != 0) {      
            numberOdds++;
         }
      }
      int[] odds = new int[numberOdds];
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 != 0) {
            odds[count] = numbers[i];
            count++;
         }
      }
      return odds;
   }
  /**
   *finds evens.
   *@return - the list of data.
   */ 
   public double calculateAverage() {
      int sum = 0;
   
      for (int i = 0; i < numbers.length; i++) {
         sum += numbers[i];
      }
      return (double) sum / numbers.length;
   }
   /**
   *finds evens.
   *@return result - the list of data.
   */ 
   public String toString() {
      String result = "";
   
      for (int i = 0; i < numbers.length; i++) {
         result += numbers[i] + "\t";
      }
      return result;
   }
   /**
   *finds evens.
   *@return result - the list of data.
   */ 
   public String toStringInReverse() {
      String result = "";
   
      for (int i = numbers.length - 1; i > -1; i--) {
         result += numbers[i] + "\t";
      }
      return result;
   }
  
}