package SeleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MsEdgeDriver {

	public static void main(String[] args) {
		
		//Setup Environment path for Edge Driver
				System.setProperty("webdriver.edge.driver","C:\\Users\\subas\\Downloads\\edgedriver_win64\\msedgedriver.exe");
				
				//Create Webdriver Object
				WebDriver driver = new EdgeDriver();
				
				// Launch URL
				driver.get("http://www.facebook.com");
				
				// Get the page Title
				//System.out.println(driver.getTitle());
				String pagetitle = driver.getTitle(); // Facebook – log in or sign up
				System.out.println(pagetitle);
				
				//Verify the Title is correct or not
				String myexpectedtitle = "Facebook – log in or sign up";
				System.out.println(pagetitle.equals(myexpectedtitle)); // true
				
				//Close the Browser
				driver.quit();

	}

}
