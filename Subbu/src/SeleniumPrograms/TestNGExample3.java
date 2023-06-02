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

public class TestNGExample3 {

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
	public void Menu() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/a")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/a")).click();
		
	}
	
	@Test
	@Parameters ({"UN","PWD"})
	public void LoginFunctionality(String UN, String PWD) throws InterruptedException {
        
		Thread.sleep(5000);
		WebElement Login_Portal = driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[15]/a"));
		Login_Portal.click();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		String LP = driver.getTitle();
		Assert.assertEquals(LP, "Login Portal");
		Thread.sleep(5000);
		WebElement Username = driver.findElement(By.id("login_text"));
		Username.sendKeys(UN);
		Thread.sleep(5000);
		WebElement Passward = driver.findElement(By.id("login_password"));
		Passward.sendKeys(PWD);
		
				 
	}
	
	
	
	@AfterMethod
	public void CloseBrowser() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}
	
	@AfterClass
	public void Logout() throws InterruptedException {
		System.out.println("Logout Successfully");
		
	}
	
	
	

}
