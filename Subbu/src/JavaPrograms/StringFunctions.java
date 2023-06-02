package JavaPrograms;

import java.lang.*;

public class StringFunctions {

	public static void main(String[] args) {
		
		
		/*String Name = "BOSE";
		String Password = "Bose@123";
		String Email = "subash.yv@gmail.com";
		
		System.out.println(Name);
		System.out.println(Password);
		System.out.println(Email);*/
		
		//Length(); Length method is used to count the total number of characters in a string.
		/*String Name = "BOSE";
		String Password = "Bose@123";
		System.out.println(Name.length()); //4
		System.out.println(Password.length());*/ //8
		
		//charAt(); This method is used to print a single character at a time based on the index.
		//Index starts from 0 ----- First Character
		/*String Name = "BOSE";
		String Password = "Bose@123";
		System.out.println(Name.charAt(3));*/ //E
		
		//substring();
		/*String Course = "Selenium Testing Automation";
		System.out.println(Course.substring(0, 16)); //Selenium Testing
		System.out.println(Course.substring(17, 27));*/ //Automation
		
		/*String Name = "BOSE";
		String Course = "Selenium";
		System.out.println(Name.toLowerCase()); //bose
		System.out.println(Course.toUpperCase());*///SELENIUM
		
		//trim();
		/*String Name = "   BOSE   ";
		System.out.println(Name.length());//10
		System.out.println(Name.trim().length());//4
		System.out.println(Name.trim());*/ //BOSE
		
		//contains();
		/*String Name = "Subash Chandra Bose";
		System.out.println(Name.contains("S")); //true
		System.out.println(Name.contains("T"));//false
		System.out.println(Name.contains("bash"));//true
		System.out.println(Name.contains("Z"));	//false	
		System.out.println(Name.contains("o"));//true
		System.out.println(Name.contains(" ")); //true
		System.out.println(Name.contains("anD"));*/ //false
		
		//equals();
		/*String Name = "Subash Chandra Bose";
		String Name1 = "Subash Chandra Bose";
		String Name2 = "Subash Chandra";
		System.out.println(Name.equals(Name2));
		System.out.println(Name.equals(Name1));
		int N1 = Name1.length();*/
		
		/*String Name = "BOSE";
		String Name1 = "bose";
		System.out.println(Name.compareTo(Name1));
		System.out.println(Name.equalsIgnoreCase(Name1));
		System.out.println(Name.replace("B", "S"));
		System.out.println(Name1.replace("b", "B"));*/
		
		//Join or Delimeter
		/*String [] Names = new String[3];
		Names[0] = "Ramu";
		Names[1] = "Sita";
		Names[2] = "Hanuma";
		Names[3] = "Lakshman";
		System.out.println(String.join(" ", Names));*/
		
		//Split
		String Name = "Subash Chandra Bose";
		String [] splitValues = Name.split("a");
		System.out.println(splitValues[0]);
		System.out.println(splitValues[1]);
		System.out.println(splitValues[2]);
		
		
		
		
		
		

	}

}
