package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	@Parameters({ "URL" })
	@Test
	public void WebloginHomeLoan(String urlname) {

		System.out.println("webloginHome");
		System.out.println(urlname);
	}

	@Test(groups = { "Smoke" })
	public void MobileloginHomeLoan() {
		System.out.println("MobileloginHome");

	}

	@Test
	public void LoginAPIHomeLoan() {
		System.out.println("APIloginHome");

	}
}
