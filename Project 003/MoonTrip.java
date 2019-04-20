import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;
/**
*Project 003.
*Tyler Andrews-Comp1210-06.
*9/18/17.
*/
public class MoonTrip {
 /**
 *@param args Command line arguments - (not used).
 */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      String ticketcode = "";
      System.out.print("Enter ticket code: ");
      
      ticketcode = userInput.nextLine();
      ticketcode = ticketcode.trim();
      int length = ticketcode.length();
      
      if (length >= 26) {
         System.out.println("");
         String month = ticketcode.substring(0, 2);
         String day = ticketcode.substring(2, 4);
         String year = ticketcode.substring(4, 8);
         System.out.print("Date: " + month + "/" + day + "/" + year);
         
         String hours = ticketcode.substring(8, 10);
         String minutes = ticketcode.substring(10, 12);
         System.out.print("   Time: " + hours + ":" + minutes);
         
         String seats = ticketcode.substring(22, 25);
         System.out.println("   Seat: " + seats);
         
         String itinerary = ticketcode.substring(25, length);
         System.out.println("Itinerary: " + itinerary);
         
         String price = ticketcode.substring(13, 20);
         double price2 = Double.parseDouble(price);
         DecimalFormat formated = new DecimalFormat("$###,##0.00");
         String end = formated.format(price2);
         System.out.print("Price: " + end);
         
         char category = ticketcode.charAt(12);
         System.out.print("   Category: " + category);
         String category2 = Character.toString(category);
         
         String student = "s";
         String employee = "e";
         
         if (category2.equals(student)) {
            double price3 = price2 - (price2 * .4);
            DecimalFormat formated2 = new DecimalFormat("$###,##0.00");
            String end2 = formated2.format(price3);
            System.out.println("   Cost: " + end2); }
         else {
         
            if (category2.equals(employee)) {
               double price4 = price2 - (price2 * .2);
               DecimalFormat formated3 = new DecimalFormat("$###,##0.00");
               String end3 = formated3.format(price4);
               System.out.println("   Cost: " + end3); }
            else {
            
               System.out.println("   Cost: " + end); }
         }
            
         Random randomnumber = new Random();   
         int random = randomnumber.nextInt(9998) + 1;
         DecimalFormat formated4 = new DecimalFormat("0000");
         String random2 = formated4.format(random);
         
         
         System.out.print("Prize Number: " + random2);
        
         
         
      }
      
         
       
         
         
         
         
         
         
      else {
         System.out.println("");
         System.out.println("*** Invalid ticket code ***");
         System.out.println("Ticket code must have at least 26 characters."); 
      
      
      }
   }
}