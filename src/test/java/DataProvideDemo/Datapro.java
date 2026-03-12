package DataProvideDemo;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Datapro {

	WebDriver driver;

	@BeforeClass
	public void setup() {

		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@Test(dataProvider = "dp")
	public void loginTest(String user, String pas) throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pas);
		Thread.sleep(3000);
		/*
		 * driver.findElement(By.xpath("//button[@type='submit']")).click(); boolean
		 * status = driver .findElement(By.
		 * xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']"
		 * )) .isDisplayed();
		 * 
		 * if (status == true) { Assert.assertTrue(true);
		 * 
		 * } else {
		 * 
		 * Assert.fail(); }
		 */
	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}

	@DataProvider(name = "dp")
	public String[][] chekwithData() {

		String s1[][] = { { "Admin", "Admin@123" }, { "Abc", "Abc@123" }, { "YXZ", "xyz@123" },
				{ "Admin", "admin@123" } };

		return s1;

	}

}
