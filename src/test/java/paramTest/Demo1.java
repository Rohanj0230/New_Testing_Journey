package paramTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Demo1 {
	WebDriver driver;

	@BeforeClass
	@Parameters({ "browser" })
	public void setup(String br) {

		switch (br) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "firFox":
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("there is no valid browser");
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

	}

	@Test(priority = 1)
	public void logoTest() throws InterruptedException {
		Thread.sleep(3000);
		boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();

		Assert.assertEquals(true, status);
	}

	/*
	 * @Test(priority = 2) public void gettitle() { String title =
	 * driver.getTitle();
	 * 
	 * Assert.assertEquals("OrangeHRM", title); }
	 */

	@AfterClass
	public void teardown() {
		driver.quit();

	}

}
