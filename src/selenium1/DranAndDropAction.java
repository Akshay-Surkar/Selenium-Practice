package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DranAndDropAction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
	//--------------------------1st we Handle the IFRAME------------------------------------------------------------------------	
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));//take the xpath of iframe
		driver.switchTo().frame(iframe);                                                  //we switch to the iframe
	//--------------------------2nd we take the xpath of dragable and dropable---------------------------------------------------------	
		WebElement drag = driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath("//*[@id='droppable']"));
	//---------------------------3rd call the dranAndDrop method of actions class-----------------------------------------	
		Actions act = new Actions(driver);//create  object of action class to take the action methods
		Thread.sleep(2000);
		act.dragAndDrop(drag, drop).perform();//this method is used to drag and drop web element
		driver.switchTo().parentFrame();//this will take us out of iframe

	}

}
