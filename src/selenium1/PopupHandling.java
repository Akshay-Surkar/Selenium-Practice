package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupHandling {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Desktop\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://testautomationpractice.blogspot.com/");
			driver.findElement(By.xpath("//*[text()='Click Me']")).click();
			//--------------------------Popup related method-------------------------------------------------------------------------
			String meaasage = driver.switchTo().alert().getText();//this is used to get the message on the popup
			System.out.println(meaasage);  //printing the message on the popup
			driver.switchTo().alert().accept();//here we are accepting the popup or we are click on the left side button on the popup
			//driver.switchTo().alert().dismiss();//here we are rejecting the popup or we are click on the right side button on the popup
		
	}

}
