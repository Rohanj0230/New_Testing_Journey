package Grouping;

import org.testng.annotations.Test;

public class Logintest {
	@Test(priority = 0, groups = { "sanity" })
	public void loginInsta() {
		System.out.println("you loged in successfully in your insta account");
	}

	@Test(priority = 1, groups = { "sanity" })
	public void Facebook() {
		System.out.println("you loged in successfully in your facebook account");
	}

}
