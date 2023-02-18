package ProjectFinalFormation.testsSuite;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ProjectFinalFormation.pages.CreationAccountPage;
import ProjectFinalFormation.pages.HomePage;
import ProjectFinalFormation.pages.LoginPage;

public class LoginSteps {
	
	LoginPage loginPage;
	HomePage homePage;
	CreationAccountPage creationAccountPage;
	WebDriver driver;
	final String website = "https://www.laboutique.carambarco.com/"; 
	
	@Before
	public void init() {
		driver = new ChromeDriver();
	}
	
	@Given("Le particulier est sur la page principale")
	public void le_particulier_est_sur_la_page_principale() {
    	driver.get(website);
		driver.manage().window().fullscreen();
		homePage = new HomePage(driver);
		homePage.validateCookies();
	}
	
	@When("il va sur la page de connexion")
	public void il_va_sur_la_page_connexion() {
		homePage.goToConnexion();
		loginPage = new LoginPage(driver);
	}
	
	@When("il va sur la page de création de compte")
	public void il_va_sur_la_page_() {
		loginPage.goToCreation();
		creationAccountPage = new CreationAccountPage(driver);
	}
	
	@When("il écrit son prénom {string}")
	public void il_écrit_son_prénom(String firstName) {
		creationAccountPage.useFirstName(firstName);
	}
	
	@When("il écrit son nom {string}")
	public void il_écrit_son_nom(String name) {
		creationAccountPage.useName(name);
	}
	
	@When("il écrit son email {string}")
	public void il_écrit_un_email_respectant_les_règles(String email) {
		creationAccountPage.useEmail(email);
	}
	
	@When("il écrit son mot de passe {string}")
	public void il_écrit_un_mot_de_passe_respectant_les_règles(String password) {
		creationAccountPage.usePassword(password);
	}
	
	@When("il s'enregistre")
	public void il_s_enregistre() {
		creationAccountPage.register();
	}
	
	@Then("on doit arriver à la page principale")
	public void un_compte_doit_être_créé() {
		assertEquals(website, driver.getCurrentUrl());
	}
}
