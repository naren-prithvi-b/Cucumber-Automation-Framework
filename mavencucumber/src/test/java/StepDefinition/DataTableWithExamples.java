package StepDefinition;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.plaf.basic.BasicSplitPaneUI.BasicHorizontalLayoutManager;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableWithExamples {
WebDriver driver;
public static String getCurrentDateTimeWithMilliseconds() {
LocalDateTime now = LocalDateTime.now();
DateTimeFormatter time1 = DateTimeFormatter.ofPattern("HH:mm:ss.SSSS");
String time = now.format(time1);

String timestampString = time.toString().replace(":", "").replace(" ", "");

return timestampString;
}
	
	@Given("You will go to login page and check with data")
	public void you_will_go_to_login_page_and_check_with_data() throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/narenprithvi/Desktop/Automation/chromedriver-mac-x64-131/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		File captureFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String dateString = getCurrentDateTimeWithMilliseconds();
		FileUtils.copyFile(captureFile, new File ( "/Users/narenprithvi/Desktop/Automation/Screenshot/sample"+dateString+".jpg"));
	    
	    
	}
	@When("You will give valid {string} and {string} as examples")
	public void you_will_give_valid_and_as_examples(String username, String password) throws IOException, InterruptedException {
		
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(3000);
		File captureFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String dateString = getCurrentDateTimeWithMilliseconds();
		FileUtils.copyFile(captureFile, new File ( "/Users/narenprithvi/Desktop/Automation/Screenshot/sample"+dateString+".jpg"));
	    
	   
	}
	
	
	@Then("You will click logins and with data")
	public void you_will_click_logins_and_with_data() throws IOException {
		driver.findElement(By.id("submit")).click();
		File captureFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String dateString = getCurrentDateTimeWithMilliseconds();
		FileUtils.copyFile(captureFile, new File ( "/Users/narenprithvi/Desktop/Automation/Screenshot/sample"+dateString+".jpg"));
	    
	
	}
	@Then("You will be logged in successfully and done with data")
	public void you_will_be_logged_in_successfully_and_done_with_data() {
		boolean status =driver.findElement(By.partialLinkText("HOME")).isDisplayed();
		Assert.assertTrue(status);
		driver.navigate().back();
		
	
	}
}
