package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenGoogleSteps {
WebDriver driver;
	
	@Given("user entering google.co.in")
	public void user_entering_google_co_in() {
	    // Write code here that turns the phrase above into concrete actions
	    System.setProperty("webdriver.chrome.driver", "/Users/narenprithvi/Desktop/Automation/chromedriver-mac-x64-131/chromedriver");
	    driver= new ChromeDriver();
	    driver.get("https://www.google.co.in");
	    
	}
	@When("user search for {string}")
	public void user_search_for(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys(string);
		
	    
	}
	@When("enter the return key")
	public void enter_the_return_key() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys(Keys.RETURN);
	    
	}
	@Then("google should display the result")
	public void google_should_display_the_result() {
	    // Write code here that turns the phrase above into concrete actions
		boolean status = driver.findElement(By.partialLinkText("naren")).isDisplayed();
		if(status) {
				System.out.println("success");
		}
	    
	}

	
	
	
}
