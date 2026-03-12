package AssertionDemo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class softDemo {

	@Test
	public void checkSoftDemo() {

		System.out.println("Testing");
		System.out.println("Testing");
		SoftAssert as = new SoftAssert();
		as.assertEquals(1, 2);

		System.out.println("Testing");

		System.out.println("Testing");
		System.out.println("Testing");
		as.assertAll();

	}

}
