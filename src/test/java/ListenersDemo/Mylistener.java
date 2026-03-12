package ListenersDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Mylistener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("This is on Test Start............");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
System.out.println("This is On TestSuccess............");
	}

	@Override
	public void onTestFailure(ITestResult result) {

System.out.println("This is OnTestFailuer...........");
	}

	@Override
	public void onTestSkipped(ITestResult result) {

System.out.println("This is OnTest Skipped..............");
	}

	

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("On TestFailed with TimeOut............");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("On Start...................");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("On Finish...............");
	}
	
	
	
	

}
