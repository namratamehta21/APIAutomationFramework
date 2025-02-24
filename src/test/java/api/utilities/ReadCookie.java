package api.utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCookie 
{
	 public static String getCookie()
	 {
		 String filePath = "C:\\Users\\NamrataMehta\\eclipse-workspace\\api_restassured\\src\\test\\resources\\Cookie.txt";
		 String line = null;
		 
		 try (BufferedReader br = new BufferedReader(new FileReader(filePath))) 
		 {
	             line = br.readLine();  // Read the single line from the file
	            if (line != null) {
	                System.out.println(line);  // Print the line
	            } else {
	                System.out.println("The file is empty.");
	            }
	        } catch (IOException e) {
	            e.printStackTrace();  // Handle the exception (e.g., file not found)
	        }		 
		 return line;
	 }
}
