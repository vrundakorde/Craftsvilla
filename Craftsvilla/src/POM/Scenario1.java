package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class Scenario1 extends BasePage
{

	public Scenario1(WebDriver d)
	{
		super(d);
		PageFactory.initElements(d, this);
	}
	
	//Login as user
	
	@FindBy(xpath="//span[@class='hidden-xs user-name']")
	private WebElement login;
	
	public WebElement login()
	{
		return login;
	}
	
	@FindBy(xpath="//input[@id='emailId']")
	private WebElement username;

	public WebElement username()
	{
		return username;
	}
	
	@FindBy(xpath="//div[@id='continueBtn']")
	private WebElement contBtn;
	
	public WebElement contBtn()
	{
		return contBtn;
	}
	
	@FindBy(xpath="//input[@id='userPassword']")
	private WebElement password;
	
	public WebElement password()
	{
		return password;
	}
	
	@FindBy(xpath="//div[@id='loginCheck']")
	private WebElement loginBtn;
	
	public WebElement loginBtn()
	{
		return loginBtn;
	}
	
	
	//Select any prodct and add it into cart
	
//	@FindBy(xpath="//a[contains(.,'JEWELRY')]")
//	private WebElement jewelry;
//	
//	public WebElement jewelry()
//	{
//		return jewelry;
//	}
	
	@FindBy(xpath="//a[contains(text(),'Kundan Jewelry')]")
	private WebElement kundanjwl;
	
	public WebElement kundanjwl()
	{
		return kundanjwl;
	}
	
	@FindBy(xpath="//input[@id='searchval']")
	private WebElement search;
	
	public WebElement search()
	{
		return search;
	}
	
	@FindBy(xpath="//i[@class='icon cv-search']")
	private WebElement SearchBtn;
	
	public WebElement SearchBtn()
	{
		return SearchBtn;
	}
	
	@FindBy(xpath="//body[contains(@class,'searchresults-index-index')]/div[@class='container-fluid nopadding']/div[@class='container']/div[@id='main']/div[@class='col-xs-12 article']/div[@id='searchresults']/div[@class='col-xs-12 section nopadding']/div[@class='product-row']/div[3]/div[1]/div[1]/a[1]")
	private WebElement necklace;
	
	public WebElement necklace()
	{
		return necklace;
	}
	
	@FindBy(xpath="//button[@id='addtocart']")
	private WebElement cartBtn;
	
	public WebElement cartBtn()
	{
		return cartBtn;
	}
	
	@FindBy(xpath="//span[contains(.,'Home')]")
	private WebElement home;
	
	public WebElement home()
	{
		return home;
	}
	
	@FindBy(xpath="//span[@class='hidden-xs']")
	private WebElement cart;
	
	public WebElement cart()
	{
		return cart;
	}
	
}
