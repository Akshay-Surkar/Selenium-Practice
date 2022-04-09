package utility;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScrnShot {
	//----------------------------This is ScreenShot method we will call whenever we need to take screen shot-----------------------------------------
	public static void capturescrn(WebDriver driver,String filename) throws IOException {
		
	TakesScreenshot scrshot = (TakesScreenshot)driver;//selenium cant take scrnshot so we typecast to this interface
    File source = scrshot.getScreenshotAs(OutputType.FILE);//this method will take scrnshot and genarate output as File and save in source
	File destination = new File("C:\\Users\\Akshay\\eclipse-workspace\\Selenium\\Screenshots\\"+filename+".png");//this object will save our scrn shot in our project folder
	FileHandler.copy(source, destination);//the screnshot which is save in source will copy to the project folder which we create
		
	}

}
