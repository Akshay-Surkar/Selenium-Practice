package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
        WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		WebElement password = driver.findElement(By.name("txtPassword"));
        password.sendKeys("admin123");
		WebElement loginkey = driver.findElement(By.className("button"));
		loginkey.click();
		
		driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']")).click();//till this we login and click on admin
		
		JavascriptExecutor js = (JavascriptExecutor)driver;//we type cast webdriver to javascriptExecuter because java can't perform scrolling
		js.executeScript("window.scrollBy(0,1000)");//1)we have to learn this method,this is used to scroll by pixel value
	    js.executeScript("window.scrollBy(0,-500)");//this will scroll up
		             
//---------------------SCROLL TO VIEW PRTICULAR WEB ELEMENT----------------------------------------
	    WebElement checkbox = driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectRecord_43']"));//we are giving location of check box we want to perform operation
		js.executeScript("arguments[0].scrollIntoView();",checkbox); //2)this method will scroll to the web element we want 
		           // checkbox.click();
		js.executeScript("arguments[0].click()",checkbox); //3)click using javascriptExecuter or Alternate way to use click method

	}}
