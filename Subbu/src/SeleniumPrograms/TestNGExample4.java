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

public class TestNGExample4 {

	WebDriver driver;

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

	}

	@Test
	public void LoginFunctionality() throws InterruptedException {

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
		Username.sendKeys("subash@gmail.com");
		Thread.sleep(5000);
		WebElement Passward = driver.findElement(By.id("login_password"));
		Passward.sendKeys("Hello@123");

	}
	
	@Test
	public void Hidden_Elements() throws InterruptedException {

		Thread.sleep(5000);
		WebElement Hidden_Elements = driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[11]/a"));
		Hidden_Elements.click();
		Thread.sleep(5000);
		WebElement Toggle_Btn = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div/button"));
		Toggle_Btn.click();
		WebElement TextFound = driver.findElement(By.id("myDIV"));
		Thread.sleep(5000);
		String Exp_txt = TextFound.getText();
		Assert.assertEquals(Exp_txt, "You have displayed the hidden text!");

	}

	@AfterMethod
	public void CloseBrowser() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}

}
