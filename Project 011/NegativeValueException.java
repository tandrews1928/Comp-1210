/**
*Project 011
*Tyler Andrews-Comp1210-06.
*12/08/17
*/
public class NegativeValueException extends Exception 
   //extends RuntimeException 
{
/**
   *negativevalueexam.
   */

   public NegativeValueException() {
      super("Numeric values must be nonnegative");
   }

}