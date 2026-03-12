package Grouping;

import org.testng.annotations.Test;

public class signeuptest {
	@Test(priority = 0, groups = { "regression" })
	public void facebooksignup() {
		System.out.println("user signedup successfully in facebook");
	}

	@Test(priority = 1, groups = { "regression" })
	public void instasignup() {
		System.out.println("user has successfully signed up in to insta");
	}

}
