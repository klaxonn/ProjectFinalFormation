package ProjectFinalFormation.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreationAccountPage {
	
	@FindBy(name = "firstname")
	WebElement firstnameEl;

	@FindBy(name = "lastname")
	WebElement lastnameEl;

	@FindBy(name = "email")
	WebElement emailEl;
	
	@FindBy(name = "password")
	WebElement passwordEl;
	
	@FindBy(xpath = "//span[text()='Enregistrer']")
	WebElement registerEl;
	
	public CreationAccountPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public void useName(String name) {
		lastnameEl.sendKeys(name);		
	}

	public void useFirstName(String firstname) {
		firstnameEl.sendKeys(firstname);
	}

	public void useEmail(String email) {
		emailEl.sendKeys(email);		
	}

	public void usePassword(String password) {
		passwordEl.sendKeys(password);		
	}

	public void register() {
		registerEl.click();		
	}
}
