package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//DIFFERENT DIFFERNT TYPES OR WAYS TO TAKE XPATH/CUSTOMIZATION OF XPATH
public class Xpaths {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\Akshay\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
	   // driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");//1.using "By.xpath" locator
		driver.findElement(By.xpath(("//input[@type='text'])[2]"))).sendKeys("Admin");//2.if multiple node matching then use this
		driver.findElement(By.xpath("//input[@name='txtPassword' and @ id = 'txtPassword']")).sendKeys("admin123");//using logical "and" operator,both attribute should get match
		driver.findElement(By.xpath("//input[@name='Submit' or @ id = 'btnLogi']")).click();//using logical "or" operator,one attribute should be correct or match.
		driver.navigate().back();
		driver.findElement(By.xpath("//input[contains(@id,'btn')]")).click();//using contains,with limited text we can find x path
		driver.findElement(By.xpath("//div[text()='LOGIN Panel']"));//using text which is available between">abc<" this arrows,we can write x path
		//using contains + text()= "//div[contains(text(),'LOGIN ')]"//dynamic xpath
		//after this are copy paste from other classes for refernce
		//driver.findElements(By.xpath("//*[@id='day']//option"));//if we want to take multiple webelement for that xpath
		//driver.findElements(By.xpath("//*[contains(@id,'ohrmList_chkSelectRecord_')]"));//xpath to select multiple checkboxes
        //Absolute Xpath(/) & Relative Xpath (//)look for that
	}

}
