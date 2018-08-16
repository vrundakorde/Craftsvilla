package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements AtoConst {

	public static WebDriver d;
	
	@BeforeMethod
	public void PreConditions() throws InterruptedException
	{
		System.setProperty(Chrome_Key, Chrome_Path);
		d=new ChromeDriver();
		d.get("https://www.craftsvilla.com/");
		Thread.sleep(1000);
		d.manage().window().maximize();
		
	}
	
	@AfterTest
	public void postConditions() throws InterruptedException
	{
		Thread.sleep(2000);
		d.close();
	}
}
