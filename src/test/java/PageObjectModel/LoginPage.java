package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	By User_name = By.xpath("//input[@placeholder='Username']");
	By User_Pass = By.xpath("//input[@placeholder='Password']");
	By Login = By.xpath("//button[normalize-space()='Login']");

	public void username(String usname) {
		driver.findElement(User_name).sendKeys(usname);

	}

	public void userpass(String pass) {
		driver.findElement(User_Pass).sendKeys(pass);
	}

	public void logibtn() {
		driver.findElement(Login).click();
	}

}
