package ListenersDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class IntroduceWebPage {

	WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@Test(priority = 1)
	public void Homepage() throws InterruptedException {
		Thread.sleep(5000);
		String title = driver.getTitle();
		Assert.assertEquals("OrangeHRM", title);
	}

	@Test(priority = 2)
	public void logoTest() {

		boolean lo = driver.findElement(By.xpath("//img[@alt='orangehrm-logo']")).isDisplayed();
		Assert.assertTrue(lo);

	}

	@AfterClass
	public void Teardown() {
		driver.quit();
	}

}
