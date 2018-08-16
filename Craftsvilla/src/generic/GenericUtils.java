package generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GenericUtils
{

	public static void SelectByText(WebElement e, String txt)
	{
		Select s =  new Select(e);
		s.selectByVisibleText(txt);
	}
	
	public static void SelectByIndex(WebElement e, int index)
	{
		Select s = new Select(e);
		s.selectByIndex(index);
	}
	public static void MouseAction(WebElement e)
	{
		Actions a = new Actions(BaseTest.d);
		a.moveToElement(e).perform();
	}
	
	public static void Scroll(int x, int y)
	{
		JavascriptExecutor j = (JavascriptExecutor)BaseTest.d;
		j.executeScript("window.scroll("+x+","+y+")", "");
	}
}
