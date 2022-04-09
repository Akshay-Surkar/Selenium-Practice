package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderAction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider/");
	//--------------------------1st we Handle the IFRAME------------------------------------------------------------------------	
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));//take the xpath of iframe
		driver.switchTo().frame(frame);
		
		 WebElement button = driver.findElement(By.xpath("//*[@id='slider']//span"));//here we take the xpath of that slide button
		 
		 Actions act = new Actions (driver);
		 act.clickAndHold(button).moveByOffset(150,0).build().perform();//with the help of "cliclAndHold" method and "moveByOffset method we slide the button
          //clickAndHold method is used to hold the button and moveByOffset to move as per values
		 act.release(button).build().perform(); //this method will release the button
	}

}
