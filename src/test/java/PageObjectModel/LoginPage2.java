package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {

	WebDriver driver;

	LoginPage2(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement user;
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement passw;

	public void userna(String use) {
		user.sendKeys(use);
	}

	public void pas(String ps) {
		passw.sendKeys(ps);
	}

}