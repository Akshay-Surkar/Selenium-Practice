package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priority2 {
	@Test(priority=1)
	public void m2() {
		Reporter.log("priority1",true);
	}

}
