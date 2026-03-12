package AssertionDemo;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Demo1 {

	@Test
	public void checkValidation() {

		String name = "Rohan";
		String nam = "ROhit";

		if (name.equalsIgnoreCase(nam)) {

			System.out.println("This is valid user");
			Assert.assertTrue(false);
			
		} else {

			System.out.println("This is invali user");
			Assert.assertFalse(true);
			
		}

		

	}

}
