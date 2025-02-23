package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class HomePage extends BaseClass {
	
		public HomePage(WebDriver driver) {
			
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath="//img[@alt='Tendable Logo']") private WebElement homePageButton;
		@FindBy(xpath="//a[normalize-space()='Request A Demo']") private WebElement requestDemoButton;
		public boolean verifyRequsetDemoButtonIsEnabled()
		{
			return requestDemoButton.isEnabled();
		}
		public void navigateToHomePage()  {
			
			homePageButton.click();
		}

		public String verifyCurrentURL() {
			return driver.getCurrentUrl();

		}
		
		
}
