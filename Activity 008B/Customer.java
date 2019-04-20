/**
*Activity 008
*Tyler Andrews-Comp1210-06.
*11/6/17
*/

public class Customer implements Comparable<Customer> {
   private String name;
   private String location;
   private double balance;
   /**constructs everything.
   *@param nameIn - the list of data.
   */ 

   public Customer(String nameIn) {
      name = nameIn;
      location = "";
      balance = 0;
   }
   /**constructs everything.
   *@param locationIn - the list of data.
   */ 
   public void setLocation(String locationIn) { // sets location variable
      location = locationIn;
   }
   /**constructs everything.
   *@param amount - the list of data.
   */ 
   public void changeBalance(double amount) { // add amount to balance
      balance += amount;
   }
   /**constructs everything.
   *@return location - the list of data.
   */ 
   public String getLocation() { // returns variable for location
      return location;
   }
   /**constructs everything.
   *@return balance - the list of data.
   */ 
   public double getBalance() { // returns variable for balance
      return balance;
   }
   /**constructs everything.
   *@param city - the list of data.
   *@param state - s
   */
   public void setLocation(String city, String state) {
      location = city + ", " + state;
   
   }
   /**constructs everything.
   *@return output - the list of data.
   */
   public String toString() {
      String output = name + "\n" + location + "\n$" + balance;
      return output;
   }
   /**constructs everything.
   *@param obj - o
   *@return 0 - the list of data.
   */
   public int compareTo(Customer obj) {
      if (Math.abs(this.balance - obj.getBalance()) < 0.000001) {
         return 0;
      }
      else if (this.balance < obj.getBalance()) {
         return -1;
      }
      else {
         return 1;
      }
   }
} 
