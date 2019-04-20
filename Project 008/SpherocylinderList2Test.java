import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;

  /**
*Project 008
*Tyler Andrews-Comp1210-06.
*11/10/17
*/  
public class SpherocylinderList2Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   /** error Test. **/
   @Test public void errorTest() {
   
      Spherocylinder[] sArray = new Spherocylinder[20];
      
      SpherocylinderList2 sclist = new SpherocylinderList2("Test List",
          sArray, 0);
      
      Assert.assertEquals("error Test",
                           0, sclist.numberOfSpherocylinders(), 0.001); 
      Assert.assertEquals("error Test",
                           0, sclist.totalVolume(), 0.001); 
      Assert.assertEquals("error Test",
                           0, sclist.totalSurfaceArea(), 0.001);
      Assert.assertEquals("error Test",
                           0, sclist.averageSurfaceArea(), 0.001);
      Assert.assertEquals("error Test",
                           0, sclist.averageVolume(), 0.001);
                           
      Assert.assertEquals("error Test", null,
          sclist.findSpherocylinder("Small Example"));
      
      Assert.assertEquals("error Test",
                           null, sclist.findSpherocylinderWithShortestRadius());
      Assert.assertEquals("error Test",
                           null, sclist.findSpherocylinderWithLongestRadius()); 
      Assert.assertEquals("error Test",
                           null, sclist.findSpherocylinderWithSmallestVolume());
      Assert.assertEquals("error Test",
                           null, sclist.findSpherocylinderWithLargestVolume());
                           
   }
  /** name Test. **/                         
   @Test public void getListNameTest() {
   
      Spherocylinder[] sArray = new Spherocylinder[20];
      sArray[0] = new Spherocylinder("1", 4, 5);
      sArray[1] = new Spherocylinder("2", 5, 5);
      sArray[2] = new Spherocylinder("3", 3, 3);
      
      SpherocylinderList2 sclist = new SpherocylinderList2("Test List",
         sArray, 3);
      
      Assert.assertEquals("getListName Test",
            "Test List", sclist.getName()); } 
                                  
  /** total Volume Test. **/                        
   @Test public void totalvolumeTest() {
   
      Spherocylinder[] sArray = new Spherocylinder[20];
      sArray[0] = new Spherocylinder("1", .5, .25);
      sArray[1] = new Spherocylinder("2", 10.8, 10.1);
      sArray[2] = new Spherocylinder("3", 98.32, 99.0);
      
      SpherocylinderList2 sclist = new SpherocylinderList2("Test List",
          sArray, 3);
      
      Assert.assertEquals("gettotalvolume Test",
                           6996733.041, sclist.totalVolume(), 0.001); }
   
  /** total Surface Area Test. **/                        
   @Test public void totalsurfaceareaTest() {
   
      Spherocylinder[] sArray = new Spherocylinder[20];
      sArray[0] = new Spherocylinder("1", .5, .25);
      sArray[1] = new Spherocylinder("2", 10.8, 10.1);
      sArray[2] = new Spherocylinder("3", 98.32, 99.0);
      
      SpherocylinderList2 sclist = new SpherocylinderList2("Test List",
          sArray, 3);
      
      Assert.assertEquals("gettotalsurfacearea Test",
          184790.426, sclist.totalSurfaceArea(), 0.001); }
  /** Average Volume Test. **/                         
   @Test public void averageVolumeTest() {
   
      Spherocylinder[] sArray = new Spherocylinder[20];
      sArray[0] = new Spherocylinder("1", .5, .25);
      sArray[1] = new Spherocylinder("2", 10.8, 10.1);
      sArray[2] = new Spherocylinder("3", 98.32, 99.0);
      
      SpherocylinderList2 sclist = new SpherocylinderList2("Test List",
          sArray, 3);
      
      Assert.assertEquals("getaveragevolume Test",
         2332244.347, sclist.averageVolume(), 0.001); }
   
   /** Average Surface Area Test. **/                     
   @Test public void averageSurfaceAreaTest() {
   
      Spherocylinder[] sArray = new Spherocylinder[20];
      sArray[0] = new Spherocylinder("1", .5, .25);
      sArray[1] = new Spherocylinder("2", 10.8, 10.1);
      sArray[2] = new Spherocylinder("3", 98.32, 99.0);
      
      SpherocylinderList2 sclist = new SpherocylinderList2("Test List",
          sArray, 3);
      
      Assert.assertEquals("getaveragesurfacearea Test",
                           61596.809, sclist.averageSurfaceArea(), 0.001); }
  /** toString Test. **/                        
   @Test public void toStringTest() {
   
      Spherocylinder[] sArray = new Spherocylinder[20];
      sArray[0] = new Spherocylinder("Small Example", .5, .25);
      sArray[1] = new Spherocylinder("Medium Example", 10.8, 10.1);
      sArray[2] = new Spherocylinder("Large Example", 98.32, 99.0);
      
      SpherocylinderList2 sclist = new SpherocylinderList2("Test List",
          sArray, 3);
      
      Assert.assertEquals("toString Test",
         true, sclist.toString().contains("Spherocylinder"
            + " \"Small Example\" with "
            + "radius 0.5 and cylinder height 0.25 has:\n\tcircumference"
            + " = 3.142 units\n\tsurface area = 3.927 square"
            + " units\n\tvolume = 0.72 cubic units"));
   }
  /** Summary Test. **/ 
   @Test public void summaryTest() {
   
      Spherocylinder[] sArray = new Spherocylinder[20];
      sArray[0] = new Spherocylinder("Small Example", .5, .25);
      sArray[1] = new Spherocylinder("Medium Example", 10.8, 10.1);
      sArray[2] = new Spherocylinder("Large Example", 98.32, 99.0);
      
      SpherocylinderList2 sclist = new SpherocylinderList2("Test List",
          sArray, 3);
      
      Assert.assertEquals("Summary Test",
         true,
         sclist.summaryInfo().contains("Total Surface Area: 184,790.426"));
   }
  /** readFile Test.
  * @throws IOException = IOException
   **/
   @Test public void readFileTest() throws IOException {
   
      Spherocylinder[] sArray = new Spherocylinder[20];
      sArray[0] = new Spherocylinder("Small Example", .5, .25);
      sArray[1] = new Spherocylinder("Medium Example", 10.8, 10.1);
      sArray[2] = new Spherocylinder("Large Example", 98.32, 99.0);
      
      SpherocylinderList2 sclist = new SpherocylinderList2("Test List",
          null, 3);
          
      sclist = sclist.readFile("spherocylinder_data_0.txt");
      
      Assert.assertEquals("ReadFileTest", "Spherocylinder Empty Test List",
          sclist.getName());
      sclist = sclist.readFile("spherocylinder_data_1.txt");
      
      Assert.assertEquals("ReadFileTest", "Spherocylinder Test List",
          sclist.getName()); 
   }
  /** AddSpherocylinder Test. **/ 
   @Test public void addSpherocylinderTest() {
   
      Spherocylinder[] sArray = new Spherocylinder[20];
      sArray[0] = new Spherocylinder("Small Example", .5, .25);
      sArray[1] = new Spherocylinder("Medium Example", 10.8, 10.1);
      sArray[2] = new Spherocylinder("Large Example", 98.32, 99.0);
      
      SpherocylinderList2 sclist = new SpherocylinderList2("Test List",
          sArray, 3);
      
      Spherocylinder s = new Spherocylinder("New Example", 4, 5);
      sclist.addSpherocylinder("New Example", 4, 5);
      Spherocylinder[] sc = sclist.getList();
      
      
      Assert.assertEquals("addSpherocylinderTest", s, sc[3]); 
   }
   /** DeleteSpherocylinder Test. **/
   @Test public void deleteSpherocylinderTest() {
   
      Spherocylinder[] sArray = new Spherocylinder[20];
      sArray[0] = new Spherocylinder("Small Example", .5, .25);
      sArray[1] = new Spherocylinder("Medium Example", 10.8, 10.1);
      sArray[2] = new Spherocylinder("Large Example", 98.32, 99.0);
      
      SpherocylinderList2 sclist = new SpherocylinderList2("Test List",
          sArray, 3);
      
      Spherocylinder s = new Spherocylinder("Medium Example",
          10.8, 10.1);
      Spherocylinder[] sc = sclist.getList();
      
      Spherocylinder z = new Spherocylinder("Medium Example",
          10.8, 10.1);
      Assert.assertEquals(sclist.deleteSpherocylinder("Medium Example"), z);
              
   
      Assert.assertEquals("deleteTriangle true Test", null,
                           sclist.deleteSpherocylinder("New Example"));
   
   
      Assert.assertTrue("deleteTriangle false Test",
                           sclist.deleteSpherocylinder("false") == null); 
   }
   /** DeleteSpherocylinder Test. **/
   @Test public void deleteSpherocylinderTest2() {
   
      Spherocylinder[] sArray = new Spherocylinder[20];
      sArray[0] = new Spherocylinder("Small Example", .5, .25);
      sArray[1] = new Spherocylinder("Medium Example", 10.8, 10.1);
      sArray[2] = new Spherocylinder("Large Example", 98.32, 99.0);
      
      SpherocylinderList2 sclist = new SpherocylinderList2("Test List",
          sArray, 3);
      
      Spherocylinder s = new Spherocylinder("Medium Example",
          10.8, 10.1);
      Spherocylinder[] sc = sclist.getList();
      
      Spherocylinder z = new Spherocylinder("Medium Example",
          10.8, 10.1);
          
      Assert.assertEquals("pre delete Test",
                           s, sc[1]);      
   }
   /** DeleteSpherocylinder Test. **/
   @Test public void deleteSpherocylinderTest3() {
   
      Spherocylinder[] sArray = new Spherocylinder[20];
      sArray[0] = new Spherocylinder("Small Example", .5, .25);
      sArray[1] = new Spherocylinder("Medium Example", 10.8, 10.1);
      sArray[2] = new Spherocylinder("Large Example", 98.32, 99.0);
      
      SpherocylinderList2 sclist = new SpherocylinderList2("Test List",
          sArray, 3);
      
      Spherocylinder s = new Spherocylinder("Medium Example",
          10.8, 10.1);
      Spherocylinder[] sc = sclist.getList();
      
      Spherocylinder z = new Spherocylinder("Medium Example",
          10.8, 10.1);
          
      Assert.assertEquals("deleteTriangle true Test",
                           s, sc[1]);   
   }


   /** FindSpherocylinder Test. **/
   @Test public void findSpherocylinderTest() {
   
      Spherocylinder[] sArray = new Spherocylinder[20];
      sArray[0] = new Spherocylinder("Small Example", .5, .25);
      sArray[1] = new Spherocylinder("Medium Example", 10.8, 10.1);
      sArray[2] = new Spherocylinder("Large Example", 98.32, 99.0);
      
      SpherocylinderList2 sclist = new SpherocylinderList2("Test List",
          sArray, 3);
      Spherocylinder s = new Spherocylinder("Medium Example", 10.8, 10.1);
      Spherocylinder[] sc = sclist.getList();    
      
      
      Assert.assertEquals("findSpherocylinderTest",
          sclist.findSpherocylinder("Small Example"), sc[0]); 
      Assert.assertEquals("bad test",
          sclist.findSpherocylinder("bad example"), null);
   }
   /** EditSpherocylinder Test. **/
   @Test public void editSpherocylinderTest() {
   
      Spherocylinder[] sArray = new Spherocylinder[20];
      sArray[0] = new Spherocylinder("Small Example", .5, .25);
      sArray[1] = new Spherocylinder("Medium Example", 10.8, 10.1);
      sArray[2] = new Spherocylinder("Large Example", 98.32, 99.0);
      
      SpherocylinderList2 sclist = new SpherocylinderList2("Test List",
          sArray, 3);
      
      sclist.editSpherocylinder("Small Example", 4, 5);
      Spherocylinder[] sc = sclist.getList();  
      
      
      Assert.assertTrue("editSpherocylinderTestlabel",
          sc[0].getLabel().equals("Small Example"));
      Assert.assertTrue("editSpherocylinderTestradius",
          sc[0].getRadius() == 4);
      Assert.assertTrue("editSpherocylinderTestcylinderheight",
          sc[0].getCylinderHeight() == 5);
       
   }
   /** smallest radius Test. **/
   @Test public void findSpherocylinderwithsmallestRadiusTest() {
   
      Spherocylinder[] sArray = new Spherocylinder[20];
      sArray[0] = new Spherocylinder("Small Example", .5, .25);
      sArray[1] = new Spherocylinder("Medium Example", 10.8, 10.1);
      sArray[2] = new Spherocylinder("Large Example", 98.32, 99.0);
      
      SpherocylinderList2 sclist = new SpherocylinderList2("Test List",
         sArray, 3);
      
      Spherocylinder[] sc = sclist.getList();  
      
      
      Assert.assertEquals("smallestradiustestTest",
         sclist.findSpherocylinderWithShortestRadius(), sc[0]); }
      
  /** largest radius Test. **/    
   @Test public void findSpherocylinderwithlargestRadiusTest() {
   
      Spherocylinder[] sArray = new Spherocylinder[20];
      sArray[0] = new Spherocylinder("Small Example", .5, .25);
      sArray[1] = new Spherocylinder("Medium Example", 10.8, 10.1);
      sArray[2] = new Spherocylinder("Large Example", 98.32, 99.0);
      
      SpherocylinderList2 sclist = new SpherocylinderList2("Test List",
          sArray, 3);
      
      Spherocylinder[] sc = sclist.getList();  
      
      
      Assert.assertEquals("smallestradiustestTest",
          sclist.findSpherocylinderWithLongestRadius(), sc[2]); }
  /** largest radius Test. **/        
   @Test public void findSpherocylinderwithlargestRadiusTest2() {
   
      Spherocylinder[] sArray = new Spherocylinder[20];
      sArray[0] = new Spherocylinder("Small Example", 100, .25);
      sArray[1] = new Spherocylinder("Medium Example", 10.8, 10.1);
      sArray[2] = new Spherocylinder("Large Example", 98.32, 99.0);
      
      SpherocylinderList2 sclist = new SpherocylinderList2("Test List",
          sArray, 3);
      
      Spherocylinder[] sc = sclist.getList();  
      
      
      Assert.assertEquals("smallestradiustestTest",
          sclist.findSpherocylinderWithLongestRadius(), sc[0]); }
  /** smallest Volume Test. **/    
   @Test public void findSpherocylinderwithsmallestvolumeTest() {
   
      Spherocylinder[] sArray = new Spherocylinder[20];
      sArray[0] = new Spherocylinder("Small Example", .5, .25);
      sArray[1] = new Spherocylinder("Medium Example", 10.8, 10.1);
      sArray[2] = new Spherocylinder("Large Example", 98.32, 99.0);
      
      SpherocylinderList2 sclist = new SpherocylinderList2("Test List",
          sArray, 3);
      
      Spherocylinder[] sc = sclist.getList();  
      
      
      Assert.assertEquals("smallestradiustestTest",
          sclist.findSpherocylinderWithSmallestVolume(), sc[0]); }
   /** largest volume Test. **/   
   @Test public void findSpherocylinderwithlargestvolumeTest() {
   
      Spherocylinder[] sArray = new Spherocylinder[20];
      sArray[0] = new Spherocylinder("Small Example", .5, .25);
      sArray[1] = new Spherocylinder("Medium Example", 10.8, 10.1);
      sArray[2] = new Spherocylinder("Large Example", 98.32, 99.0);
      
      SpherocylinderList2 sclist = new SpherocylinderList2("Test List",
          sArray, 3);
      
      Spherocylinder[] sc = sclist.getList();  
      
      
      Assert.assertEquals("smallestradiustestTest",
          sclist.findSpherocylinderWithLargestVolume(), sc[2]); }
  /** largest volume Test. **/        
   @Test public void findSpherocylinderwithlargestvolumeTest2() {
   
      Spherocylinder[] sArray = new Spherocylinder[20];
      sArray[0] = new Spherocylinder("Small Example", 200, 400);
      sArray[1] = new Spherocylinder("Medium Example", 10.8, 10.1);
      sArray[2] = new Spherocylinder("Large Example", 98.32, 99.0);
      
      SpherocylinderList2 sclist = new SpherocylinderList2("Test List",
          sArray, 3);
      
      Spherocylinder[] sc = sclist.getList();  
      
      
      Assert.assertEquals("smallestradiustestTest",
          sclist.findSpherocylinderWithLargestVolume(), sc[0]); }
   

   

   
   
   
   
}

