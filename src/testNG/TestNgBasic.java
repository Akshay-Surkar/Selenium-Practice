package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgBasic {
	
	
	@Test(priority=2)//@ is a annotation,Test is used to represent particular test case
	public void TestCase1(){
		//System.out.println("Test case 1 running");
		Reporter.log("test case 1 running", true);//this is used to print the output on report as well as console,true will print on console
		
	}
	@Test(priority=1,invocationCount=3)//invocationCount is used to run test case repeatedly;and priority is used to give priority to the test case should execute first
	public void TestCase2() {
		//System.out.println("Test case 2 running");
		Reporter.log("test case 2 is running", false);//false will print on only report not on the console
	}

}
