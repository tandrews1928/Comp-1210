
/**
*Activity 009
*Tyler Andrews-Comp1210-06.
*11/13/17
*/
public class ElectronicsItem extends InventoryItem {
   protected double weight;
   /** SHIPPING_COST = the shipping cost. */
   public static final double SHIPPING_COST = 1.5;
   /**
   constructor for electronics Item.
   @param nameIn - the name.
   @param priceIn - the price.
   @param weightIn - the weight.
   */
   public ElectronicsItem(String nameIn, double priceIn, double weightIn) {
      super(nameIn, priceIn);
      weight = weightIn;
   }
   /**
   constructor for electronics Item.
   @return weight - the weight.
   */
  /**
   constructor for electronics Item.
   @return - 0
   */    
   public double calculateCost() {
      return super.calculateCost() + (SHIPPING_COST * weight);
   }
}