package selenium1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassDropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=http%3A%2F%2Fwww.google.com%2F&_rdr");

		WebElement day = driver.findElement(By.xpath("//*[@id='day']"));

		Select selday = new Select(day);//here we create object to access method inside the select class
		
		selday.selectByVisibleText("11");//1.by this method we can select from the visible text on web element
		
		WebElement month = driver.findElement(By.xpath("//*[@id='month']"));
		
		Select selmonth = new Select(month);
		
		selmonth.selectByValue("2");//2.by this method we can take value from code for that particular web element
		
		WebElement year = driver.findElement(By.xpath("//*[@id='year']"));
		Select selyear = new Select(year);
		
		selyear.selectByIndex(25);//3.by this method we can take index value for that particular web element
		
		   //To select a particular value without using select class
               List<WebElement> options = driver.findElements(By.xpath("//*[@id='day']//option"));//if we want to take multiple webelement for that xpath
		
		for(WebElement opt :options)
		{
			String textvalue = opt.getText();
			System.out.println(textvalue);
			
			if(textvalue.equals("6"))//here we are comparing the all values with we want that particular value
			{
				opt.click();
			}
		}
		
		
		
				

	}

}
