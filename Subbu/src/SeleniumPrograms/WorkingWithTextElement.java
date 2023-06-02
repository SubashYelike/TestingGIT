package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithTextElement {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\subas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.amazon.in/");
		 
		 driver.manage().window().maximize();
		 
		 WebElement Bestseller_text = driver.findElement(By.xpath("//*[@id='nav-xshop']//a[1]"));
		 System.out.println(Bestseller_text.getText());
		 
		 WebElement AmazonPay_text = driver.findElement(By.xpath("//*[@id='nav-xshop']//a[10]"));
		 System.out.println(AmazonPay_text.getText());

	}

}
