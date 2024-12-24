package StepDefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableWithHeader {
	WebDriver driver;

	@Given("You will go to login page and check with header")
	public void you_will_go_to_login_page_and_check_with_header() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "/Users/narenprithvi/Desktop/Automation/chromedriver-mac-x64-131/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
	   
	}
	@When("You will give valid username and password as follows")
	public void you_will_give_valid_username_and_password_as_follows(DataTable dataTable) {
	 List<Map<String, String>> keyvalues= dataTable.asMaps(String.class, String.class);
	 String nameString= keyvalues.get(0).get("Username");
	 String passwordString= keyvalues.get(0).get("Password");
	 driver.findElement(By.id("username")).sendKeys(nameString);
		driver.findElement(By.id("password")).sendKeys(passwordString);
	
	}
	@Then("You will click logins and with header")
	public void you_will_click_logins_and_with_header() {
		driver.findElement(By.id("submit")).click();
	}
	@Then("You will be logged in successfully and done with header")
	public void you_will_be_logged_in_successfully_and_done_with_header() {
		boolean status =driver.findElement(By.partialLinkText("HOME")).isDisplayed();
		Assert.assertTrue(status);
	    
	}
	
	
}
