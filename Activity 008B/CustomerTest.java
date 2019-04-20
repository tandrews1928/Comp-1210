import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/** Fixture initialization (common initialization
    *  for all tests). **/

public class CustomerTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   /** Fixture initialization (common initialization
    *  for all tests). **/

   @Test public void setLocationTest1() {
   
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.setLocation("Boston, MA");
      Assert.assertEquals("Boston, MA", cstmr.getLocation());
   }
   /** Fixture initialization (common initialization
    *  for all tests). **/

   @Test public void setLocationTest2() {
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.setLocation("Atlanta", "GA");
      Assert.assertEquals("Atlanta, GA", cstmr.getLocation());
   }
   /** Fixture initialization (common initialization
    *  for all tests). **/

   @Test public void changeBalanceTest() {
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.changeBalance(100);
      Assert.assertEquals(100, cstmr.getBalance(), 0.000001);
   } 
   /** Fixture initialization (common initialization
    *  for all tests). **/
   
   @Test public void toStringTest() {
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.setLocation("Auburn, AL");
      cstmr.changeBalance(999);
      Assert.assertEquals("Lane, Jane\nAuburn, AL\n$999.0", cstmr.toString());
   }
   /** Fixture initialization (common initialization
    *  for all tests). **/

   @Test public void compareToTest1() {
      Customer cstmr1 = new Customer("Lane, Jane");
      cstmr1.changeBalance(500);
      Customer cstmr2 = new Customer("Lane, Lois");
      cstmr2.changeBalance(500);
      
      Assert.assertTrue(cstmr1.compareTo(cstmr2) == 0);
   }
   /** Fixture initialization (common initialization
    *  for all tests). **/

   @Test public void compareToTest21() {
      Customer cstmr1 = new Customer("Lane, Jane");
      cstmr1.changeBalance(100);
      Customer cstmr2 = new Customer("Lane, Lois");
      cstmr2.changeBalance(500);
      
      Assert.assertTrue(cstmr1.compareTo(cstmr2) < 0);
   }
   /** Fixture initialization (common initialization
    *  for all tests). **/

   @Test public void compareToTest3() {
      Customer cstmr1 = new Customer("Lane, Jane");
      cstmr1.changeBalance(1000);
      Customer cstmr2 = new Customer("Lane, Lois");
      cstmr2.changeBalance(500);
      
      Assert.assertTrue(cstmr1.compareTo(cstmr2) > 0);
   }
  
}
