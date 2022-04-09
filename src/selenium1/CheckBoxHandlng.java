package selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxHandlng {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Akshay\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
        WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		WebElement password = driver.findElement(By.name("txtPassword"));
        password.sendKeys("admin123");
		WebElement loginkey = driver.findElement(By.className("button"));
		loginkey.click();
		
		//-----------------------------------------------------------------------------------------------------
		//Single checkbox click
		driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']")).click();
		// driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectRecord_37']")).click();//for single element click
		
		//For multiple checkboxes click
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//*[contains(@id,'ohrmList_chkSelectRecord_')]"));//xpath to select multiple checkboxes
		int checksize= checkboxes.size();//To find the size of check boxes
		System.out.println(checksize);
		
	//	for(int i=0;i<=1;i++) {              //for un chek all checkboxes
	//	for(WebElement check:checkboxes) {   //for check all checkboxes
	//		check.click();
	//	}}
		
		//-----------------------------------------------------------------------------------------------------
		
		//Click on boxes leaving one after one
	/*	int i =0;
		for(WebElement check:checkboxes) { 
			
			if(i%2==0) {
				check.click();
			}
			i++;
		}*/
		
		//------------------------------------------------------------------------------------------------
		
	// To check whether check box selected or not
		
		WebElement checkbox = driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectRecord_37']"));
		
		boolean isClicked = checkbox.isSelected();
		
		System.out.println(isClicked);
		 checkbox.click();
		 boolean isClicked2 = checkbox.isSelected();
		 System.out.println(isClicked2);
		
		
		
		
		
	}

}
