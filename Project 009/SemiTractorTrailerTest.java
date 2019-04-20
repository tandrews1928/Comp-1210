import org.junit.Assert;
import org.junit.Test;

/**
*Project 009
*Tyler Andrews-Comp1210-06.
*11/15/17
*/ 
public class SemiTractorTrailerTest {
/** getaxlestest. */
   @Test public void getAxlestest() {
      SemiTractorTrailer semi1 = new SemiTractorTrailer("Williams, Pat",
            "2012 International Big Boy",
              45000, false, 5.0, 4);
   
      Assert.assertEquals("getTons test", 4, semi1.getAxles(), 0.01);
   }
  /** usetaxtest. */
   @Test public void usetaxtest() {
      SemiTractorTrailer semi1 = new SemiTractorTrailer("Williams, Pat",
            "2012 International Big Boy",
              45000, false, 5.0, 4);
               
      Assert.assertEquals("usetax test", 3150.00, semi1.useTax(), 0.01);
   }
  /** setaxlestest. */  
   @Test public void setaxlestest() {
      SemiTractorTrailer semi1 = new SemiTractorTrailer("Williams, Pat",
            "2012 International Big Boy",
              45000, false, 5.0, 4);
      semi1.setAxles(5);
      
      Assert.assertEquals(5, semi1.getAxles(), 0.01);
   }

   /** tostringtest. */
   @Test public void toStringtest() {
      SemiTractorTrailer semi1 = new SemiTractorTrailer("Williams, Pat",
            "2012 International Big Boy",
              45000, false, 5.0, 4);            
      Assert.assertEquals("toString test", true,
          semi1.toString().contains(" Axle Tax Rate: 0.02")); }
         
 
}