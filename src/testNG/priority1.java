package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priority1 {
	@Test(priority=2)
	public void m1() {
		Reporter.log("priority2", true);
	}

}
