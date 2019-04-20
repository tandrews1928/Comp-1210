import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;

/**
*Project 011
*Tyler Andrews-Comp1210-06.
*12/8/17
*/  
public class VehiclesPart3Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

/** argstest.
*@throws IOException = 0. */
   @Test public void argsTest() throws IOException {
      VehiclesPart3 vPart2Obj = new VehiclesPart3(); // test constructor
      Vehicle.resetVehicleCount();
      String[] args = {"vehicles2.txt"};
      VehiclesPart3.main(args);
      Assert.assertEquals(9, Vehicle.getVehicleCount());
    
   }

}
