package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.base.Base;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;

public class RegisterUser {

	@Given("^I launch the application$")
	public void i_launch_the_application() {
		
		Base.driver.get(Base.reader.getUrl());
	   
	}

	@Given("^I navigate to the account registration page$")
	public void i_navigate_to_the_account_registration_page() {
	  
	}

	@When("^I provide all the below valid details$")
	public void i_provide_all_the_below_valid_details(DataTable arg1) {
	    
	}

	@When("^I select the privacy policy$")
	public void i_select_the_privacy_policy() {
	   
	}

	@When("^I click on continue Button$")
	public void i_click_on_continue_Button(){
	   
	}

	@Then("^I should see that the user account has been created successfully$")
	public void i_should_see_that_the_user_account_has_been_created_successfully() {
	   
	}
}
