package selenium1;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCrome{
		
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Desktop\\chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();// To launch the browser
	
	driver.get("https://www.google.com");// To navigate to the particular url
	
	driver.manage().window().maximize();// to maximize the window

   driver.close();// to close the current window of the browser
   
} }