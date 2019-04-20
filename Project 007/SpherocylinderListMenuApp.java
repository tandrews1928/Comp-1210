import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;
/**  */
public class SpherocylinderList2MenuApp
{
/**
 * 
 * @param args - is not used.
 * @throws FileNotFoundException if the file cannot be opened.
 */
   public static void main(String[] args) throws FileNotFoundException
   {
      Spherocylinder[] myList = new Spherocylinder[40];
      String tListName = "\n Spherocylinder Test List";
      String label;
      String input;
      SpherocylinderList2 sclist = new SpherocylinderList2(tListName, myList, 0);
      Scanner scan = new Scanner(System.in);
      
      double radius, cylinderheight;   
      
      String code = "";         
      System.out.println("Spherocylinder List System Menu\n"
                       + "R - Read File and Create Spherocylinder List\n"
                       + "P - Print Spherocylinder List\n" 
                       + "S - Print Summary\n"
                       + "A - Add Spherocylinder\n"   
                       + "D - Delete Spherocylinder\n"   
                       + "F - Find Spherocylinder\n"
                       + "E - Edit Spherocylinder\n"
                       + "Q - Quit");
   
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         code = scan.nextLine();
         if (code.length() == 0) {
            continue;
         }
         code = code.toUpperCase();
         char codeChar = code.charAt(0);
         switch(codeChar) {
         
            case 'R': 
               System.out.print("\tFile name: ");
               input = scan.nextLine();
               Scanner scanfile = new Scanner(new File(input));
               String listname = "";
               listname = scanfile.nextLine();
            
               while (scanfile.hasNext()) {
                  label = scanfile.nextLine();
                  radius = Double.parseDouble(scanfile.nextLine());
                  cylinderheight = Double.parseDouble(scanfile.nextLine());
                  Spherocylinder data = new Spherocylinder(label,
                           +radius, cylinderheight);
                  myList.add(data); }   //need help
                  
               SpherocylinderList2 datalist = new SpherocylinderList2(listname,
                                           myList, 0);
            
               System.out.println("\tFile read in and "
                              + "Spherocylinder List created\n");
               break;
           
           
                    
            case 'P':
               System.out.println(sclist);
               break;
               
            case 'S':
               System.out.println("");
               System.out.println(sclist.summaryInfo());
               System.out.println("");
               break;
               
            case 'A':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               System.out.print("\tRadius: ");
               radius = Double.parseDouble(scan.nextLine());
               System.out.print("\tCylinder Height: ");
               cylinderheight = Double.parseDouble(scan.nextLine());
            
               sclist.addSpherocylinder(label, radius, cylinderheight);
               System.out.println("\t*** Spherocylinder added ***\n");
               break;   
         
         
            case 'D': 
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               
               if (sclist.deleteSpherocylinder(label) == null) {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               else {
                  System.out.println("\t\"" + label + "\" deleted\n");
               }
            
            
               break;
               
            case 'F':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               
               if (sclist.findSpherocylinder(label) == null) {
                  System.out.println("\"" + label + "\" not found");
               }
               else {
                  System.out.println(
                           sclist.findSpherocylinder(label).toString());
               }
               break;   
               
            case 'E':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               System.out.print("\tRadius: ");
               radius = Double.parseDouble(scan.nextLine());
               System.out.print("\tCylinder Height: ");
               cylinderheight = Double.parseDouble(scan.nextLine());
               
               if (sclist.findSpherocylinder(label) == null) {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               else {
                  System.out.println("\t\"" + label
                     + "\" successfully edited\n");
                  sclist.editSpherocylinder(label, radius, cylinderheight); 
               }
            
               
               break;   
                  
            case 'Q':
               break;
               
            default:
               System.out.println("\t*** invalid code ***"); 
               break; 
         }
      
      } while (!code.equalsIgnoreCase("Q"));   
      
   }
}