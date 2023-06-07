package SeleniumProgram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class MouseKeyboardEx {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\subas\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(8, TimeUnit.SECONDS);
						
		WebElement Forgotpass = driver.findElement(By.linkText("Forgotten password?"));
				
		Actions mouseHover = new Actions(driver);
		
		Action ClickButton = mouseHover.moveToElement(Forgotpass).click().build();
		
		ClickButton.perform();
		
		WebElement EntermobileNum = driver.findElement(By.id("identify_email"));
		
		Action SentkeyAct = mouseHover.sendKeys(EntermobileNum, "9885873004").build();
		
		SentkeyAct.perform();

	}

}
