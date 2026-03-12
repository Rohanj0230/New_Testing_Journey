package Dependancy;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Demo {

	@Test(priority = 0)
	public void openapp() {
		Assert.assertTrue(false);
	}

	@Test(priority = 1, dependsOnMethods = { "openapp" })
	public void login() {
		Assert.assertTrue(true);
	}

	@Test(priority = 2,dependsOnMethods= {"login"})
	public void search() {
		Assert.assertTrue(true);
	}

	@Test(priority = 3,dependsOnMethods= {"login"})
	public void advanceSearch() {
		Assert.assertTrue(true);
	}

	@Test(priority = 4,dependsOnMethods= {"login"})
	public void logout() {
		Assert.assertTrue(true);
	}
}
