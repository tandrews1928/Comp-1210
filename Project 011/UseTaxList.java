import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Arrays;
import java.util.NoSuchElementException;

 /**
*Project 010
*Tyler Andrews-Comp1210-06.
*11/30/17
*/

public class UseTaxList {

   private String taxDistrict = "not yet assigned";
   private Vehicle[] vehicleList = new Vehicle[0];
   private String[] excludedRecords = new String[0];
  /**
   *constructs everything.
   */ 
 
   public UseTaxList() {
   
   }
  /**
  *read file method.
  *@param fileNameIn = the file name.
  *@throws FileNotFoundException - ...
  */
 
   public void readVehicleFile(String fileNameIn)
      throws FileNotFoundException {
   
      Scanner scanFile = new Scanner(new File(fileNameIn));
      taxDistrict = scanFile.nextLine();
      String currentline = "";
      
      while (scanFile.hasNext()) {
         currentline = scanFile.nextLine().trim();
         Scanner scancurrent = new Scanner(currentline);
         scancurrent.useDelimiter(";");
         String category = scancurrent.next().trim();
         category = category.toUpperCase();
         char categoryChar = category.charAt(0);
         String owner, yearmakemodel = "";
         double value = 0.0;
         double tons = 0.0;
         boolean altfuel = false;
         
         switch(categoryChar) {
            case 'C':
               try {
                  owner = scancurrent.next().trim();
                  yearmakemodel = scancurrent.next().trim();
                  value = Double.parseDouble(scancurrent.next().trim());
                  altfuel = Boolean.parseBoolean(scancurrent.next().trim());
                  Car data = new Car(owner, yearmakemodel, value, altfuel);
                  addVehicle(data);
                  break;
               }
                  
               catch (NegativeValueException e) {
                  addExcludedRecord(e + " in:\n" + currentline);
                  break; 
               }
               
               catch (NumberFormatException e) {
                  addExcludedRecord(e + " in:\n" + currentline);
                  break; 
               }
               
               catch (NoSuchElementException e) {
                  addExcludedRecord(e + " in:\n" + currentline);
                  break; 
               }
            
            
               
               
            case 'T':
               try {
                  owner = scancurrent.next().trim();
                  yearmakemodel = scancurrent.next().trim();
                  value = Double.parseDouble(scancurrent.next().trim());
                  altfuel = Boolean.parseBoolean(scancurrent.next().trim());
                  tons = Double.parseDouble(scancurrent.next().trim());
                  Truck data1 = new Truck(owner, yearmakemodel,
                     +value, altfuel, tons);
                  addVehicle(data1);
                  break; }
               catch (NegativeValueException e) {
                  addExcludedRecord(e + " in:\n" + currentline);
                  break; 
               }
               
               catch (NumberFormatException e) {
                  addExcludedRecord(e + " in:\n" + currentline);
                  break; 
               }
               
               catch (NoSuchElementException e) {
                  addExcludedRecord(e + " in:\n" + currentline);
                  break; 
               }
            
            case 'S':
               try {
                  owner = scancurrent.next().trim();
                  yearmakemodel = scancurrent.next().trim();
                  value = Double.parseDouble(scancurrent.next().trim()); 
                  altfuel = Boolean.parseBoolean(scancurrent.next().trim());
                  tons = Double.parseDouble(scancurrent.next().trim());
                  int axles = Integer.parseInt(scancurrent.next().trim());
                  SemiTractorTrailer data2 = new SemiTractorTrailer(owner,
                     yearmakemodel, value, altfuel, tons, axles);
                  addVehicle(data2);
                  break; }
               catch (NegativeValueException e) {
                  addExcludedRecord(e + " in:\n" + currentline);
                  break; 
               }
               
               catch (NumberFormatException e) {
                  addExcludedRecord(e + " in:\n" + currentline);
                  break; 
               }
               
               catch (NoSuchElementException e) {
                  addExcludedRecord(e + " in:\n" + currentline);
                  break; 
               }
            
            case 'M':
               try {
                  owner = scancurrent.next().trim();
                  yearmakemodel = scancurrent.next().trim();
                  value = Double.parseDouble(scancurrent.next().trim()); 
                  altfuel = Boolean.parseBoolean(scancurrent.next().trim());
                  double enginesiz = 
                     Double.parseDouble(scancurrent.next().trim());
                  Motorcycle data3 = new Motorcycle(owner, yearmakemodel,
                     value, altfuel, enginesiz);
                  addVehicle(data3);
                  break; }
               catch (NegativeValueException e) {
                  addExcludedRecord(e + " in:\n" + currentline);
                  break; 
               }
               
               catch (NumberFormatException e) {
                  addExcludedRecord(e + " in:\n" + currentline);
                  break; 
               }
               
               catch (NoSuchElementException e) {
                  addExcludedRecord(e + " in:\n" + currentline);
                  break; 
               }
               
            default:
               addExcludedRecord("Invalid Vehicle Category in:\n" 
                  + currentline);
               break; 
               
         }         
      }
   
   
   }
  /**
  *get tax method.
  *@return taxDistrict = the tax district.
  */
 
