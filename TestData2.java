import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestData2 
{
	   public static void main(String[] args) throws FileNotFoundException
	   {

	      String file = "test.dat";
	      
	      FileNotFoundException problem = new FileNotFoundException("Missing File");
	      
	      File myFile = new File(file);
	      if(!myFile.exists())
	    	  throw problem;
	      
		  Scanner scan = new Scanner(myFile);
		      
		  while(scan.hasNextLine())
          {
	    	  System.out.println(scan.nextLine());
	      }
		  scan.close();
	   } 
}

//Without the throws FileNotFoundException to main class there will be compilation problem. You can not use the keyword "throws". 