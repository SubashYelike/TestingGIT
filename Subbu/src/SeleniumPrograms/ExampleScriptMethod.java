package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExampleScriptMethod {
	
	WebDriver driver;
	
	public void SetupChrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\subas\\Downloads\\chromedriver_win32\\chromedriver.exe");
	}
	
	public void SetupDriverMaximise() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public void LaunchURL() {
		driver.get("https://www.facebook.com/");
	}
	
	public void VerifyPageTitle() {
		String pTitle = driver.getTitle();
		if(pTitle.equals("Facebook – log in or sign up")) {
			System.out.println("User is in correct Page");
		}else {
			System.out.println("Incorrect Page / Invalide Page");
		}
	}
	
	public void CreateAccount(String FN, String LN) throws InterruptedException {
		WebElement CreatAC_Link = driver.findElement(By.linkText("Create New Account"));
		CreatAC_Link.click();
		
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys(FN);
				
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys(LN);
				
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
	
	public static void main(String[] args) throws InterruptedException {
		
	ExampleScriptMethod obj = new ExampleScriptMethod();
	obj.SetupChrome();
	obj.SetupDriverMaximise();
	obj.LaunchURL();
	obj.VerifyPageTitle();
	obj.CreateAccount("Sravanthi", "Saujanya");

	}

}
