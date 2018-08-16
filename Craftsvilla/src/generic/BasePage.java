package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BasePage 
{
	public static WebDriver d;

	public BasePage(WebDriver d)
	{
		d=BasePage.d;
	}

	public static void VerifyPage(String title)
	{
		WebDriverWait wt = new WebDriverWait(d,10);
		try 
		{
			wt.until(ExpectedConditions.titleContains(title));
			Reporter.log("Valid Page : pass");
		} 
		catch (Exception e) {
			Reporter.log("Invalid page : fail");
		}
	}

	public static void VerifyElement(WebElement e)
	{
		WebDriverWait wt = new WebDriverWait(d,10);
		try {
			wt.until(ExpectedConditions.visibilityOf(e));
			Reporter.log("Valid Element : pass");
		}
		catch (Exception e2) {		
			Reporter.log("Invalid Element : Fail");
			
		}
	}

}
