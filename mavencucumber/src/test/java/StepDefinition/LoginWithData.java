package StepDefinition;

import java.sql.Driver;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithData {
	 WebDriver driver;
	 
	 @Given("user will go to login page website")
	 public void user_will_go_to_login_page_website() {
	     // Write code here that turns the phrase above into concrete actions
		 System.setProperty("webdriver.chrome.driver", "/Users/narenprithvi/Desktop/Automation/chromedriver-mac-x64-131/chromedriver");
			driver = new ChromeDriver();
			driver.get("https://practicetestautomation.com/practice-test-login/");
			
	 }
	 
	
	@When("user will give valid credentials {string} and {string}")
	public void user_will_give_valid_credentials_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("username")).sendKeys(string);
		driver.findElement(By.id("password")).sendKeys(string2);

	}
	
	@When("user will click login and see")
	public void user_will_click_login_and_see() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("submit")).click();
	}
	@Then("user will be logged in successfully and see homepage")
	public void user_will_be_logged_in_successfully_and_see_homepage() {
	    // Write code here that turns the phrase above into concrete actions
		boolean status =driver.findElement(By.partialLinkText("HOME")).isDisplayed();
		Assert.assertTrue(status);
	    
	}

}
