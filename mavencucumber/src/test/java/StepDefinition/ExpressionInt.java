package StepDefinition;

import io.cucumber.datatable.internal.difflib.myers.MyersDiff;
import io.cucumber.java.en.Given;

public class ExpressionInt {
  
	
	@Given("^I have (\\d+) macbook air$")
	public void i_have_macbook_air(Integer int1) {
	System.out.println("i have "+int1+ " macbook");
	}
	
	@Given("^I have (\\d+\\.\\d+) CGPA$")
	public void i_have_cgpa(Double double1) {
		System.out.println("my CGPA is " +double1 );
	    
	}
	@Given("^\"(.*?)\" is elder than \"(.*?)\" and \"(.*?)\"$")
	public void is_elder_than_and(String string, String string2, String string3) {
     System.out.println(string+ " is greater than " +string2+ " and " +string3   );
	}
	
	
}
