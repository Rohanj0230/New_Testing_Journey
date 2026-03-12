package propertyReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Demo {

	public WebDriver Driver;
	public Properties p1;

	@Test
	public void setUp() throws Exception 	{

		FileReader f1 = new FileReader(System.getProperty("user.dir") + "/src/test/resoures/config.properties");
		p1 = new Properties();
		p1.load(f1);

System.out.println(p1.getProperty("Browser"));
	}

}
