package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Coupons {

	
	public WebDriver driver;

	public Coupons(WebDriver driver) {
		this.driver = driver;		
		PageFactory.initElements(driver, this);		
	}
	
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[3]")
	WebElement SettingTab;
	
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[6]/div[1]/div[1]/span[1]/div[1]/p[1]")
	WebElement CoupanTab;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]")
	WebElement Coupanbutton;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]")
	WebElement SelectCity;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[3]/ul[1]/li[1]")
	WebElement Selectoption;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]")
	WebElement Selectchargingnetwork;

	@FindBy(xpath="/html[1]/body[1]/div[2]/div[3]/ul[1]/li[2]")
	WebElement SelectchargingnetworkOption;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]")
	WebElement CouponType;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[3]/ul[1]/li[2]")
	WebElement SelectCouponTypeOption;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/input[1]")
	WebElement Entercouponcode;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/input[1]")
	WebElement EnterDiscountamount;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[1]/input[1]")
	WebElement Title;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/input[1]")
	WebElement SubTitle;	
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[2]/div[2]/div[1]/div[1]/input[1]")
	WebElement Description;  

	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[1]/div[2]/div[1]/div[1]/input[1]")
	WebElement Startdate;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[2]/div[2]/div[1]/div[1]/input[1]")
	WebElement Enddate;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]/button[1]")
	WebElement SaveButton;
	
	
	
	
	public void ClickOnSettingTab()
	{
		SettingTab.click();
	}
	
	public void ClickOnCouponsTab()
	{
		CoupanTab.click();
	}
	
	public void ClickOnCuponButton()
	{
		Coupanbutton.click();
	}
	
	public void ClickOnSelectCityField()
	{
		SelectCity.click();
	}
	
	public void ClickOnCityOptions()
	{
		Selectoption.click();
	}
	
	public void clickOnSelectchargingnetwork()
	{
		Selectchargingnetwork.click();
	}
	
	public void clickOnchargingnetworkOption()
	{
		SelectchargingnetworkOption.click();
	}
	
	public void clickOnCouponType()
	{
		CouponType.click();
	}
	
	public void ClickOnCouponTypeOption()
	{
		SelectCouponTypeOption.click();
	}
	
	public void clickOnEntercouponcode()
	{
		Entercouponcode.sendKeys("123ABC");
	}
	
	public void ClickOnEnterDiscountamount()
	{
		EnterDiscountamount.sendKeys("123");
	}
	
	public void clickOnTitle()
	{
		Title.sendKeys("PQW");
	}
	
	public void ClickOnSubTitle()
	{
		SubTitle.sendKeys("wwrt");
	}
	
	public void clickOnDescription()
	{
		Description.sendKeys("vkjdvj");
	}
	
	public void EnterStartdate() throws InterruptedException
	{
		Startdate.click();
		Thread.sleep(2000);
		Startdate.clear();
		Thread.sleep(2000);
		Startdate.sendKeys("26/10/2023");
	}
	
	public void EnterEnddate() throws InterruptedException
	{
		Enddate.clear();
		Thread.sleep(2000);
		Enddate.sendKeys("26/12/2023");
	}
	
	public void ClickOnSaveButton() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(2000);
		SaveButton.click();
	}
	
	
	
	
	
	
	
	
	
	
}
