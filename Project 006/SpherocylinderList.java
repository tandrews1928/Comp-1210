import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
*Project 005
*Tyler Andrews-Comp1210-06.
*10/05/17
*/
public class SpherocylinderList {
   private String list;
   private ArrayList<Spherocylinder> sclist = new ArrayList<Spherocylinder>();
   /**
   *constructs everything.
   *@param listIn - the list of data.
   *@param sclistIn - the array list containing data.
   */   
   public SpherocylinderList(String listIn, ArrayList<Spherocylinder>sclistIn) {
      list = listIn;
      sclist = sclistIn;   
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
      if (sclist.size() == 0) {
         return 0;
      }
      int number = sclist.size();
      return number;
   }
   /**
   *determines the total volume.
   *@return volume - the total volume.
   */
   public double totalVolume() {
   
      double volume = 0;
      int index = 0;
      
      if (sclist.size() == 0) {
         return 0;
      }
      while (index < sclist.size()) {
         volume += sclist.get(index).volume();
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
      
      if (sclist.size() == 0) {
         return 0;
      }
      while (index < sclist.size()) {
         surfacearea += sclist.get(index).surfaceArea();
         index++;
      }
   
      return surfacearea; }
   /**
   *determines the average volume.
   *@return volume - the average volume.
   */      
   public double averageVolume() {
      if (sclist.size() == 0) {
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
      if (sclist.size() == 0) {
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
      while (index < sclist.size()) {
         output += "\n" + sclist.get(index).toString() + "\n";
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
   *gets the list.
   *@return sclist - all the data.
   */ 
   public ArrayList<Spherocylinder> getList() {
      return sclist;
   }
  /**
   *reads the file.
   *@param fileNameIn - the file name.
   *@return sl = the list.
   *@throws FileNotFoundException - ...
   */
   public SpherocylinderList readFile(String fileNameIn) 
                                 throws FileNotFoundException {
            
      Scanner scanFile = new Scanner(new File(fileNameIn));
      String label = "";
      double radius = 0, cylinderheight = 0;
      String name = scanFile.nextLine();
      
           
      while (scanFile.hasNext()) {
         label = scanFile.nextLine();
         radius = Double.parseDouble(scanFile.next());
         cylinderheight = Double.parseDouble(scanFile.next());
         Spherocylinder a = new Spherocylinder(label, radius, cylinderheight);
         sclist.add(a);           
      }
      
      SpherocylinderList sl = new SpherocylinderList(name, sclist);
      
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
      
      sclist.add(s);
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
      int index = -1;
      for (Spherocylinder sl : sclist) {
         if (sl.getLabel().equalsIgnoreCase(labelIn)) {
            index = sclist.indexOf(sl);
            break;
         }
         
      }
      
      
      if (index >= 0) {
         sclist.remove(index);
         return s;
      }
      else {
         return null; }
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
      int index = -1;
      for (Spherocylinder sl : sclist) {
         if (sl.getLabel().equalsIgnoreCase(labelIn)) {
            index = sclist.indexOf(sl); }
         if (index >= 0) {
            Spherocylinder edit = sclist.get(index);
            edit.setRadius(radiusIn);
            edit.setCylinderHeight(cylinderheightIn);
            result = true;
         }
      
      }
      return result;
   }   


   
   
   
  
  
}