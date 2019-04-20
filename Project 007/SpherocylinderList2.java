import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
*Project 005
*Tyler Andrews-Comp1210-06.
*10/05/17
*/
public class SpherocylinderList2 {
   private String list;
   private Spherocylinder[] sclist;
   private int numberof = 0;
   /**
   *constructs everything.
   *@param listIn - the list of data.
   *@param sclistIn - the array list containing data.
   *@param numberofIn - the number of.
   */   
   public SpherocylinderList2(String listIn,
      Spherocylinder[] sclistIn, int numberofIn) {
      list = listIn;
      sclist = sclistIn; 
      numberof = numberofIn;  
   }
   /**
   *gets the name of the array list.
   *@return list - the name of the list.
   */
   public String getName() {
   
      return list; }
   /**
   *determines how many spherocylinders are in the array list.
   *@return number - the number of spherocylinders in the array list.
   */
      
   public int numberOfSpherocylinders() {
      if (numberof == 0) {
         return 0;
      }
      else {
         return numberof;
      }
   }
   /**
   *determines the total volume.
   *@return volume - the total volume.
   */
   public double totalVolume() {
   
      double volume = 0;
      int index = 0;
      
      if (numberof == 0) {
         return 0;
      }
      while (index < numberof) {
         volume += sclist[index].volume();
         index++;
      }
      return volume;
   }
   /**
   *determines total surface area.
   *@return surfacearea - the total surface area.
   */
   public double totalSurfaceArea() {
      double surfacearea = 0;
      int index = 0;
      
      if (numberof == 0) {
         return 0;
      }
      while (index < numberof) {
         surfacearea += sclist[index].surfaceArea();
         index++;
      }
   
      return surfacearea; }
   /**
   *determines the average volume.
   *@return volume - the average volume.
   */      
   public double averageVolume() {
      if (numberof == 0) {
         return 0;
      }
   
      double volume = 0;
      volume = totalVolume() / numberOfSpherocylinders();
      return volume;
   }
   /**
   *determines the average surface area.
   *@return surfacearea - the average surface area.
   */
   public double averageSurfaceArea() {
      if (numberof == 0) {
         return 0;
      }
   
      double surfacearea = 0;
      surfacearea = totalSurfaceArea() / numberOfSpherocylinders(); 
      return surfacearea; }
   /**
   *collects output.
   *@return output - the output.
   */      
   public String toString() {
      int index = 0;
      String output = list + "\n";
      while (index < numberof) {
         output += "\n" + sclist[index].toString() + "\n";
         index++;
      }
      return output;
   }
   /**
   *summarizes all the data.
   *@return summary - summary of all the data.
   */
   public String summaryInfo() {
      DecimalFormat formated = new DecimalFormat("#,##0.0##");
      String tsa = formated.format(totalSurfaceArea());
      String tv = formated.format(totalVolume()); 
      String asa = formated.format(averageSurfaceArea());
      String av = formated.format(averageVolume());
      String summary = "----- Summary for " + getName()
         + " -----";
      summary += "\nNumber of Spherocylinders: " + numberOfSpherocylinders();
      summary += "\nTotal Surface Area: " + tsa;
      summary += "\nTotal Volume: " + tv;
      summary += "\nAverage Surface Area: " + asa;
      summary += "\nAverage Volume: " + av;
      return summary;
   }
   /**
   *returns the list.
   *@return sclist - the list.
   */

   public Spherocylinder[] getList() {
      return sclist; }
   
 
  /**
   *reads the file.
   *@param fileNameIn - the file name.
   *@return sl = the list.
   *@throws FileNotFoundException - ...
   */
   public SpherocylinderList2 readFile(String fileNameIn) 
                                 throws FileNotFoundException {
            
      Scanner scanFile = new Scanner(new File(fileNameIn));
      Spherocylinder[] myList = new Spherocylinder[40];
      String label = "";
      double radius = 0, cylinderheight = 0;
      String name = scanFile.nextLine();
      
           
      while (scanFile.hasNext()) {
         label = scanFile.nextLine();
         radius = Double.parseDouble(scanFile.next());
         cylinderheight = Double.parseDouble(scanFile.next());
         Spherocylinder a = new Spherocylinder(label, radius, cylinderheight);
         myList[numberof] = a;
         numberof++;           
      }
      
      SpherocylinderList2 sl = new SpherocylinderList2(name, myList, numberof);
      
      return sl;
   }
   /**
   *adds a spherocylinder.
   *@param labelIn - the label.
   *@param radiusIn - the radius.
   *@param cylinderheightIn - the cylinderheight
   */
   public void addSpherocylinder(String labelIn, double radiusIn,
                            double cylinderheightIn) {
       
      Spherocylinder s = new Spherocylinder(labelIn, 
                  radiusIn, cylinderheightIn);
      
      sclist[numberof] = s;
      numberof++;
   }
   /**
   *finds a spherocylinder..
   *@param labelfindIn - the label to be found.
   *@return sl = the list.
   */
   public Spherocylinder findSpherocylinder(String labelfindIn) {
      for (Spherocylinder sl : sclist) {
         if (sl.getLabel().equalsIgnoreCase(labelfindIn)) {
            return sl; }
         else {
            return null; }
      }
      return null; 
   }
   /**
   *deletes a spherocylinder.
   *@param labelIn - the label.
   *@return s = the list.
   */
   public Spherocylinder deleteSpherocylinder(String labelIn) {
   
      Spherocylinder s = new Spherocylinder(labelIn, 0, 0);
      boolean result = false;
      for (int i = 0; i < numberof; i++) {
         if (sclist[i].getLabel().equalsIgnoreCase(labelIn)) {
            for (int j = i; j < numberof - 1; j++) {
               sclist[j] = sclist[j + 1];
            }
            sclist[numberof - 1] = null;
            numberof--;
            result = true;
         
          
         }
           
      }
      if (result) {
         return s;
      }
      else {
         return null;
      }   
   
   }
   /**
   *edits the list.
   *@param labelIn - the label.
   *@param radiusIn - the radius.
   *@param cylinderheightIn - the cylinder height.
   *@return result = the result.
   */
   public boolean editSpherocylinder(String labelIn,
          double radiusIn, double cylinderheightIn) {
   
      boolean result = false;
      boolean value = false;
      int index = -1;
      for (int i = 0; i < numberof; i++) {
         if (sclist[i].getLabel().equalsIgnoreCase(labelIn)) {
            Spherocylinder sc = sclist[i];
            sc.setRadius(radiusIn);
            sc.setCylinderHeight(cylinderheightIn);
            sclist[i] = sc;
            result = true;  
         }
         
      }
      return result; }


   
   
   
  
  
}