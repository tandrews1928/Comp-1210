import java.text.DecimalFormat;
/**
*Project 004
*Tyler Andrews-Comp1210-06.
*9/26/17
*/
public class Spherocylinder {
   private String label = "";
   private double radius = 0;
   private double cylinderheight = 0;
   /**
   *constructs everything.
   *@param labelIn = the label.
   *@param radiusIn = the radius.
   *@param cylinderheightIn = the cylinder height.
   */
   public Spherocylinder(String labelIn, double radiusIn,
      double cylinderheightIn) {
      setLabel(labelIn);
      setRadius(radiusIn);
      setCylinderHeight(cylinderheightIn);
   }
   /**
   *sets the label.
   *@param labelIn = the label.
   *@return isSet = true if label is not null.
   */
   public boolean setLabel(String labelIn) {
      boolean isSet;
      if (labelIn == null) {
         isSet = false;
      }
      else {
         label = labelIn.trim();
         isSet = true; 
      }
      return isSet;
   }
   /**
   *sets the radius.
   *@param radiusIn = the radius.
   *@return isSet = true if radius is positive.
   */
   public boolean setRadius(double radiusIn) {
      boolean isSet = false;
      if (radiusIn >= 0) {
         radius = radiusIn;
         isSet = true;
      }
      return isSet;
   }
   /**
   *sets the CylinderHeight.
   *@param cylinderheightIn = the cylinderheight.
   *@return isSet = true if cylinderheight is positive.
   */
   public boolean setCylinderHeight(double cylinderheightIn) {
      boolean isSet = false;
      if (cylinderheightIn >= 0) {
         cylinderheight = cylinderheightIn;
         isSet = true;
      }
      return isSet;
   }
   /**
   *gets the label.
   *@return label = the label.
   */
   public String getLabel() {
      return label;
   }
   /**
   *gets the radius.
   *@return radius = the radius.
   */
   public double getRadius() {
      return radius;
   }
   /**
   *gets the cylinderheight.
   *@return cylinderheight = the cylinderheight.
   */
   public double getCylinderHeight() {
      return cylinderheight; 
   }
  /**
  *calculates circumference.
  *@return circumference = the circumference.
  */    
   public double circumference() {
      double circumference = 2 * (Math.PI) * (radius);
      return circumference; }
  /**
  *calculates surfaceArea.
  *@return surfacearea = the surface area.
  */      
   public double surfaceArea() {
      double surfacearea = 2 * (Math.PI) * (radius)
         * (2 * radius + cylinderheight);
      return surfacearea; }
  /**
  *calculates volume.
  *@return volume = the volume.
  */    
   public double volume() {
      double volume = ((Math.PI) * Math.pow(radius, 2)
         * (((4.0) * (radius / 3.0)) + cylinderheight));
      return volume; }
  /**
  *gathers output for circumference, surface area, and volume.
  *@return output = The output for circumference, surface area, and volume.
  */
   public String toString() {
      DecimalFormat formated = new DecimalFormat("#,##0.0##");
      String c = formated.format(circumference());
      String sa = formated.format(surfaceArea()); 
      String v = formated.format(volume());
      String output = "Spherocylinder \"" + label + "\" with radius "
         + radius + " and cylinder height " + cylinderheight + " has:\n";
      output += "\tcircumference = " + c + " units\n";
      output += "\tsurface area = " + sa + " square units\n";
      output += "\tvolume = " + v + " cubic units";
      return output;
   
   
   }
      
  
      
      
}


