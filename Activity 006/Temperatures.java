import java.util.ArrayList;
/**
*Activity 006
*Tyler Andrews-Comp1210-06.
*10/16/17
*/
public class Temperatures {

   private ArrayList<Integer> temperatures = new ArrayList<Integer>();
   /**
   *constructs everything.
   *@param temperaturesIn - the array of temps.
   */
   public Temperatures(ArrayList<Integer> temperaturesIn) {
      temperatures = temperaturesIn;
   }
   /**
   *finds lowest temperature.
   *@return low = the lowest temperature.
   */
   public int getLowTemp() {
      if (temperatures.isEmpty()) {
         return 0; }
      int low = temperatures.get(0);
      for (int i = 0; i < temperatures.size(); i++) {
         if (temperatures.get(i) < low) {
            low = temperatures.get(i); }
      }  
      return low; }
   /**
   *finds highest temperature.
   *@return high = the highest temperature.
   */      
   public int getHighTemp() {
      if (temperatures.isEmpty()) {
         return 0; }
      int high = temperatures.get(0);
      for (Integer temp : temperatures) {
         if (temp > high) {
            high = temp;
         }
      }
      return high; }
  /**
   *finds lowest temperature.
   *@param lowIn = the lowest temperature.
   *@return = 0
   */      
   public int lowerMinimum(int lowIn) {
      return lowIn < getLowTemp() ? lowIn : getLowTemp(); }
   /**
   *finds highest temperature.
   *@param highIn = the highest temperature.
   *@return = 0
   */   
   public int higherMaximum(int highIn) {
      return highIn > getHighTemp() ? highIn : getHighTemp(); }
   /**
   *finds highest temperature.
   *@return = 0
   */      
   public toString() {
      return "\tTemperatures: " + temperatures
         + "\n\tLow: " + getLowTemp()
         + "\n\tHigh: " + getHighTemp(); }
}