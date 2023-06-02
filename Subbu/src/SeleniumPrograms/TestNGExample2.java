package SeleniumPrograms;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGExample2 {

	WebDriver driver;
	
	@BeforeSuite
	public void ChromeSetup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\subas\\Downloads\\chromedriver_win32\\chromedriver.exe");
	}
	
	@BeforeTest
	public void WebDriver_Setup() {
	    driver = new ChromeDriver();
	}
	
	@BeforeClass
	public void LaunchURL() {
		driver.manage().window().maximize();
		driver.get("https://automationtesting.co.uk/");
		
	}
	
	@BeforeMethod
	public void Login() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/a")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/a")).click();
		
	}
	
	@Test
	public void Buttons() throws InterruptedException {
        
		
		Thread.sleep(5000);
		WebElement Button_link = driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[5]/a"));
		Button_link.click();
		Thread.sleep(5000);
		WebElement Btn1 = driver.findElement(By.id("btn_one"));
		Btn1.click();
		Thread.sleep(5000);
		 Alert AL = driver.switchTo().alert();
		 System.out.println(AL.getText());
		 Assert.assertEquals(AL, "You clicked the first button!");
		 
	}
	
	@Test
	public void BrowserTabs() throws InterruptedException {
		Thread.sleep(5000);
		WebElement BrowserTabs = driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[4]/a"));
		BrowserTabs.click();
		Thread.sleep(5000);
		WebElement Btn = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/form/input"));
		Btn.click();

	}
	@AfterMethod
	public void Logout() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}
	
	@AfterClass
	public void CloseBrowser() throws InterruptedException {
		System.out.println("Logout Successfully");
		
	}
	
	
	

}
