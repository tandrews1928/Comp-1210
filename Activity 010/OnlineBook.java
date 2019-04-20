/**
*Activity 009
*Tyler Andrews-Comp1210-06.
*11/13/17
*/
public class OnlineBook extends OnlineTextItem {
   protected String author;
  /**
   constructor for electronics Item.
   @param nameIn - the name.
   @param priceIn - the price.
   */
   public OnlineBook(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      author = "Author Not Listed";
   }
   /**
   constructor for electronics Item.
   @param authorIn - the author.
   */
   public void setAuthor(String authorIn) {
      author = authorIn;
   }
   /**
   constructor for electronics Item.
   @return - 0
   */
   public String toString() {
      return name + " - " + author + ": $" + calculateCost(); }
 
}