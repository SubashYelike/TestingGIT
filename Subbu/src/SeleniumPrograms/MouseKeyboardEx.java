package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseKeyboardEx {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\subas\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		WebElement Forgotpass = driver.findElement(By.linkText("Forgotten password?"));
		Thread.sleep(5000);
		WebElement EntermobileNum = driver.findElement(By.cssSelector("#identify_email"));
		
		Actions mouseHover = new Actions(driver);
		
		Actions ClickButton = (Actions) mouseHover.moveToElement(Forgotpass).click().build();
		
		ClickButton.perform();
		
		Actions SentkeyAct = (Actions) mouseHover.sendKeys(EntermobileNum, "9885873004").build();
		
		SentkeyAct.perform();
		
		

	}

}
