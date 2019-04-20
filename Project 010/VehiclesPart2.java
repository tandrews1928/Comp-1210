import java.io.FileNotFoundException;
/**
*Project 010
*Tyler Andrews-Comp1210-06.
*11/30/17
*/

public class VehiclesPart2 {
/**
   *colects input and gives output.
   *@param args - not used.
   @throws FileNotFoundException - ...
   */

   public static void main(String[] args) throws FileNotFoundException {
      UseTaxList list = new UseTaxList();
      list.readVehicleFile(args[0]);
      System.out.println(list.summary());
      System.out.println(list.listByOwner());
      System.out.println(list.listByUseTax());
      System.out.println("\n" + list.excludedRecordsList());
      
   }

}