import java.util.Scanner;
import java.text.DecimalFormat;
/**
*This program evaluates a mathematical expression
*
*Project 003.
*Tyler Andrews-Comp1210-06.
*9/18/17.
*/
public class ExpressionEvaluator {
   /**
   *@param args Command line arguments - (not used).
   */
   public static void main(String[] args) {
      double x;
      double result;
      Scanner userInput = new Scanner(System.in);
   
   
      System.out.print("Enter a value for x: ");
      x = userInput.nextDouble();
      result = (Math.sqrt(Math.abs(23.7 * Math.pow(x, 9)) - x))
         / (7.3 * Math.pow(x, 2.0) + 5.2 * x + 3.1);  //solves equation
      System.out.println("Result: " + result);
      String resultasstring = Double.toString(result);    //converts to string
      resultasstring = resultasstring.trim();
      int decimal = resultasstring.indexOf(".");
      int length = resultasstring.length();
      int right = length - decimal - 1;   //finds number right of decimal
      int left = length + decimal - length;   //finds number left of decimal
      System.out.println("# digits to left of decimal point: " + left);
      System.out.println("# digits to right of decimal point: " + right);
      
      DecimalFormat formated = new DecimalFormat("#,##0.0####");
      String end = formated.format(result);   //formats result
      System.out.println("Formatted Result: " + end);
     
      
      
      
   
   
   }
}
