package selenium1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
		String parentid = driver.getWindowHandle();//to get the id of  parent window 
		System.out.println(parentid);
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		
		Set<String> winids = driver.getWindowHandles();//this will give the id's of all window
		System.out.println(winids);
		for(String winid:winids) {
			if(!(parentid.equals(winid))) {//this means except the parent one means child
				driver.switchTo().window(winid);//this method is used to switch on child window
				//driver.navigate().refresh();
			}
		//	driver.switchTo().defaultContent();//this is used to get back to the parent window ..this one doeson't work
			driver.switchTo().window(parentid);//to switch on parent window
			driver.navigate().to("https://www.google.com");

			}
			}

}
