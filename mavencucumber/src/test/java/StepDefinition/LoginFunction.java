package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFunction {
	WebDriver driver;
	
	@Given("user will go to login page")
	public void user_will_go_to_login_page() {
		System.setProperty("webdriver.chrome.driver", "/Users/narenprithvi/Desktop/Automation/chromedriver-mac-x64-131/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
	    	}
	@When("user will give valid username and password")
	public void user_will_give_valid_username_and_password() {
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		
	    }
	@When("user will click login")
	public void user_will_click_login() {
		driver.findElement(By.id("submit")).click();
		
	    }
	@Then("user will be logged in successfully")
	public void user_will_be_logged_in_successfully() throws InterruptedException {
    Thread.sleep(3000);
	boolean status =driver.findElement(By.partialLinkText("HOME")).isDisplayed();
	Assert.assertTrue(status);
	//if (status) {
		//System.out.println("HurraYYY !!! success :) ");
	//}
	    }


}
