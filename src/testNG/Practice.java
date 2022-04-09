package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practice {
	@Test(priority=1,invocationCount=5)
	public void Login1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
	
		WebElement username = driver.findElement(By.id("txtUsername"));//by.id
		username.sendKeys("Admin");
		//WebElement username = driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	
		WebElement password = driver.findElement(By.name("txtPassword"));//by.name

		password.sendKeys("admin123");
		
		WebElement loginkey = driver.findElement(By.className("button"));//by className
	
		loginkey.click();
		
		driver.close();
	}
}
