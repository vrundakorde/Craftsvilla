package generic;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	//To captre Screenshot of fail test case
	@Override
	public void onTestFailure(ITestResult result) 
	{
		TakesScreenshot t = (TakesScreenshot) BaseTest.d;
		File src= t.getScreenshotAs(OutputType.FILE);
		
		try 
		{
			FileUtils.copyFile(src, new File("C:\\Users\\Ajit\\eclipse-workspace\\Craftsvilla\\Screenshot\\"+result.getName()+".png"));
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
