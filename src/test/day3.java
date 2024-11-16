package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	@Parameters({ "URL", "APIKey/usrname" })
	@Test
	public void WebloginCarLoan(String urlname, String key) {

		System.out.println("weblogincar");
		System.out.println(urlname);
		System.out.println(key);
	}

	@BeforeMethod
	public void beforeevery() {
		System.out.println("i will executed Before every test in day3 class");
	}

	@AfterMethod
	public void afterevery() {
		System.out.println("i will executed After every test in day3 class");
	}

	@Test(groups = { "Smoke" })
	public void MobileloginCarLoan() {
		System.out.println("Mobilelogincar");
	}

	@BeforeSuite
	public void Bfsuite() {
		System.out.println("I am no 1");
	}

	@Test(enabled = false) // this skips the test from running
	// @Test(timeOut = 4000) // this waits the Test before fail
	public void MobileSigninCarLoan() {
		System.out.println("Mobile SIGNIN");

	}

	@Test(dataProvider = "getData")
	public void MobileSignoutCarLoan(String username, String password) {
		System.out.println("Mobile SIGNOUT");
		System.out.println(username);
		System.out.println(password);

	}

	@Test(dependsOnMethods = { "WebloginCarLoan", "MobileSignoutCarLoan" })
	public void APICarLoan() {
		System.out.println("APIlogincar");
	}

	@DataProvider
	public Object[][] getData() {
		// 1st set-> username password - good credit history= row
		// 2nd set-> username password - no crdit history
		// 3rd set-> username password - fraudelent credit history
		Object[][] data = new Object[3][2];
		// 1st set
		data[0][0] = "firstSet-username";
		data[0][1] = "firstpassword";
		// 2nd set
		data[1][0] = "SecondSet-username";
		data[1][1] = "Secondpassword";
		// 3rd set
		data[2][0] = "ThirdSet-username";
		data[2][1] = "Thirdpassword";

		return data;
	}
}
