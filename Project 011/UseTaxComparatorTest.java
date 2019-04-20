import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

 /**
*Project 010
*Tyler Andrews-Comp1210-06.
*11/30/17
*/

public class UseTaxComparatorTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that always fails.
   @throws NegativeValueException = 0. **/
   @Test public void comparatortest() throws NegativeValueException {
      UseTaxComparator list = new UseTaxComparator();
      
      Car v1 = new Car("Tyler", "blue", 1, false);
      Car v2 = new Car("bad", "red", 8, true);
      Car v3 = new Car("Tyler", "red", 1, false);
   
      
      Assert.assertEquals(list.compare(v1, v2), -1);
      Assert.assertEquals(list.compare(v1, v3), 0);
   }
}
