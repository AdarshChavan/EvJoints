package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Manufacturers {

	
	
	public WebDriver driver;

	public Manufacturers(WebDriver driver) {
		this.driver = driver;		
		PageFactory.initElements(driver, this);		
	}
	
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[3]")
	WebElement SettingTab;
	
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[4]/div[1]")
	WebElement manufacturerTab;
	
	@FindBy(xpath="//span[contains(text(),'+ Vehicle Manufacturer')]")
	WebElement VehicleManufacturer;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]")
	WebElement Entermanufacturername;
	
	@FindBy(xpath="//input[@id='file']")
	WebElement AddmanufacturerImage;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/button[1]")
	WebElement  clickAddButton;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[3]/div[1]/div[1]/button[1]")
	WebElement OkButton;
	
	public void clickOnSettingtab()
	{
		SettingTab.click();	
	}
	
	public void clickOnManufacturerTab()
	{
		manufacturerTab.click();
	}
	
	public void clickOnVehicleManufacturerbutton()
	{
		VehicleManufacturer.click();
	}
	
	public void ClickOnEntermanufacturernamefield()
	{
		Entermanufacturername.sendKeys("Adarsh");
	}
	
	public void clickOnAddmanufacturerImageField()
	{
		AddmanufacturerImage.sendKeys("C:\\Users\\ts\\Pictures\\Capture5.png");
	}
	
	public void ClickonAddButton()
	{
		clickAddButton.click();
	}
	
	public void ClickOnOkButton()
	{
		OkButton.click();
	}
	
	
}

