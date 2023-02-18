package ProjectFinalFormation.pages;

import org.openqa.selenium.WebElement;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(className = "login")
	WebElement login;

	@FindBy(className = "acceptBtn")
	WebElement accept;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void validateCookies() {
		accept.click();
	}

	public void goToConnexion() {
		login.click();
	}

	public boolean isConnected() {
		return false;
	}
}
