import org.junit.Assert;
import org.junit.Test;
/**
*Project 009
*Tyler Andrews-Comp1210-06.
*11/15/17
*/  

public class MotorcycleTest {
/** getenginesize. 
*@throws NegativeValueException = 0. */
   @Test public void getEngineSizetest() throws NegativeValueException {
   
      Motorcycle bike1 = new Motorcycle("Brando, Marlon",
            "1964 Harley-Davidson Sportster",
            14000, false, 750);
   
      Assert.assertEquals("getEngineSize test",
          750, bike1.getEngineSize(), 0.01);
   }
  /** usetaxtest.
  *@throws NegativeValueException = 0.  */
   @Test public void usetaxtest() throws NegativeValueException {
      Motorcycle bike1 = new Motorcycle("Brando, Marlon",
            "1964 Harley-Davidson Sportster",
            14000, false, 750);
      Motorcycle bike2 = new Motorcycle("Brando, Marlon",
            "1964 Harley-Davidson Sportster",
            14000, true, 750);
      Motorcycle bike3 = new Motorcycle("Brando, Marlon",
            "1964 Harley-Davidson Sportster",
            14000, false, 300);
      Motorcycle bike4 = new Motorcycle("Brando, Marlon",
            "1964 Harley-Davidson Sportster",
            14000, true, 300);
   
               
      Assert.assertEquals("usetax test", 280.00, bike1.useTax(), 0.01);
      Assert.assertEquals("usetax test", 245.00, bike2.useTax(), 0.01);
      Assert.assertEquals("usetax test", 70.00, bike3.useTax(), 0.01);
      Assert.assertEquals("usetax test", 35.00, bike4.useTax(), 0.01);
   }
   /** setenginesizetest.
   *@throws NegativeValueException = 0.  */  
   @Test public void setenginesizetest() throws NegativeValueException {
      Motorcycle bike1 = new Motorcycle("Brando, Marlon",
            "1964 Harley-Davidson Sportster",
            14000, false, 750);
   
      bike1.setEngineSize(800);
      
      Assert.assertEquals(800, bike1.getEngineSize(), 0.01);
   }

   /** tostringtest.
   *@throws NegativeValueException = 0.  */
   @Test public void toStringtest() throws NegativeValueException {
      Motorcycle bike1 = new Motorcycle("Brando, Marlon",
            "1964 Harley-Davidson Sportster",
            14000, false, 750);
      Motorcycle bike2 = new Motorcycle("Brando, Marlon",
            "1964 Harley-Davidson Sportster",
            14000, true, 750);
      Motorcycle bike3 = new Motorcycle("Brando, Marlon",
            "1964 Harley-Davidson Sportster",
            14000, false, 300);
      Motorcycle bike4 = new Motorcycle("Brando, Marlon",
            "1964 Harley-Davidson Sportster",
            14000, true, 300);
            
      Assert.assertEquals("toString test", true,
          bike1.toString().contains("with Tax Rate: 0.005"
            + " Large Bike Tax Rate: 0.015")); 
            
      Assert.assertEquals("toString test", true,
          bike2.toString().contains("with Tax Rate: 0.0025"
            + " Large Bike Tax Rate: 0.015")); 
            
      Assert.assertEquals("toString test", true,
          bike3.toString().contains("with Tax Rate: 0.005"));
          
            
      Assert.assertEquals("toString test", true,
          bike4.toString().contains("with Tax Rate: 0.0025")); }
  /** NegativeValueTest. */        
   @Test public void negativevaluetest() {
      
      boolean thrown = false;
      try {
         Motorcycle bike1 = new Motorcycle("Brando, Marlon",
            "1964 Harley-Davidson Sportster",
            -14000, false, 750); 
      }
      
      catch (NegativeValueException e) {
         thrown = true; }
        
          
      Assert.assertTrue(thrown);
      
      try {
         Motorcycle bike2 = new Motorcycle("Brando, Marlon",
            "1964 Harley-Davidson Sportster",
            14000, false, -750); 
      }
      
      catch (NegativeValueException e) {
         thrown = true; }
        
          
      Assert.assertTrue(thrown); }
           
     



}
