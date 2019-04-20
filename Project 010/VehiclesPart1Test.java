import org.junit.Assert;
import org.junit.Test;
/**
*Project 009
*Tyler Andrews-Comp1210-06.
*11/15/17
*/  

public class VehiclesPart1Test {
 /** vehiclespart1test. */
   @Test public void getEngineSizetest() {
      VehiclesPart1 vp1 = new VehiclesPart1();
      Vehicle.resetVehicleCount();
      VehiclesPart1.main(null);
      Assert.assertEquals("Vehicle.vehicleCount should be 8. ",
         8, Vehicle.getVehicleCount()); }



}
