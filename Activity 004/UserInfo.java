 /**
*Activity 004.
*Tyler Andrews-Comp1210-06.
*9/25/17.
*/
public class UserInfo {
   private String firstName;
   private String lastName;
   private String location;
   private int age;
   private int status;
   private static final int OFFLINE = 0, ONLINE = 1;
   /**
   *defines variables. 
   *@param firstNameIn = users first name
   *@param lastNameIn = users last name
   */
   public UserInfo(String firstNameIn, String lastNameIn) { //constructor
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   }
   /**
   *converts to string.
   *@return output = variables location, age, and status.
   */
   public String toString() {  //methods
      String output = "Name: "  + firstName + " "
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE) {
         output += "Offline";
      }
      else {
         output += "Online";
      }
      return output;
   }
   /**
   *defines location.
   *@param locationIn = the location of the user.
   */
   public void setLocation(String locationIn) {
      location = locationIn;
   }
   /**
   *defines age.
   *@param ageIn = the age of the user
   *@return isSet = the age of the user if it is greater than zero.
   */
   public boolean setAge(int ageIn) {
      boolean isSet = false;
      if (ageIn > 0) {
         age = ageIn;
         isSet = true;
      }
      return isSet;
   }
   /**
   *returns age.
   *@return age = the age of the user
   */
   public int getAge() {
      return age;
   }
   /**
   *returns location.
   @return location = the location of the user.
   */
   public String getLocation() {
      return location;
   }
   /**
   *defines logOff.
   */
   public void logOff() {
      status = OFFLINE;
   }
   /**
   *defines logOn.
   */
   public void logOn() {
      status = ONLINE;
   }
 
 

}
