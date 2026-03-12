package Grouping;

import org.testng.annotations.Test;

public class TestGroupDemo1 {
@Test(priority=0,groups= {"regression"})
	public void payment() {
		System.out.println("payement done in rupees");
	}
@Test(priority=1,groups= {"regression"})
public void dollerpayment() {
	System.out.println("Payment done in dollerF");
}

}
