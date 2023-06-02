package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathExample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\subas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		 
		 driver.manage().window().maximize();
		 
		 Thread.sleep(3000);
		 WebElement CreateNew_Button = driver.findElement(By.xpath("//*[@id=\"createAccountSubmit\"]"));
		 CreateNew_Button.click();
		 
		 Thread.sleep(3000);
		 WebElement FirstName_Textbox = driver.findElement(By.xpath("//*[@id=\"ap_customer_name\"]"));
		 FirstName_Textbox.sendKeys("Subash");
//		 
//		 Thread.sleep(2000);
//		 WebElement Surname_Textbox = driver.findElement(By.xpath("//*[@id=\"u_p_d_EH\"]"));
//		 Surname_Textbox.sendKeys("Yelike");
		 
		 Thread.sleep(2000);
		 WebElement Mobno_Textbox = driver.findElement(By.xpath("//*[@id=\"ap_phone_number\"]"));
		 Mobno_Textbox.sendKeys("9000000009");
		 
		 WebElement Pass_Textbox = driver.findElement(By.xpath("//*[@id=\"ap_password\"]"));
		 Pass_Textbox.sendKeys("Test@1234");
		 		
		 Thread.sleep(2000);
		 WebElement Continue_Button = driver.findElement(By.xpath("//*[@id=\"continue\"]"));
		 Continue_Button.click();


	}

}
