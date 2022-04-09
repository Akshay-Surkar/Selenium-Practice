 package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompareElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");

		driver.findElement(By.xpath("//input[@id= 'txtUsername']")).sendKeys("Admin");

		driver.findElement(By.xpath("//input[@type= 'submit']")).click();
		String message = driver.findElement(By.xpath("//span[@id= 'spanMessage']")).getText();

		String actual = "Password cannot be empty";
		boolean equal;
		if (equal = actual.equals(message)) {
			System.out.println("Actual is equal to expected");
		} else {
			System.out.println("Actual is not equal to expected");
		}

	}
}
