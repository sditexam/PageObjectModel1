package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	
	public WebDriver driver;
	public static CarBase carBase;
	public static TopNavigation topNav;
	
	
	public BasePage(WebDriver driver) {
		
		this.driver = driver;
		carBase = new CarBase(driver);
		topNav = new TopNavigation(driver);
		PageFactory.initElements(driver, this);
	}
	

}
