/**
*Activity 009
*Tyler Andrews-Comp1210-06.
*11/13/17
*/
public class OnlineArticle extends OnlineTextItem {
   private int wordCount;
 /**
   constructor for electronics Item.
   @param nameIn - the name.
   @param priceIn - the price.
   */
   public OnlineArticle(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      wordCount = 0;
      name = nameIn;
      price = priceIn; }
 /**
   constructor for electronics Item.
   @param wordCountIn - the word count.
   */
   public void setWordCount(int wordCountIn) {
      wordCount = wordCountIn;
   }
   
}