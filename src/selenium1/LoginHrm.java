package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginHrm {

 	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		WebElement username = driver.findElement(By.id("txtUsername"));//by.id
		username.sendKeys("Admin");
		//WebElement username = driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.name("txtPassword"));//by.name

		password.sendKeys("admin123");
		Thread.sleep(2000);
		WebElement loginkey = driver.findElement(By.className("button"));//by className
		Thread.sleep(2000);
		loginkey.click();
		Thread.sleep(2000);
		driver.close();

	}

}
