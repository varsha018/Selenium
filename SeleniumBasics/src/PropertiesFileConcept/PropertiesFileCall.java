package PropertiesFileConcept;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class PropertiesFileCall {

	public static void main(String[] args) throws IOException {


		Properties p1 = new Properties();
		
		FileInputStream i1 = new FileInputStream("C:\\Users\\admin\\git\\SeleniumBasics\\SeleniumBasics\\src\\PropertiesFileConcept\\config.properties");
		
		p1.load(i1);
		
		System.out.println(p1.getProperty("URL"));  // all key names of property file should be written in double quotes..
		
		String n = p1.getProperty("name");
		System.out.println(n);
		
		if(n.equals("Varsha")) {
			System.out.println("this is the correct name : " + n);
			
		} else {
			System.out.println("this name does not matches with properties file name ..");
		}
		
		
		
		
		

	}

}
