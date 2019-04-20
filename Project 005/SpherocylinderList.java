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
   
   
   public ArrayList getList() {
      return sclist;
   }
   public SpherocylinderList(String fileIn) {
      
   }
   
   
   
  
  
}