package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		Actions act = new Actions(driver);//create action class object to call the action class method
		
		// WebElement username = driver.findElement(By.xpath("//*[@id='txtUsername']"));  //Here we create reference variable for username
		// username.sendKeys("Admin");                                                     //send username
		 
		 //act.sendKeys(username, Keys.TAB).sendKeys("admin123").sendKeys(Keys.ENTER).build().perform();//with action class method we give password
	//-----------------------------------------[OR] By using 'moveToElement' method we can do like this also in single line---------------------------------------------------------------------------------------------
		act.moveToElement(driver.findElement(By.xpath("//*[@id='txtUsername']"))).click().sendKeys("Admin").sendKeys(Keys.TAB)
		
		.sendKeys("admin123").sendKeys(Keys.ENTER).build().perform();//sendkeys method used to pass the keys and values
		
		
	/*	act.moveToElement(driver.findElement(By.xpath("//*[text()='Admin']"))).build().perform();//hover the cursor over admin
		act.moveToElement(driver.findElement(By.xpath("//*[text()='User Management']"))).build().perform();//then over the user management
		act.moveToElement(driver.findElement(By.xpath("//*[text()='Users']"))).click().build().perform();//then over user and click the user*/
		//-------------------------------------------------CLICK Methods----------------------------------------------------------------
		 WebElement admin = driver.findElement(By.xpath("//*[text()='Admin']"));
		  act.click(admin).perform();     //this is used to click' on specific web element which takes input as web element
		  act.contextClick(admin).perform();// this method is used to 'right click' on specific web element
		  act.doubleClick(admin).perform();//this is used to 'double click' on web element
           //for above 3 method there are same 3 methods and that methods does not take web element input.
		  act.click();
		  act.contextClick();
		  act.doubleClick(); //this 3 are used in continue statement works are same as above 3
	}

}
