package Day2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckTestAnnotations {

	@BeforeMethod
	public void checkApplogin() {
		System.out.println("applogedin successfully");

	}

	@Test
	public void SearchApp() {

		System.out.println("user is able to search ");
	}

	@Test
	public void fullSearch() {
		System.out.println("full search is done");

	}

	@AfterMethod
	public void appLogout() {

		System.out.println("User successfully logedout");
	}

}
