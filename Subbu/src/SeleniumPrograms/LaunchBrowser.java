package SeleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\subas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Launch URL
		driver.get("http://www.facebook.com");
		// Get the page Title
		// System.out.println(driver.getTitle());
		String pagetitle = driver.getTitle(); // Facebook – log in or sign up
		System.out.println(pagetitle);
		String myexpectedtitle = "Facebook – log in or sign up";
		System.out.println(pagetitle.equals(myexpectedtitle)); // true
		driver.quit();

	}

}
