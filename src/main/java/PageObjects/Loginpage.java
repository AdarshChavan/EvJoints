package PageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Library.UtilityClass;


public class Loginpage {

	public WebDriver driver;

	public Loginpage(WebDriver driver) {
		this.driver = driver;		
		PageFactory.initElements(driver, this);		
	}
	

	/*
	 * @FindBy(xpath="//input[@id='mui-1']") WebElement emailfield;
	 * 
	 * @FindBy(xpath="//input[@type='password']") WebElement password;
	 * 
	 * @FindBy(xpath="(//button[normalize-space()='Log In'])[1]") WebElement
	 * loginbutton;
	 */
	
	
	@FindBy(linkText="Login via OTP")
	WebElement loginViaOtpLink;
	
	@FindBy(xpath="//input[@id='outlined-basic']")
	WebElement enterEmailIdField;
	
	@FindBy(xpath="(//button[normalize-space()='GET OTP'])[1]")
	WebElement getOptButton;
	
	@FindBy(xpath="(//button[normalize-space()='OKAY'])[1]")
	WebElement okaybutton;
	
	@FindBy(xpath="//input[@id='outlined-basic']")
	WebElement otpfield;
	
	@FindBy(xpath="(//button[normalize-space()='SUBMIT'])[1]")
	WebElement SubmitButton;
	
	
	public void clickOnLoginViaOtp() {
		loginViaOtpLink.click();;
		
	}
	
	public void clickOnEnterEmailIdField() throws IOException {
		enterEmailIdField.sendKeys(UtilityClass.getDatafromPropertyFile("MailId"));
	
	}
	
	
	public void ClickOnGetOtpButton() {
		getOptButton.click();
	}
	
	public void ClickOnOkayButton() {
		okaybutton.click();		
	}
	
	public void ClickOnEnterOtpField() {
		otpfield.sendKeys("1234");
	}
	
	public void ClickOnSubmitButton() {
		SubmitButton.click();
	}
	
	
	
	/*
	 * public void clickOnEmailField() {
	 * emailfield.sendKeys("Adarsh.chavan@gmail.com"); }
	 * 
	 * public void clickOnPassword() { password.sendKeys("12341234");
	 * 
	 * }
	 * 
	 * public void clickonLoginButton() { loginbutton.click(); }
	 * 
	 */
		
}
		
		
	
	

