/**
*Activity 005.
*Tyler Andrews-Comp1210-06.
*10/4/17.
*/
public class NumberOperations {
   private int number;
   /**
    * defines number.
    * @param numberIn - a number.
    */
   public NumberOperations(int numberIn) {
      number = numberIn;
   }
    /**
    * gets the Value.
    * @return number - a number.
    */
   public int getValue() {
      return number;
   }
    /**
    * finds the odds under.
    * @return output - the odds under.
    */
   public String oddsUnder() {
      String output = "";
      int i = 0;
      while (i < number) {
         if (i % 2 != 0) {
            output += i + "\t";
         }
         i++;
      }
      return output;
   }
   /**
    * finds the powers of two under.
    * @return output - the powers of two under.
    */
   public String powersTwoUnder() {
      String output = "";
      int powers = 1;
      while (powers < number) {
         output += powers + "\t";
         powers = powers * 2;
      }
      return output;
   }
   /**
    * compares the values of the numbers.
    * @param compareNumber = the comparison number.
    * @return - a value.
    */
   public int isGreater(int compareNumber) {
      if (number > compareNumber) {
         return 1;
      }
      else if (number < compareNumber) {
         return -1;
      }
      else {
         return 0;
      }
   }
   /**
    * returns the number.
    * @return number - the number.
    */
   public String toString() {
      return number + "";
   }

   
   
   
}