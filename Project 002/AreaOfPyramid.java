import java.util.Scanner;
/**
*This program calculates the area of a pyramid.
*
*Project 002.
*Tyler Andrews-Comp1210-06.
*9/6/17.
*/
public class AreaOfPyramid {
   /**
   *@param args Command line arguments - (not used).
   */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      double base;
      double slantheight;
      double area;
      
      System.out.println("Enter values for base and slant height of a pyramid");
      
      System.out.print("\tbase = ");
      base = userInput.nextDouble();
      
      System.out.print("\tslant height = ");
      slantheight = userInput.nextDouble();
      
      System.out.println();
      
      area = base * base + 4 * ((base * slantheight) / 2);
      System.out.print("A pyramid with base = ");
      System.out.print(base);
      System.out.print(" and slant height = ");
      System.out.println(slantheight);
      System.out.print("has an area of ");  
      System.out.print(area);
      System.out.print(" square units.");
   }
   



}
