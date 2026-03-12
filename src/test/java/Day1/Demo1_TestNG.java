package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo1_TestNG {

	WebDriver driver;

	@Test(priority = 0)
	public void applicationLogoTest() {
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		boolean status = driver.findElement(By.xpath("//h2[text()='Login Page']")).isDisplayed();
		System.out.println(status);
	}

	@Test(priority = 1)
	public void loginApp() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("tomsmith");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("SuperSecretPassword!");

	}

	@Test(priority = 2)
	public void logoutApp() {
		System.out.println("logedout");
	}

}