   public String getTaxDistrict() {
      return taxDistrict;
   }
  /**
  *set tax method.
  *@param taxDistrictIn = the tax district.
  */

   public void setTaxDistrict(String taxDistrictIn) {
      taxDistrict = taxDistrictIn;
   }
  /**
  *get vehiclelist method.
  *@return vehicleList = the vehicle list.
  */
 
   public Vehicle[] getVehicleList() {
      return vehicleList;
   }
 /**
  *get ExcludedRecords method.
  *@return excludedRecords = the excludedRecords.
  */
  
   public String[] getExcludedRecords() {
      return excludedRecords;
   }
  /**
  * add vehicle method.
  *@param vehicleIn = the vehicle.
  */
 
   public void addVehicle(Vehicle vehicleIn) {
      vehicleList = Arrays.copyOf(vehicleList, vehicleList.length + 1);
      vehicleList[vehicleList.length - 1] = vehicleIn;
   } 
  /**
  * add ExcludedRecord method.
  *@param recordIn = the record.
  */
   public void addExcludedRecord(String recordIn) {
      excludedRecords = Arrays.copyOf(excludedRecords,
          excludedRecords.length + 1);
      excludedRecords[excludedRecords.length - 1] = recordIn;
   }
   /**
  *to String method.
  *@return output = the output.
  */ 
   public String toString() {
      int index = 0;
      String output = "";
      while (index < vehicleList.length) {
         output += "\n" + vehicleList[index].toString() + "\n";
         index++;
      }
      return output;
   }
    /**
  * calculatetotaltax method.
  *@return total = the total.
  */
   public double calculateTotalUseTax() {
      double total = 0;
      for (int i  = 0; i < vehicleList.length; i++) {
         total += vehicleList[i].useTax();
      
      }
      return total;
   }
   /**
  *calculateTotalValuea method.
  *@return total = the total.
  */    
   public double calculateTotalValue() {
      double total = 0;
      for (int i  = 0; i < vehicleList.length; i++) {
         total += vehicleList[i].getValue();
      
      }
      return total; }
   /**
  *summary method.
  *@return summary = the summary.
  */    
   public String summary() {
      DecimalFormat formated = new DecimalFormat("$#,##0.00#");
      String summary = "------------------------------\n";
      summary += "Summary for " + this.getTaxDistrict() + "\n";
      summary += "------------------------------\n";
      summary += "Number of Vehicles: " + vehicleList.length + "\n";
      summary += "Total Value: " 
         + formated.format(this.calculateTotalValue()) + "\n";
      summary += "Total Use Tax: " 
         + formated.format(this.calculateTotalUseTax()) + "\n";
      return summary;
      
   }
   /**
  *listbyowner method.
  *@return output = the output.
  */ 
   public String listByOwner() {
      String output = "------------------------------\n";
      output += "Vehicles by Owner\n";
      output += "------------------------------\n";
      Arrays.sort(vehicleList);
      output += this.toString();
      return output;
   }
  /**
  *listbyusetax method.
  *@return output = the output.
  */ 
   public String listByUseTax() {
      String output = "------------------------------\n";
      output += "Vehicles by Use Tax\n";
      output += "------------------------------\n";
      Arrays.sort(vehicleList, new UseTaxComparator());
      output += this.toString();
      return output;
   }
  /**
  *excludedrecordslist method.
  *@return output = the output.
  */ 
   public String excludedRecordsList() {
      String output = "------------------------------\n";
      output += "Excluded Records\n";
      output += "------------------------------\n";
      int index = 0;
   
      while (index < excludedRecords.length) {
         output += "\n" + excludedRecords[index] + "\n";
         index++;
      }
      return output;
   }


   
   
   
   
}