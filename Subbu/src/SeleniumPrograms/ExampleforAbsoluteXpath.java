package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleforAbsoluteXpath {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\subas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver();
		 
		 driver.get("http://www.facebook.com");
		 
		 driver.manage().window().maximize();
		 
		 WebElement CreateNew_Button = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a"));
		 CreateNew_Button.click();
		 
		 Thread.sleep(3000);
		 WebElement FirstName_Textbox = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/input"));
		 FirstName_Textbox.sendKeys("Subash");
		 
		 Thread.sleep(2000);
		 WebElement Surname_Textbox = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[2]/div/div[1]/input"));
		 Surname_Textbox.sendKeys("Yelike");
		 
		 Thread.sleep(2000);
		 WebElement Mobno_Textbox = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[2]/div/div[1]/input"));
		 Mobno_Textbox.sendKeys("9000000009");
		 
		 WebElement Pass_Textbox = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[4]/div/div[1]/input"));
		 Pass_Textbox.sendKeys("Test@1234");

	}

}
