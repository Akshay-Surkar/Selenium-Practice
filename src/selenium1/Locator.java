package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//TYPES OF LOCATORS/Parameters AVAILABLE IN SELLENIUM
public class Locator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("txtUsername"));// using "BY.id" locator
		username.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.name("txtPassword")); // using "By.name" locator
		password.sendKeys("admin123");
		WebElement lgnbtn = driver.findElement(By.className("button"));// using "By.className" locator
		lgnbtn.click();
		driver.navigate().back();
		//WebElement username1 = driver.findElement(By.tagName("input")); using "By.tagName"locator. but we don't use this because its hard to find unique tag name
         WebElement link = driver.findElement(By.linkText("Forgot your password?"));//using "By.LinkText" locator
         link.click();
         driver.navigate().back();
         WebElement againclick = driver.findElement(By.partialLinkText("Forgot yo"));//using "By.partialLinkText" locator
         
          againclick.click();
          driver.navigate().back();
          driver.findElement(By.id("txtUsername")).clear();
         
	}

}
