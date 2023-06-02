package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class DataProviderEx {
	
	WebDriver driver;
	
	@DataProvider (name = "dataProvider")
	public Object [][] dpmethod(){
	return new Object[][]{{"Sravanthi","Sravanthi@123"},{"Saujanya","Saujanya@123"},{"Subash","Subash@123"},{"Charan","Charan@123"}};
	}
	
	@BeforeMethod
	public void Menu() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\subas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationtesting.co.uk/");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/a")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/a")).click();
		Thread.sleep(5000);
		WebElement Login_Portal = driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[15]/a"));
		Login_Portal.click();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		String LP = driver.getTitle();
		Assert.assertEquals(LP, "Login Portal");
		
	}
	
	@Test (dataProvider = "dataProvider")
	public void Sample (String UN, String Password) throws InterruptedException {
		Thread.sleep(5000);
		WebElement Username = driver.findElement(By.id("login_text"));
		Username.sendKeys(UN);
		Thread.sleep(5000);
		WebElement Passward = driver.findElement(By.id("login_password"));
		Passward.sendKeys(Password);
	}
	
	
	

}
