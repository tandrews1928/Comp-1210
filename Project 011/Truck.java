/**
*Project 009
*Tyler Andrews-Comp1210-06.
*11/15/17
*/
public class Truck extends Vehicle {
/** */
   public static final double TAX_RATE = 0.02;
 /** */
   public static final double ALTERNATIVE_FUEL_TAX_RATE = 0.01;
 /** */
   public static final double LARGE_TRUCK_TONS_THRESHOLD = 2.0;
 /** */
   public static final double LARGE_TRUCK_TAX_RATE = 0.03;
 /** */
   protected double tons;
  /**
   *constructs everything.
   *@param ownerIn = the owner.
   *@param yearmakemodelIn = the year make and model.
   *@param valueIn = the value.
   *@param altfuelIn = alternate fuel.
   *@param tonsIn = tons.
   *@throws NegativeValueException - 0.
   */ 
   public Truck(String ownerIn, String yearmakemodelIn,
       double valueIn, boolean altfuelIn, double tonsIn)
        throws NegativeValueException {
      super(ownerIn, yearmakemodelIn, valueIn, altfuelIn);
      tons = tonsIn;
      
      if (valueIn < 0) {
         Vehicle.vehiclecount--;
         throw new NegativeValueException();
        
      }
      if (tons < 0) {
         Vehicle.vehiclecount--;
         throw new NegativeValueException();
      }
         
   }
   /**
   *gets tons.
   *@return tons = tons.
   */ 

   public double getTons() {
      return tons;
   }
  /**
   *sets tons.
   *@param tonsIn = tons.
   */
   public void setTons(double tonsIn) {
      tons = tonsIn;
   }
  /**
   *usetax method.
   *@return usetax = the tax.
   */
   public double useTax() {
      if (super.getAlternativeFuel()) {
         double usetax = value * ALTERNATIVE_FUEL_TAX_RATE;
         if (this.getTons() > LARGE_TRUCK_TONS_THRESHOLD) {
            usetax = usetax + (value * LARGE_TRUCK_TAX_RATE); 
         }
         return usetax;
      }
      else {
         double usetax = value * TAX_RATE;
         if (this.getTons() > LARGE_TRUCK_TONS_THRESHOLD) {
            usetax = usetax + (value * LARGE_TRUCK_TAX_RATE); 
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
         taxrate = 0.01;
      }
      else {
         taxrate = 0.02;
      }
      if (this.getTons() > LARGE_TRUCK_TONS_THRESHOLD) {
         return output + "\nwith Tax Rate: " + taxrate
             + " Large Truck Tax Rate: 0.03"; }
      else {
         return output + "\nwith Tax Rate: " + taxrate;
      }
   }


   
  

}