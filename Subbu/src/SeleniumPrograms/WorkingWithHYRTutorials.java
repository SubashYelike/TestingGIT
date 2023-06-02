package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithHYRTutorials {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\subas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		 
		 driver.manage().window().maximize();
		 
		 //driver.switchTo().frame(0);
		 
		 WebElement FirstName_Textbox = driver.findElement(By.id("firstName"));
		 FirstName_Textbox.sendKeys("Subash");
		 
		 WebElement Surname_Textbox = driver.findElement(By.id("lastName"));
		 Surname_Textbox.sendKeys("Yelike");
		 
		 WebElement Gender_radiobutton1 = driver.findElement(By.id("malerb"));
		 if(Gender_radiobutton1.isEnabled()) {
			 System.out.println("Male Radio Button is Enabled");
		 }else {
			 System.out.println("Male Radio Button is Not Enabled");
		 }
		 
		 WebElement Gender_radiobutton2 = driver.findElement(By.id("femalerb"));
		 if(Gender_radiobutton2.isEnabled()) {
			 System.out.println("Female Radio Button is Enabled");
		 }else {
			 System.out.println("Female Radio Button is Not Enabled");
		 }
	/*	 Gender_radiobutton2.click();
		 
		 WebElement English_Checktbox = driver.findElement(By.id("englishchbx"));
		 English_Checktbox.click();
		 
		 WebElement Email_Textbox = driver.findElement(By.id("email"));
		 Email_Textbox.sendKeys("Subash@gmail.com");
		 
		 WebElement Password_Textbox = driver.findElement(By.id("password"));
		 Password_Textbox.sendKeys("12345678");*/

	}

}
