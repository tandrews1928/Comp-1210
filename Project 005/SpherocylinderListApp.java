import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
/**
*Project 005
*Tyler Andrews-Comp1210-06.
*10/06/17
*/
public class SpherocylinderListApp {
   /**
   *colects input and gives output.
   *@param args - not used.
   *@throws FileNotFoundException - if occurs ends progam.
   */
   public static void main(String[] args) throws FileNotFoundException {
      Scanner scan = new Scanner(System.in);
      String input;
      ArrayList<Spherocylinder> inputList;
      System.out.print("Enter file name: ");
      input = scan.nextLine();
      Scanner scanfile = new Scanner(new File(input)); 
      inputList = new ArrayList<Spherocylinder>();
      System.out.println("");
      String listname = "";
      listname = scanfile.nextLine();
      
      while (scanfile.hasNext()) {
         String label = scanfile.nextLine();
         double radius = Double.parseDouble(scanfile.nextLine());
         double ch = Double.parseDouble(scanfile.nextLine());
         Spherocylinder data = new Spherocylinder(label, radius, ch);
         inputList.add(data);   
      }
      SpherocylinderList datalist = new SpherocylinderList(listname, inputList);
      System.out.println(datalist);
      System.out.println("");
      System.out.println(datalist.summaryInfo());
      scanfile.close();
      
      
   
   
      
   }
}