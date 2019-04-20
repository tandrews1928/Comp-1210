import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;


 /**
*Project 010
*Tyler Andrews-Comp1210-06.
*11/30/17
*/

public class UseTaxListTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** read file test.
   *@throws IOException - 0.
    **/
   @Test public void readfileTest() throws IOException {
      UseTaxList list = new UseTaxList();
      list.readVehicleFile("vehicles1.txt");
      
      Assert.assertEquals("ReadFileTest", "Tax District 52",
          list.getTaxDistrict());
      
   }
   /** settaxdistricttest.
   *@throws IOException - 0.
    **/

   @Test public void settaxdistricttest() throws IOException {
      UseTaxList list = new UseTaxList();
      list.readVehicleFile("vehicles1.txt");
      list.setTaxDistrict("yes");
      
      Assert.assertEquals("settaxdistrictTest", "yes",
          list.getTaxDistrict()); 
   
   
   }
   /** getvehiclelisttest.
   *@throws IOException - 0.
   *@throws NegativeValueException = 0.
    **/

   @Test public void getvehcilelisttest() throws NegativeValueException {
      Vehicle[] vehicleList = new Vehicle[1];
      
      vehicleList[0] = new Car("Jones, Jo", "2017 Honda Accord", 22000, true);
      
      UseTaxList list = new UseTaxList();
      list.addVehicle(vehicleList[0]);
      
      Assert.assertArrayEquals("getvehiclelistTest", vehicleList,
          list.getVehicleList());
   }
   /** get excludedrecords test.

    **/

   @Test public void getexcludedrecordstest() {
      String[] excludedList = new String[1];
      
      excludedList[0] = "excluded";
      
      
      
      UseTaxList list = new UseTaxList();
      list.addExcludedRecord(excludedList[0]);
      
      Assert.assertArrayEquals("getvehiclelistTest", excludedList,
          list.getExcludedRecords());
      Assert.assertEquals(true,
          list.excludedRecordsList().contains("excluded"));
   }
  /** to String test.
   *@throws IOException - 0.
    **/
 
   @Test public void toStringtest() throws IOException {
      UseTaxList list = new UseTaxList();
      list.readVehicleFile("vehicles1.txt");
      
      Assert.assertEquals("toString test",
          true,
          list.toString().contains("Brando, Marlon: Motorcycle"
            + " 1964 Harley-Davidson Sportster"));
      Assert.assertEquals("toString test",
          true,
          list.listByUseTax().contains("Brando, Marlon: Motorcycle"
            + " 1964 Harley-Davidson Sportster"));
      Assert.assertEquals("toString test",
          true,
          list.listByOwner().contains("Brando, Marlon: Motorcycle"
            + " 1964 Harley-Davidson Sportster"));
   
   }
  /** calculatetotalusetaxtest.
   *@throws IOException - 0.
    **/ 
   @Test public void calculateTotaluseTax() throws IOException {
      UseTaxList list = new UseTaxList();
      list.readVehicleFile("vehicles1.txt");
      
      Assert.assertEquals("calculateTotalUsetax test",
          12010.0, list.calculateTotalUseTax(), 0.001); 
   }
  /** calculatetotalvalue test.
   *@throws IOException - 0.
    **/ 
   @Test public void calculateTotalValue() throws IOException {
      UseTaxList list = new UseTaxList();
      list.readVehicleFile("vehicles1.txt");
      
      Assert.assertEquals("calculateTotalUsetax test",
          393000.0, list.calculateTotalValue(), 0.001); 
   }
  /** summary test.
   *@throws IOException - 0.
    **/ 
   @Test public void summaryTest() throws IOException {
      UseTaxList list = new UseTaxList();
      list.readVehicleFile("vehicles1.txt");
      
      Assert.assertEquals("toString test",
          true,
          list.summary().contains("Number of Vehicles: 8"));
   }
  
   


}
