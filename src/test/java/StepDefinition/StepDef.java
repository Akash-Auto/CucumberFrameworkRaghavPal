package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObject.LoginPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {

	public WebDriver driver;
	public LoginPage loginPg;

	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		loginPg = new LoginPage(driver);

	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {

		driver.get(url);
		driver.manage().window().maximize();

		try {
			// Wait for 3 seconds to let Cloudflare challenge pass
			Thread.sleep(3000); 
		}    
		catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	@And("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String emailadd, String password) {

		loginPg.enterEmail(emailadd);
		loginPg.enterPassword(password);

	}

	//	@When("click on remember me")
	//	public void click_on_remember_me() {
	//
	//		loginPg.rememberMeButton();
	//		
	//	}

	@And("Click on Login")
	public void click_on_login() {

		loginPg.clickOnLoginButton();

	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String expectedTitle) {

		String actualtitle=driver.getTitle();

		if(actualtitle.equals(expectedTitle)) {

			Assert.assertTrue(true);

		}
		else
		{

			Assert.assertTrue(false);

		}

	}

	@When("User click on Log out link")
	public void user_click_on_log_out_link() {

		loginPg.clickOnLogOutButton();

	}

	@Then("close browser")
	public void close_browser() {

		driver.close();
		driver.quit();

	}






}
