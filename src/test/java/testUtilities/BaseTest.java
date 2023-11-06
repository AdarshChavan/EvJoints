package testUtilities;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import Library.BaseClass;
import PageObjects.Amenities;
import PageObjects.Coupons;
import PageObjects.Dashboard;
import PageObjects.Loginpage;
import PageObjects.Manufacturers;
import PageObjects.Vendor;

public class BaseTest extends BaseClass {
	
	@BeforeSuite
	public void InitializeBrowser() throws InterruptedException, IOException {
		
		browser();
	}
	
public Loginpage loginpage;
public Dashboard dashboard;
public Vendor vendor;
public Manufacturers manufacturers;
public Amenities amenitie;
public Coupons coupons;


	@BeforeClass()
	public void LoginPageObj() {
		
		loginpage= new Loginpage(driver);
		dashboard= new Dashboard(driver);
		//vendor = new Vendor(driver);
		manufacturers = new Manufacturers(driver);
		amenitie = new Amenities(driver); 
		coupons = new Coupons(driver);
	}

	
	
}
