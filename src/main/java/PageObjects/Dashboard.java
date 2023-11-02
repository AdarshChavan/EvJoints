package PageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Dashboard {
	
	
	public WebDriver driver;

	public Dashboard(WebDriver driver) {
		this.driver = driver;		
		PageFactory.initElements(driver, this);		
	}

	@FindBy(xpath="//div[normalize-space()='All']")
	WebElement vendorDropdown;
	
	@FindBy(xpath="//li[normalize-space()='shashikant mahor']")
	WebElement SelectvlaueFromVendorDrop;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]")
	WebElement locationDropdown;
	
	@FindBy(xpath="(//li[normalize-space()='All'])[1]")
	WebElement SelectValueFromLocationDrop;
	
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]")
	WebElement manufacturerDropDown;
	
	@FindBy(xpath="(//li[normalize-space()='AUDI'])[1]")
	WebElement SelectvalueFrommanufacturaDrop;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]")
	WebElement modelDropdown;
	
	@FindBy(xpath="(//li[@role='option'])[2]")
	WebElement SelectvaluesFromModelDrop;
	
	@FindBy(xpath="(//div[normalize-space()='Current Month'])[1]")
	WebElement selectdateDropDown;
	
	
	
	 public void SelectVendorDropdown() throws InterruptedException 
	    {
		  vendorDropdown.click();
		  Thread.sleep(1000);
		  SelectvlaueFromVendorDrop.click();
		  System.out.println(SelectvlaueFromVendorDrop.getText());
	        
	    }
	 
	 
	 public void SelectLocationDropdown() throws InterruptedException {
		 locationDropdown.click();
		 Thread.sleep(2000);
		 SelectValueFromLocationDrop.click(); 
		
	 }
	 
	 public void SelectManufacturerDropDown() throws InterruptedException {
		 manufacturerDropDown.click();
		 Thread.sleep(2000);
		 SelectvalueFrommanufacturaDrop.click();
		 
		
	 }
	 
	 public void SelectModel() throws InterruptedException {
		 
		modelDropdown.click();
		Thread.sleep(2000);
		SelectvaluesFromModelDrop.click();
		
	 }
	 
	 public void SelectDate() {
	     Select date = new Select(selectdateDropDown);
	     date.selectByIndex(4);
	 }
		 
	 }
	 

