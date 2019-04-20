import java.util.Scanner;
/**
*Displays multiple descriptions about a person.
*
*Activity 002.
*Tyler Andrews-Comp1210-010
*8/30/17
*/
public class AgeStatistics {
/**
*@param args Command line arguments -(not used).
*/
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      String name = "";
      int ageInYears = 0;
      int gender = 0;
      double maxHeartRate = 0;
      
      System.out.print("Enter your name: ");
      name = userInput.nextLine();
      
      System.out.print("Enter your age in years: ");
      ageInYears = userInput.nextInt();
      
      System.out.print("Enter your gender (1 for female and 0 for male): ");
      gender = userInput.nextInt();
      
      System.out.println("\tYour age in minutes is "
         + ageInYears * 525600 + " minutes.");
      System.out.println("\tYour age in centuries is "
         + (double) ageInYears / 100 + " centuries.");
      
      System.out.print("Your max heart rate is ");
      if (gender == 1) {
         maxHeartRate = 209 - (0.7 * ageInYears);
      }
      else {
         maxHeartRate = 214 - (0.8 * ageInYears);      
      }
      System.out.println(maxHeartRate + " beats per minute.");
      
      
   }

}