import java.io.FileNotFoundException;
/**
*Project 010
*Tyler Andrews-Comp1210-06.
*11/30/17
*/

public class VehiclesPart3 {
/**
   *colects input and gives output.
   *@param args - not used.
   */

   public static void main(String[] args) {
      try {
         UseTaxList list = new UseTaxList();
         list.readVehicleFile(args[0]);
         System.out.println(list.summary());
         System.out.println("\n" + list.listByOwner());
         System.out.println("\n" + list.listByUseTax());
         System.out.println("\n" + list.excludedRecordsList()); }
      catch (ArrayIndexOutOfBoundsException e) { 
         System.out.println("*** File name not provided by"
            + " command line argument.");
         System.out.println("Program ending."); }
      catch (FileNotFoundException e) {
         System.out.println("*** File not found.");
         System.out.println("Program ending.");
      }
            
      
      
   }

}