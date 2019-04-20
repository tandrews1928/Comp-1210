/**
*Activity 011
*Tyler Andrews-Comp1210-06.
*12/4/17
*/

public class Division {
/** 
*divides int.
*@return result = the result.
*@param numInput = numInput.
*@param denomInput = denomInput.
*/
   public static int intDivide(int numInput, int denomInput) {
      try { 
         int result = numInput / denomInput;
         return result; }
      catch (ArithmeticException e) {
         return 0;
      }   
   }
   /** 
*divides int.
*@return result = the result.
*@param numInput = numInput.
*@param denomInput = denomInput.
*/
   public static double decimalDivide(int numInput, int denomInput) {
      if (denomInput == 0) {
         throw new IllegalArgumentException("The denominator "
            + "cannot be zero.");
      }
      double result = (double) numInput / denomInput;
      return result;
   }
}