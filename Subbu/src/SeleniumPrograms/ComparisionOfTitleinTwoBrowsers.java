package SeleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ComparisionOfTitleinTwoBrowsers {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\subas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver Cdriver = new ChromeDriver();
		
		Cdriver.get("http://www.facebook.com");
		
		String Cpagetitle = Cdriver.getTitle(); 
		
		System.out.println(Cpagetitle); 
		
		String myexpectedtitle = "Facebook – log in or sign up";
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\subas\\Downloads\\geckodriver\\geckodriver.exe");
	    
	    WebDriver Fdriver = new FirefoxDriver(); 
	    
	    Fdriver.get("http://www.facebook.com"); 
	    
	    Fdriver.manage().window().maximize();
	    
	    System.out.println(Fdriver.getTitle()); 
	    
	    String Fpagetitle = Fdriver.getTitle(); 
	    	    
	    String myexptitle = "Facebook – log in or sign up";
	    
	    System.out.println(Fpagetitle.equals(myexpectedtitle)); 
	    
	    System.out.println(Cpagetitle.equals(Fpagetitle));
	    
	    Cdriver.close();
	    Fdriver.close();
		

	}

}
