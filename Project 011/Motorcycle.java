 /**
*Project 009
*Tyler Andrews-Comp1210-06.
*11/15/17
*/
public class Motorcycle extends Vehicle {
   protected double enginesize;
   /** */
   public static final double TAX_RATE = 0.005;
   /** */
   public static final double ALTERNATIVE_FUEL_TAX_RATE = 0.0025;
   /** */
   public static final double LARGE_BIKE_CC_THRESHOLD = 499;
   /** */
   public static final double LARGE_BIKE_TAX_RATE = .015;
/**
   *constructs everything.
   *@param ownerIn = the owner.
   *@param yearmakemodelIn = the year make and model.
   *@param valueIn = the value.
   *@param altfuelIn = alternate fuel.
   *@param enginesizeIn = the engine size.
   *@throws NegativeValueException - 0.
   */ 

   public Motorcycle(String ownerIn, String yearmakemodelIn,
       double valueIn, boolean altfuelIn, double enginesizeIn)
         throws NegativeValueException {
      super(ownerIn, yearmakemodelIn, valueIn, altfuelIn);
      enginesize = enginesizeIn;
      if (valueIn < 0) {
         Vehicle.vehiclecount--;
         throw new NegativeValueException();
        
      }
      if (enginesize < 0) {
         Vehicle.vehiclecount--;
         throw new NegativeValueException();
      }
   }
   /**
   *gets the engine size.
   *@return enginesize = the engine size.
   */ 

   public double getEngineSize() {
      return enginesize;
   }
   /**
   *sets the engine size.
   *@param enginesizeIn = the engine size.
   */
   public void setEngineSize(double enginesizeIn) {
      enginesize = enginesizeIn;
   } 
    /**
   *usetax method.
   *@return usetax = the tax.
   */ 
   public double useTax() {
      if (super.getAlternativeFuel()) {
         double usetax = value * ALTERNATIVE_FUEL_TAX_RATE;
         if (this.getEngineSize() > LARGE_BIKE_CC_THRESHOLD) {
            usetax = usetax + (value * LARGE_BIKE_TAX_RATE); 
         }
         return usetax;
      }
      else {
         double usetax = value * TAX_RATE;
         if (this.getEngineSize() > LARGE_BIKE_CC_THRESHOLD) {
            usetax = usetax + (value * LARGE_BIKE_TAX_RATE); 
         }
         return usetax;
      }
   }
   /**
   *toString method.
   *@return output = the output.
   */

   public String toString() {
      String output = super.toString();
      double taxrate;
      if (super.getAlternativeFuel()) {
         taxrate = 0.0025;
      }
      else {
         taxrate = 0.005;
      }
      if (this.getEngineSize() > LARGE_BIKE_CC_THRESHOLD) {
         return output + "\nwith Tax Rate: "
             + taxrate + " Large Bike Tax Rate: 0.015"; }
      else {
         return output + "\nwith Tax Rate: " + taxrate;
      }
   
   }
}