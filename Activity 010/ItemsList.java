
/**
*Activity 010
*Tyler Andrews-Comp1210-06.
*11/27/17
*/

public class ItemsList {
   private InventoryItem[] inventory;
   private int count;
  /**
   constructor for electronics Item.
   */ 
   public ItemsList() {
      inventory = new InventoryItem[20];
      count = 0;
   }
   /**
   constructor for electronics Item.
   @param itemIn - the tax rate
   */
   public void addItem(InventoryItem itemIn) {
      inventory[count] = itemIn;
      count++;
   }
   /**
   constructor for electronics Item.
   @param electronicsSurcharge - the tax rate.   
   @return total - the tax rate
   */

   public double calculateTotal(double electronicsSurcharge) {
      double total = 0;
      for (int i  = 0; i < count; i++) {
         if (inventory[i] instanceof ElectronicsItem) {
            total += inventory[i].calculateCost() + electronicsSurcharge;
         }  
         else {
            total += inventory[i].calculateCost();
         }
      
      }
      return total;
   }
  /**
   constructor for electronics Item.
   @return output - the tax rate
   */ 
   public String toString() {
      String output = "All inventory:\n\n";
      
      for (int i = 0; i < count; i++) {
         output += inventory[i] + "\n";
      }
      
      return output;
   }
}