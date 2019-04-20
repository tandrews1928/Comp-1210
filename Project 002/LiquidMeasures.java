import java.util.Scanner;
/**
*This program provides information about the number of oil barrels.
*
*Project 002.
*Tyler Andrews-Comp1210-06.
*9/7/17.
*/
public class LiquidMeasures {
  /**
   *@param args Command line arguments - (not used).
   */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      long liquid;
      long barrels;
      long gallons;
      long quarts;
      long ounces;
   
      System.out.print("Enter amount of liquid in ounces: ");
      liquid = userInput.nextLong();
      
      if (liquid >= 1000000000) {
         System.out.println("Amount must not exceed 1,000,000,000."); }
      
      else {
         System.out.println("Measures by volume:");
         barrels = liquid / 5376;
         gallons = liquid % 5376 / 128;
         quarts = liquid % 5376 % 128 / 32;
         ounces = liquid % 5376 % 128 % 32;
            
         System.out.println("\tBarrels: " + barrels);
         System.out.println("\tGallons: " + gallons);
         System.out.println("\tQuarts: " + quarts);
         System.out.println("\tOunces: " + ounces);
         
         System.out.print(liquid + " oz = (");
         System.out.print(barrels + " bl * 5376 oz) + (");
         System.out.print(gallons + " gal * 128 oz) + (");
         System.out.print(quarts +  " qt * 32 oz) + (");
         System.out.print(ounces + " oz)");
      
      }
         
         
   
   
   
   }
}