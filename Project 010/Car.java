/**
*Project 009
*Tyler Andrews-Comp1210-06.
*11/15/17
*/ 
public class Car extends Vehicle {
/** */
   public static final double TAX_RATE = 0.01;
 /** */
   public static  final double ALTERNATIVE_FUEL_TAX_RATE = 0.005;
 /** */
   public static  final double LUXURY_THRESHOLD = 50000;
 /** */
   public static final double LUXURY_TAX_RATE = 0.02;
  /**
   *constructs everything.
   *@param ownerIn = the owner.
   *@param yearmakemodelIn = the year make and model.
   *@param valueIn = the value.
   *@param altfuelIn = alternate fuel
   */ 
   public Car(String ownerIn, String yearmakemodelIn,
       double valueIn, boolean altfuelIn) {
      super(ownerIn, yearmakemodelIn, valueIn, altfuelIn);
   }
  /**
   *usetax method.
   *@return usetax = the tax.
   */ 
   public double useTax() {
      if (super.getAlternativeFuel()) {
         double usetax = value * ALTERNATIVE_FUEL_TAX_RATE;
         if (super.getValue() > LUXURY_THRESHOLD) {
            boolean luxury = true;
            usetax = usetax + (value * LUXURY_TAX_RATE); 
         }
         return usetax;
      }
      else {
         double usetax = value * TAX_RATE;
         if (super.getValue() > LUXURY_THRESHOLD) {
            usetax = usetax + (value * LUXURY_TAX_RATE); 
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
      double taxrate1;
      if (super.getAlternativeFuel()) {
         taxrate1 = 0.005;
      }
      else {
         taxrate1 = 0.01;
      }
      if (super.getValue() > LUXURY_THRESHOLD) {
         return output + "\nwith Tax Rate: " + taxrate1
            + " Luxury Tax Rate: 0.02"; }
      else {
         return output + "\nwith Tax Rate: " + taxrate1;
      }
   }
   
   
}