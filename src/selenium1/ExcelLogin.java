package selenium1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.ExcelReader;

public class ExcelLogin {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
        WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys(ExcelReader.readData(0,0));                    //here we just call the method which is defined in utility package
		WebElement password = driver.findElement(By.name("txtPassword"));
        password.sendKeys(ExcelReader.readData(0,1));
		WebElement loginkey = driver.findElement(By.className("button"));
		loginkey.click();

	}

}
