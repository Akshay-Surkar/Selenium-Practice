package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//DIFFERNT DIFFERNT METHODS AVAILABLE IN SELLENIUM
public class methods {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Desktop\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");//to navigate the particular url
		
		driver.navigate().to("https://facebook.com");
		driver.manage().window().maximize();// to maximize the particular window
		
		driver.navigate().back();// to navigate back
		driver.navigate().forward();//to navigate forward
		
		driver.navigate().refresh();// to refresh page
		Thread.sleep(2000);
		driver.close();// to close the current window in the browser
		driver.quit();//to close the browser completely
		//username.sendKeys("text we want to write on webelement");
		//.click(); it is used to click on a button
		//.clear(); it is used to clear text on the web element
		//.getText(); it is used to get text of a webelement it return string
                //.getTitle();it is used to get the title of webpage
               //. getURL() ; it is used to get the URL
	}
	
	
	
	
	
	
}
