package SeleniumPrograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsHandeling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\subas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.rediff.com/");
		 
		 driver.manage().window().maximize();
		 
		 WebElement signInlink = driver.findElement(By.linkText("Sign in"));
		 signInlink.click();
		 
		 WebElement signInButton = driver.findElement(By.xpath("//input[@name='proceed']"));
		 signInButton.click();
		 
		 Alert AL = driver.switchTo().alert();
		 System.out.println(AL.getText());
		 AL.accept();
		 
		 WebElement UN = driver.findElement(By.id("login1"));
		 WebElement Psw = driver.findElement(By.id("password"));
		 
		 UN.sendKeys("subash.yv@gmail.com");
		 Psw.sendKeys("Hello@123"); 
		 
		 

	}

}
