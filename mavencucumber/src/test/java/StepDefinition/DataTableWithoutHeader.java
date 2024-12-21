package StepDefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableWithoutHeader {
WebDriver driver;
	
	
	@Given("You will go to login page and check")
	public void you_will_go_to_login_page_and_check() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "/Users/narenprithvi/Desktop/Automation/chromedriver-mac-x64-131/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
	    
	}
	@When("You will give valid username and password")
	public void you_will_give_valid_username_and_password(DataTable dataTable) {
	   List<List<String>> credeList= dataTable.asLists(String.class);
	   String username= credeList.get(0).get(0);
	   String password = credeList.get(0).get(1);
	   driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		
		
	}
	@When("You will click logins")
	public void you_will_click_logins() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("submit")).click();
	}
	@Then("You will be logged in successfully and done")
	public void you_will_be_logged_in_successfully_and_done() {
	    // Write code here that turns the phrase above into concrete actions
		boolean status =driver.findElement(By.partialLinkText("HOME")).isDisplayed();
		Assert.assertTrue(status);
	    
	}
	
	
}
