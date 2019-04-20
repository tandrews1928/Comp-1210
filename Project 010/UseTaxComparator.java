import java.util.Comparator;
 /**
*Project 010
*Tyler Andrews-Comp1210-06.
*11/30/17
*/
public class UseTaxComparator implements Comparator<Vehicle> {
/**
*compare method.
@param v1 = v1.
@param v2 = v2.
@return 0
*/
   public int compare(Vehicle v1, Vehicle v2) {
      if (v1.useTax() > v2.useTax()) {
         return 1;
      }
      else if (v1.useTax() < v2.useTax()) {
         return -1;
      }
      return 0;
   }

}