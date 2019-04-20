/**
*Activity 009
*Tyler Andrews-Comp1210-06.
*11/13/17
*/
public abstract class OnlineTextItem extends InventoryItem {
/**
   constructor for electronics Item.
   @param nameIn - the name.
   @param priceIn - the price.
   */
   public OnlineTextItem(String nameIn, double priceIn) {
      super(nameIn, priceIn); }
  /**
   constructor for electronics Item.
   @return price - the price
   */    
   public double calculateCost() {
      return price;
   }
}