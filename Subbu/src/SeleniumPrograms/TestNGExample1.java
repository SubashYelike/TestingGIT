package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

public class TestNGExample1 {

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
		driver.get("https://www.facebook.com");
		
	}
	
	@BeforeMethod
	public void Login() throws InterruptedException {
		Thread.sleep(5000);
		WebElement CreatAC_Link = driver.findElement(By.linkText("Create new account"));
		CreatAC_Link.click();
	}
	
	@Test
	public void CreateAccount() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.name("firstname")).sendKeys("Saujanya");
		
		
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("Sravanthi");
		
		
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email__")).sendKeys("9090909090");
					
		Thread.sleep(2000);
		driver.findElement(By.name("reg_passwd__")).sendKeys("Test@12345");
		
		Thread.sleep(2000);
		Select Day_listbox = new Select(driver.findElement(By.id("day")));
		
		Day_listbox.selectByValue("8");
		
		Thread.sleep(2000);
		Select Month_listbox = new Select(driver.findElement(By.id("month")));
		Month_listbox.selectByIndex(10);
		
				
		Thread.sleep(2000);
		driver.findElement(By.name("sex")).click();
		
		
		Thread.sleep(2000);
		driver.findElement(By.name("websubmit")).click();

	}
	
	@AfterMethod
	public void Logout() {
		System.out.println("Logout Successfully");
	}
	
	@AfterClass
	public void CloseBrowser() {
		driver.close();
	}
	
	@AfterTest
	public void GenerateReport () {
		System.out.println("Report is Generated");
	}
	

}
