package SeleniumProgram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorEx {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\subas\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://automationtesting.co.uk/");

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		WebElement LoginPortal = driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[15]/a"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", LoginPortal);
		
		WebElement Username = driver.findElement(By.id("login_text"));
		WebElement Password = driver.findElement(By.id("login_password"));
		
		js.executeScript("arguments[0].value = 'Subash';", Username);
		js.executeScript("arguments[0].value = 'Subash12345';", Password);
		
		WebElement LoginButton = driver.findElement(By.id("login_btn"));
		js.executeScript("arguments[0].click();", LoginButton);
		

	}

}
