/**
*Activity 009
*Tyler Andrews-Comp1210-06.
*11/13/17
*/
public class InventoryItem {
   protected String name; 
   protected double price;
   private static double taxRate = 0;
  /**
   constructor for electronics Item.
   @param nameIn - the name.
   @param priceIn - the price.
   */ 
   public InventoryItem(String nameIn, double priceIn) {
      name = nameIn;
      price = priceIn; }
   /**
   constructor for electronics Item.
   @return name - the name
   */   
   public String getName() {
      return name;
   }
   /**
   constructor for electronics Item.
   @return price - the price
   */
   public double calculateCost() {
      price = price * (1 + taxRate);
      return price; }
  /**
   constructor for electronics Item.
   @param taxRateIn - the tax rate
   */    
   public static void setTaxRate(double taxRateIn) {
      taxRate = taxRateIn;
   }
  /**
   constructor for electronics Item.
   @return - 0
   */ 
   public String toString() {
      return name + ": $" + calculateCost(); }
      
}