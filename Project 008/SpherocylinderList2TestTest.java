   import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;


public class SpherocylinderList2Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   @Test public void getListNameTest() {
   
      Spherocylinder[] sArray = new Spherocylinder[20];
      sArray[0] = new Spherocylinder("1", 4, 5);
      sArray[1] = new Spherocylinder("2", 5, 5);
      sArray[2] = new Spherocylinder("3", 3, 3);
      
      SpherocylinderList2 sclist = new SpherocylinderList2("Test List", sArray, 3);
      
      Assert.assertEquals("getListName Test",
                           "Test List", sclist.getName()); }
                           
   @Test public void totalvolumeTest() {
   
      Spherocylinder[] sArray = new Spherocylinder[20];
      sArray[0] = new Spherocylinder("1", .5, .25);
      sArray[1] = new Spherocylinder("2", 10.8, 10.1);
      sArray[2] = new Spherocylinder("3", 98.32, 99.0);
      
      SpherocylinderList2 sclist = new SpherocylinderList2("Test List", sArray, 3);
      
      Assert.assertEquals("gettotalvolume Test",
                           6996733.041, sclist.totalVolume()); }
                           
   @Test public void totalsurfaceareaTest() {
   
      Spherocylinder[] sArray = new Spherocylinder[20];
      sArray[0] = new Spherocylinder("1", .5, .25);
      sArray[1] = new Spherocylinder("2", 10.8, 10.1);
      sArray[2] = new Spherocylinder("3", 98.32, 99.0);
      
      SpherocylinderList2 sclist = new SpherocylinderList2("Test List", sArray, 3);
      
      Assert.assertEquals("gettotalsurfacearea Test",
                           184790.426, sclist.totalSurfaceArea()); }
                           
   @Test public void averageVolumeTest() {
   
      Spherocylinder[] sArray = new Spherocylinder[20];
      sArray[0] = new Spherocylinder("1", .5, .25);
      sArray[1] = new Spherocylinder("2", 10.8, 10.1);
      sArray[2] = new Spherocylinder("3", 98.32, 99.0);
      
      SpherocylinderList2 sclist = new SpherocylinderList2("Test List", sArray, 3);
      
      Assert.assertEquals("getaveragevolume Test",
                           2332244.347, sclist.averageVolume()); }
                        
   @Test public void averageSurfaceAreaTest() {
   
      Spherocylinder[] sArray = new Spherocylinder[20];
      sArray[0] = new Spherocylinder("1", .5, .25);
      sArray[1] = new Spherocylinder("2", 10.8, 10.1);
      sArray[2] = new Spherocylinder("3", 98.32, 99.0);
      
      SpherocylinderList2 sclist = new SpherocylinderList2("Test List", sArray, 3);
      
      Assert.assertEquals("getaveragesurfacearea Test",
                           61596.809, sclist.averageSurfaceArea()); }
                        
   @Test public void toStringTest() {
   
      Spherocylinder[] sArray = new Spherocylinder[20];
      sArray[0] = new Spherocylinder("Small Example", .5, .25);
      sArray[1] = new Spherocylinder("Medium Example", 10.8, 10.1);
      sArray[2] = new Spherocylinder("Large Example", 98.32, 99.0);
      
      SpherocylinderList2 sclist = new SpherocylinderList2("Test List", sArray, 3);
      
      Assert.assertEquals("toString Test",
                           true, sclist.toString().contains("Spherocylinder \"Small Example\" with "
            + "radius 0.5 and cylinder height 0.25 has:\n\tcircumference"
            + " = 3.142 units\n\tsurface area = 3.927 square"
            + " units\n\tvolume = 0.72 cubic units"));
   }
   
   @Test public void SummaryTest() {
   
      Spherocylinder[] sArray = new Spherocylinder[20];
      sArray[0] = new Spherocylinder("Small Example", .5, .25);
      sArray[1] = new Spherocylinder("Medium Example", 10.8, 10.1);
      sArray[2] = new Spherocylinder("Large Example", 98.32, 99.0);
      
      SpherocylinderList2 sclist = new SpherocylinderList2("Test List", sArray, 3);
      
      Assert.assertEquals("Summary Test",
                           true, sclist.summaryInfo().contains("Total Surface Area: 184,790.426"));
   }
  
   @Test public void readFileTest() throws IOException {
   
      Spherocylinder[] sArray = new Spherocylinder[20];
      sArray[0] = new Spherocylinder("Small Example", .5, .25);
      sArray[1] = new Spherocylinder("Medium Example", 10.8, 10.1);
      sArray[2] = new Spherocylinder("Large Example", 98.32, 99.0);
      
      SpherocylinderList2 sclist = new SpherocylinderList2("Test List", null, 3);
      sclist = sclist.readFile("Spherocylinder_data_1.txt");
      
      Assert.assertEquals("ReadFileTest", "Test List", sclist.getName()); 
   }
   
   @Test public void AddSpherocylinderTest(){
   
      Spherocylinder[] sArray = new Spherocylinder[20];
      sArray[0] = new Spherocylinder("Small Example", .5, .25);
      sArray[1] = new Spherocylinder("Medium Example", 10.8, 10.1);
      sArray[2] = new Spherocylinder("Large Example", 98.32, 99.0);
      
      SpherocylinderList2 sclist = new SpherocylinderList2("Test List", sArray, 3);
      
      Spherocylinder s = new Spherocylinder("New Example", 4, 5);
      sclist.addSpherocylinder("New Example", 4, 5);
      Spherocylinder[] sc = sclist.getList();
      
      
      Assert.assertEquals("addSpherocylinderTest", s, sc[3]); 
   }
   
   @Test public void DeleteSpherocylinderTest(){
   
      Spherocylinder[] sArray = new Spherocylinder[20];
      sArray[0] = new Spherocylinder("Small Example", .5, .25);
      sArray[1] = new Spherocylinder("Medium Example", 10.8, 10.1);
      sArray[2] = new Spherocylinder("Large Example", 98.32, 99.0);
      
      SpherocylinderList2 sclist = new SpherocylinderList2("Test List", sArray, 3);
      
      Spherocylinder s = new Spherocylinder("Medium Example", .5, .25);
      Spherocylinder[] sc = sclist.getList();
      
      
      Assert.assertEquals("pre delete Test",
                           s, sc[1]);         
   
      Assert.assertTrue("deleteTriangle true Test",
                           sclist.deleteTriangle("New Example", 4, 5));
   
      Assert.assertEquals("deleteTriangle true Test",
                           s, sc[0]);
   
      Assert.assertFalse("deleteTriangle false Test",
                           sclist.deleteTriangle("false", 9, 9)); 
   }
   
   @Test public void FindSpherocylinderTest(){
   
      Spherocylinder[] sArray = new Spherocylinder[20];
      sArray[0] = new Spherocylinder("Small Example", .5, .25);
      sArray[1] = new Spherocylinder("Medium Example", 10.8, 10.1);
      sArray[2] = new Spherocylinder("Large Example", 98.32, 99.0);
      
      SpherocylinderList2 sclist = new SpherocylinderList2("Test List", sArray, 3);
      
      Spherocylinder[] sc = sclist.getList();  
      
      
      Assert.assertEquals("findSpherocylinderTest", sclist.findSpherocylinder("Small Example"), sc[0]); 
   }
   
   @Test public void EditSpherocylinderTest(){
   
      Spherocylinder[] sArray = new Spherocylinder[20];
      sArray[0] = new Spherocylinder("Small Example", .5, .25);
      sArray[1] = new Spherocylinder("Medium Example", 10.8, 10.1);
      sArray[2] = new Spherocylinder("Large Example", 98.32, 99.0);
      
      SpherocylinderList2 sclist = new SpherocylinderList2("Test List", sArray, 3);
      
      sclist.editSpherocylinder("Small Example", 4, 5);
      Spherocylinder[] sc = sclist.getList();  
      
      
      Assert.assertEquals("editSpherocylinderTest", s, sc[0]); 
   }
   
   @Test public void FindSpherocylinderwithsmallestRadiusTest(){
   
      Spherocylinder[] sArray = new Spherocylinder[20];
      sArray[0] = new Spherocylinder("Small Example", .5, .25);
      sArray[1] = new Spherocylinder("Medium Example", 10.8, 10.1);
      sArray[2] = new Spherocylinder("Large Example", 98.32, 99.0);
      
      SpherocylinderList2 sclist = new SpherocylinderList2("Test List", sArray, 3);
      
      Spherocylinder[] sc = sclist.getList();  
      
      
      Assert.assertEquals("smallestradiustestTest", sclist.findSpherocylinderWithShortestRadius(), sc[0]); }
      
      
   @Test public void FindSpherocylinderwithlargestRadiusTest(){
   
      Spherocylinder[] sArray = new Spherocylinder[20];
      sArray[0] = new Spherocylinder("Small Example", .5, .25);
      sArray[1] = new Spherocylinder("Medium Example", 10.8, 10.1);
      sArray[2] = new Spherocylinder("Large Example", 98.32, 99.0);
      
      SpherocylinderList2 sclist = new SpherocylinderList2("Test List", sArray, 3);
      
      Spherocylinder[] sc = sclist.getList();  
      
      
      Assert.assertEquals("smallestradiustestTest", sclist.findSpherocylinderWithLongestRadius(), sc[2]); }
      
   @Test public void FindSpherocylinderwithsmallestvolumeTest(){
   
      Spherocylinder[] sArray = new Spherocylinder[20];
      sArray[0] = new Spherocylinder("Small Example", .5, .25);
      sArray[1] = new Spherocylinder("Medium Example", 10.8, 10.1);
      sArray[2] = new Spherocylinder("Large Example", 98.32, 99.0);
      
      SpherocylinderList2 sclist = new SpherocylinderList2("Test List", sArray, 3);
      
      Spherocylinder[] sc = sclist.getList();  
      
      
      Assert.assertEquals("smallestradiustestTest", sclist.findSpherocylinderWithSmallestVolume(), sc[0]); }
      
   @Test public void FindSpherocylinderwithlargestvolumeTest(){
   
      Spherocylinder[] sArray = new Spherocylinder[20];
      sArray[0] = new Spherocylinder("Small Example", .5, .25);
      sArray[1] = new Spherocylinder("Medium Example", 10.8, 10.1);
      sArray[2] = new Spherocylinder("Large Example", 98.32, 99.0);
      
      SpherocylinderList2 sclist = new SpherocylinderList2("Test List", sArray, 3);
      
      Spherocylinder[] sc = sclist.getList();  
      
      
      Assert.assertEquals("smallestradiustestTest", sclist.findSpherocylinderWithLargestVolume(), sc[2]); }
   

   

   
   
   
   
}


