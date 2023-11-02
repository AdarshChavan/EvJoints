package Library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.fasterxml.jackson.databind.annotation.JsonAppend.Prop;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass extends UtilityClass{

	// launch browser

	public static WebDriver driver;

	public void browser() throws InterruptedException {
       
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--remote-allow-origins=*");

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		//driver.get("https://admin.evjoints.com/login");
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();

	}

}
