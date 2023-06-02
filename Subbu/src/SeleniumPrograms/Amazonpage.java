package SeleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonpage {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\subas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
WebDriver driver = new ChromeDriver();

driver.get("https://www.amazon.com");

driver.manage().window().maximize();

//System.out.println(driver.getTitle());

String pTitle = driver.getTitle();
System.out.println(pTitle);

String MyexpTitle = "Amazon.com. Spend less. Smile more.";
System.out.println(pTitle.equals(MyexpTitle));

driver.quit();



	}

}
