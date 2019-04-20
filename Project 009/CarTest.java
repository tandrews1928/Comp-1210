import org.junit.Assert;
import org.junit.Test;
/**
*Project 009
*Tyler Andrews-Comp1210-06.
*11/15/17
*/

public class CarTest {
/** usetaxtest. */
   @Test public void usetaxtest() {
      Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
      Car car2 = new Car("Jones, Jo", "2017 Honda Accord", 22000, true);
      Car car3 = new Car("Smith, Pat", "2015 Mercedes-Benz Coupe",
            110000, false);
      Car car4 = new Car("Smith, Jack", "2015 Mercedes-Benz Coupe",
            110000, true);
            
      Assert.assertEquals("usetax test", 220.00, car1.useTax(), 0.01);
      Assert.assertEquals("usetax test", 110.00, car2.useTax(), 0.01);
      Assert.assertEquals("usetax test", 3300.00, car3.useTax(), 0.01);
      Assert.assertEquals("usetax test", 2750.00, car4.useTax(), 0.01);
      
      Assert.assertEquals("getowner tes", "Jones, Sam", car1.getOwner());
      Assert.assertEquals("2017 Honda Accord", car1.getYearMakeModel());
   }
  /** setownertest. */
   @Test public void setownertest() {
      Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
      car1.setOwner("Person");
      
      Assert.assertEquals("Person", car1.getOwner());
   }
  /** setyearmakemodeltest. */
   @Test public void setyearmakemodeltest() {
      Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
      car1.setYearMakeModel("Person");
      
      Assert.assertEquals("Person", car1.getYearMakeModel());
     
   }
  /** setvaluetest. */
   @Test public void setvaluetest() {
      Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
      car1.setValue(1000);
      
      Assert.assertEquals(1000, car1.getValue(), 0.01);
   }
/** setaltfueltest. */
   @Test public void setaltfueltest() {
      Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
      car1.setAlternativeFuel(true);
      
      Assert.assertEquals(true, car1.getAlternativeFuel());
   }

   /** tostring test. */
   @Test public void toStringtest() {
      Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
      Car car2 = new Car("Jones, Jo", "2017 Honda Accord", 22000, true);
      Car car3 = new Car("Smith, Pat", "2015 Mercedes-Benz Coupe",
            110000, false);
      Car car4 = new Car("Smith, Jack", "2015 Mercedes-Benz Coupe",
            110000, true);
            
      Assert.assertEquals("toString test",
          true, car1.toString().contains("Jones, Sam: Car 2017 Honda Accord"));
      Assert.assertEquals("toString test",
          true,
          car2.toString().contains("Jones, Jo: Car 2017 Honda"
            + " Accord (Alternative Fuel)"));
      Assert.assertEquals("toString test",
          true,
          car3.toString().contains("Smith, Pat: Car"
          + " 2015 Mercedes-Benz Coupe"));
      Assert.assertEquals("toString test",
          true,
          car4.toString().contains("Smith, Jack: Car 2015"
           + " Mercedes-Benz Coupe (Alternative Fuel)"));
      
   }



   
}
