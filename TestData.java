import java.util.Scanner;
import java.io.*;

public class TestData
{
   public static void main(String[] args) 
   {
	   
      String file = "test.dat";
      
      try 
      {
    	  File myFile = new File(file);
	      Scanner scan = new Scanner(myFile);
	      
	      while(scan.hasNextLine())
	      {
	    	  System.out.println(scan.nextLine());
	      }
	      scan.close();
	   } 
       catch (FileNotFoundException e)
	   {
		   System.out.println("File not found");
	   }
	
   }
}	