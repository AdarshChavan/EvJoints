package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amenities {

	public WebDriver driver;

	public Amenities(WebDriver driver) {
		this.driver = driver;		
		PageFactory.initElements(driver, this);		
	}
	
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[3]")
	WebElement SettingTab;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[5]/div[1]/div[1]/span[1]/div[1]/p[1]")
	WebElement AmenitiesTab;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]")
	WebElement EnterAmenityField;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]")
	WebElement AddButton;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[3]/div[1]/div[1]/button[1]")
	WebElement OkButton;
	
	
	
	public void ClickOnSettingTab()
	{
		SettingTab.click();
	}
	
	public void clickOnAmenitiesTab()
	{
		AmenitiesTab.click();	
	}
	
	public void ClickOnEnterAmenityField()
	{
		EnterAmenityField.sendKeys("Test");
	}
	
	public void ClickOnAddButton()
	{
		AddButton.click();
	}
	
	public void ClickOnOkButton()
	{
		OkButton.click();
	}
	
	
}
