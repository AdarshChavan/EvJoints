package TestClasses;

import org.testng.annotations.Test;

import PageObjects.Vendor;
import testUtilities.BaseTest;

public class TestClassLoginPage extends BaseTest{

	
	@Test(priority = 1)
	public void LoginPageMethod() throws InterruptedException {
	
		loginpage.clickOnLoginViaOtp();
		loginpage.clickOnEnterEmailIdField();
		loginpage.ClickOnGetOtpButton();
		Thread.sleep(2000);
		loginpage.ClickOnOkayButton();
		loginpage.ClickOnEnterOtpField();
		loginpage.ClickOnSubmitButton();
		Thread.sleep(2000);
		
		
	}
	
	
	/*
	 * @Test(priority = 2) public void DashboardMethod() throws InterruptedException
	 * {
	 * 
	 * 
	 * dashboard.SelectVendorDropdown(); Thread.sleep(2000);
	 * dashboard.SelectLocationDropdown(); Thread.sleep(2000);
	 * dashboard.SelectManufacturerDropDown(); Thread.sleep(2000);
	 * dashboard.SelectModel(); Thread.sleep(2000); //dashboard.SelectDate();
	 * //Thread.sleep(2000); }
	 */
	
	/*@Test(priority = 2)
	public void vendor() throws InterruptedException {
		//vendor.clickOnVendorDropdown();
		
		
	}*/
	
	/*

	@Test(priority = 2)
	public void manufacturers() throws InterruptedException
	{
		manufacturers.clickOnSettingtab();
		Thread.sleep(2000);
		manufacturers.clickOnManufacturerTab();
		Thread.sleep(2000);
		manufacturers.clickOnVehicleManufacturerbutton();
		Thread.sleep(2000);
		manufacturers.ClickOnEntermanufacturernamefield();
		Thread.sleep(2000);
		manufacturers.clickOnAddmanufacturerImageField();
		Thread.sleep(2000);
		manufacturers.ClickonAddButton();
		Thread.sleep(2000);
		manufacturers.ClickOnOkButton();
		Thread.sleep(2000);
		manufacturers.clickOnSettingtab();
		
		
	}*/
	
	
	/*
	 * @Test(priority = 2)
	public void Amenities() throws InterruptedException 
	{
		
		amenitie.ClickOnSettingTab();
		Thread.sleep(2000);
		amenitie.clickOnAmenitiesTab();
		Thread.sleep(2000);
		amenitie.ClickOnEnterAmenityField();
		Thread.sleep(2000);
		amenitie.ClickOnAddButton();
		Thread.sleep(2000);
		amenitie.ClickOnOkButton();
		Thread.sleep(2000);
		amenitie.ClickOnSettingTab();
	
		
	}*/
	
	@Test(priority = 2)
	public void Coupons() throws InterruptedException
	{
		coupons.ClickOnSettingTab();
		Thread.sleep(2000);
		coupons.ClickOnCouponsTab();
		Thread.sleep(2000);
		coupons.ClickOnCuponButton();
		Thread.sleep(2000);
		coupons.ClickOnSelectCityField();
		Thread.sleep(2000);
		coupons.ClickOnCityOptions();
		Thread.sleep(2000);
		coupons.clickOnSelectchargingnetwork();
		Thread.sleep(2000);
		coupons.clickOnchargingnetworkOption();
		Thread.sleep(2000);
		coupons.clickOnCouponType();
		Thread.sleep(2000);
		coupons.ClickOnCouponTypeOption();
		Thread.sleep(2000);
		coupons.clickOnEntercouponcode();
		Thread.sleep(2000);
		coupons.ClickOnEnterDiscountamount();
		Thread.sleep(2000);
		coupons.clickOnTitle();
		Thread.sleep(2000);
		coupons.ClickOnSubTitle();
		Thread.sleep(2000);
		coupons.clickOnDescription();
		Thread.sleep(2000);
		coupons.EnterStartdate();
		Thread.sleep(2000);
		coupons.EnterEnddate();
		Thread.sleep(2000);
		coupons.ClickOnSaveButton();
		Thread.sleep(2000);
		coupons.ClickOnSettingTab();
		
		
	}
	
	
	}

