/**
*Project 009
*Tyler Andrews-Comp1210-06.
*11/15/17
*/
public class SemiTractorTrailer extends Truck {
   protected int axles;
   /** */
   public static final double PER_AXLE_TAX_RATE = 0.005;
    /**
   *constructs everything.
   *@param ownerIn = the owner.
   *@param yearmakemodelIn = the year make and model.
   *@param valueIn = the value.
   *@param altfuelIn = alternate fuel.
   *@param tonsIn = tons.
   *@param axlesIn = axles.
   */ 

   public SemiTractorTrailer(String ownerIn, String yearmakemodelIn,
       double valueIn, boolean altfuelIn, double tonsIn, int axlesIn) {
      super(ownerIn, yearmakemodelIn, valueIn, altfuelIn, tonsIn);
      axles = axlesIn;
   }
  /**
   *gets axles.
   *@return axles = axles.
   */  
   public int getAxles() {
      return axles;
   }
   /**
   *sets axles.
   *@param axlesIn = axles.
   */
   public void setAxles(int axlesIn) {
      axles = axlesIn;
   }
  /**
   *usetax method.
   *@return usetax = the tax.
   */

   public double useTax() {
      double result = super.useTax();
      double usetax = result + (this.getAxles()
          * PER_AXLE_TAX_RATE * super.getValue());
      return usetax;
      
   }
 /**
   *toString method.
   *@return result = the output.
   */
   public String toString() {
      String result = super.toString();
      return result + " Axle Tax Rate: 0.02";
   }
}