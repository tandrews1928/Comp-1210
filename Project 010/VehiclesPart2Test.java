import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;


/**
*Project 010
*Tyler Andrews-Comp1210-06.
*11/30/17
*/

public class VehiclesPart2Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that always fails.
   * @throws IOException = 0.
    **/
   @Test public void argsTest() throws IOException {
      VehiclesPart2 vPart2Obj = new VehiclesPart2(); // test constructor
      Vehicle.resetVehicleCount();
      String[] args = {"vehicles1.txt"};
      VehiclesPart2.main(args);
      Assert.assertEquals(8, Vehicle.getVehicleCount());
    
   }
}
