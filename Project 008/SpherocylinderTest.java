import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * .
 * @throws IOException from scanning input file.
 */
public class SpherocylinderTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   /** test for get count method. **/
   @Test public void getCountTest() {
      Spherocylinder.resetCount();
      Spherocylinder s = new Spherocylinder("test", 4, 5);
      Assert.assertEquals(1, Spherocylinder.getCount()); }
  /** label radius and cylinderheight test. **/ 
   @Test public void labelradiuschTest() {
      Spherocylinder s = new Spherocylinder("test", 4, 5);
      
      Assert.assertEquals("test", s.getLabel());
   
      Assert.assertEquals(4, s.getRadius(), .0001);
   
      Assert.assertEquals(5, s.getCylinderHeight(), .0001);
   }
   /** label radius and cylinderheight test. **/
   @Test public void errorTest() {
      Spherocylinder s = new Spherocylinder(null, -4, -2);
      
      Assert.assertEquals(false, s.setLabel(null));
      
      Assert.assertEquals(false, s.setRadius(-4));
      
      Assert.assertEquals(false, s.setRadius(-2)); }
   /** test for circumference. **/
   @Test public void circumferenceTest() {
   
      Spherocylinder s = new Spherocylinder("test", 0.5, 0.25);
      
      Assert.assertEquals(3.142, s.circumference(), .001);
   }
   /** test for surface area. **/
   @Test public void surfaceAreaTest() {
   
      Spherocylinder s = new Spherocylinder("test", 10.8, 10.1);
      
      Assert.assertEquals(2151.111, s.surfaceArea(), .001);
   }
   /** test for volume. **/
   @Test public void volumeTest() {
   
      Spherocylinder s = new Spherocylinder("test", 10.8, 10.1);
      
      Assert.assertEquals(8977.666, s.volume(), .001);
   }
   /** test for equals method. **/
   @Test public void equalsTest() {
   
      Spherocylinder s1 = new Spherocylinder("test", 0.5, 0.25);
      Spherocylinder s2 = new Spherocylinder("test", 0.5, 0.25);
      Assert.assertEquals("equals test",
                        true, s1.equals(s2));
   
      s2 = new Spherocylinder("test2", .5, .25);
      Assert.assertEquals("equals false test",
                        false, s1.equals(s2));
   
   
      s2 = new Spherocylinder("test", 9, 7);
      Assert.assertEquals("equals false test",
                        false, s1.equals(s2));
   
      s2 = new Spherocylinder("test", .5, 9);
      Assert.assertEquals("equals false test",
                        false, s1.equals(s2));
   
      Assert.assertEquals("equals false test",
                        false, s1.equals("obj"));
   
      Assert.assertEquals("equals false test",
                        0, s1.hashCode());
   
   }
   /** test for toString method. **/
   @Test public void toStringTest() {
   
      Spherocylinder s = new Spherocylinder("Small Example", 0.5, 0.25);
      
      Assert.assertEquals("toString test",
         true,
         s.toString().contains("Spherocylinder \"Small Example\" with "
            + "radius 0.5 and cylinder height 0.25 has:\n\tcircumference"
            + " = 3.142 units\n\tsurface area = 3.927 square"
            + " units\n\tvolume = 0.72 cubic units"));
   }



}
