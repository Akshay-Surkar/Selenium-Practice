package selenium1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
		String parentid = driver.getWindowHandle();//to get the id of  parent window 
		System.out.println(parentid);
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		Set<String> allwinids = driver.getWindowHandles();//this will give the id's of all windows
		int count = allwinids.size();//this will create a number how much window we open
		String[] windoid = new String[count];//that number will store in the array
		int i=0;                             //array index start form 0 thats why we take on variable which will used to store number to id's
		for(String id :allwinids) {//'allwinids' will go in 'id' as per iteration
			windoid[i]=id;         //whatever come inside 'id' will store in array
			i++;                   //it is for to cover all windows one by one
		}
         driver.switchTo().window(windoid[1]);//we will switch to the window we want, by giving value in the array
         driver.findElement(By.xpath("//*[@class='demo-btn home-btn trial-btn pulse']")).click();//we can perform the operation on selected window
	}

}
