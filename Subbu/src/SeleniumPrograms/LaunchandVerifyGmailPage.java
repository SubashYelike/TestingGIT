package SeleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchandVerifyGmailPage {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\subas\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 
	 driver.get("http://www.gmail.com");
	 
	 
	 driver.manage().window().maximize();
	 
	 System.out.println(driver.getTitle());
	 
	 String ptitle = driver.getTitle();
	 System.out.println(ptitle);
	 
	 String myexpectedtitle = "Gmail";
	 
	 System.out.println(myexpectedtitle.contains(ptitle));
	 
	 driver.quit();
	 
	 }

}
