import java.util.Scanner;
/**
*Project 004
*Tyler Andrews-Comp1210-06.
*9/26/17
*/
public class SpherocylinderApp {
   /**
   *colects input and gives output.
   *@param args - not used.
   */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      System.out.println("Enter label, radius, and"
         + " cylinder height for a spherocylinder.");
      System.out.print("\tlabel: ");
      String label = userInput.nextLine();
      System.out.print("\tradius: ");
      double radius = userInput.nextDouble();
      if (radius < 0) {
         System.out.println("Error: radius must be non-negative."); 
         return;
      }
      System.out.print("\tcylinder height: "); 
      double cylinderheight = userInput.nextDouble();
      if (cylinderheight < 0) {
         System.out.println("Error: cylinder height must be non-negative."); 
         return;
      }
      Spherocylinder info = new Spherocylinder(label, radius, cylinderheight);
      System.out.println("");
      System.out.println(info.toString());
   }
     
     
}