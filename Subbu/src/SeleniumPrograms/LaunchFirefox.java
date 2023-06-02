package SeleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\subas\\Downloads\\geckodriver\\geckodriver.exe");
	    
	    WebDriver driver = new FirefoxDriver(); //I can use all the methods of Webdriver
	    
	    driver.get("http://www.facebook.com"); //Get method is used to launch/open URL
	    
	    driver.manage().window().maximize();
	    
	    System.out.println(driver.getTitle()); // This method is to print the title of the webpage
	    
	    String pagetitle = driver.getTitle(); //Facebook – log in or sign up
	    System.out.println(pagetitle);
	    
	    String myexpectedtitle = "Facebook – log in or sign up";
	    
	    System.out.println(pagetitle.equals(myexpectedtitle)); //true
	    
	    driver.quit();

	}

}
