package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyAndPasteAction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		Actions act = new Actions(driver);
		
         act.moveToElement(driver.findElement(By.xpath("//*[@id='txtUsername']"))).click()
         .sendKeys("Admin").sendKeys(Keys.TAB).sendKeys("admin123").sendKeys(Keys.ENTER).build().perform();
         WebElement admin = driver.findElement(By.xpath("//*[text()='Admin']"));
		  act.click(admin).perform(); //till here we login and click on admin
		//---------------------------------------------from here we start copy and paste-------------------------------------------------------------------  
		  act.moveToElement(driver.findElement(By.xpath("(//*[@type='text'])[1]"))).click().sendKeys("CopyMeBro").build().perform();//take xpath of text field and send text in it
             act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();//here we perform clt+a and clt+c to select all and copy all
             act.moveToElement(driver.findElement(By.xpath("(//*[@type='text'])[2]"))).click()     //we take xpath where we want to paste the text
                 .keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).build().perform();   //here we perform  clt+v to paste the text
	}

}
