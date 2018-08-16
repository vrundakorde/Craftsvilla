package script;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM.Scenario1;
import generic.BaseTest;

@Listeners(generic.Listeners.class)
public class TestScript extends BaseTest 
{
	@Test
	public void validLogin() throws InterruptedException
	{
		Scenario1 s= new Scenario1(d);
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
		
		s.login().click();
		Thread.sleep(1000);
		s.username().sendKeys("vrunda.korde@gmail.com");
		s.contBtn().click();
		s.password().sendKeys("vrunda14791");
		s.loginBtn().click();
		
		//s.jewelry().click();
		//GenericUtils.MouseAction(s.jewelry());
		
		//s.kundanjwl().click();
		Thread.sleep(1000);
		s.search().sendKeys("Kundan Jwelry");
		s.SearchBtn().click();
		
		s.necklace().click();
		Thread.sleep(1000);
		s.cartBtn().click();
		Thread.sleep(1000);
		s.home().click();
		d.navigate().refresh();
		Thread.sleep(1000);
		s.cart().click();
		Thread.sleep(1000);
	}
	
}
