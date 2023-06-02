package SeleniumPrograms;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\subas\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/browser-windows");
		
		driver.manage().window().maximize();

		driver.findElement(By.id("windowButton")).click();

		String MainWindow = driver.getWindowHandle();

		Set<String> MultipleWindows = driver.getWindowHandles();

		MultipleWindows.size();

		Iterator<String> iterator = MultipleWindows.iterator();

		while (iterator.hasNext()) {

			String ChildWindow = iterator.next();

			if (!MainWindow.equalsIgnoreCase(ChildWindow)) {

				driver.switchTo().window(ChildWindow);

				WebElement textchild = driver.findElement(By.id("sampleHeading"));

				System.out.println(textchild.getText());
			}

		}
		
		driver.switchTo().window(MainWindow);
		
		driver.findElement(By.id("tabButton")).click();
		
	}

}
