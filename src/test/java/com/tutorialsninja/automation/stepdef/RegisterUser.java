package com.tutorialsninja.automation.stepdef;

import java.util.Map;

import org.junit.Assert;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.AccountSuccessPage;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.Registerpage;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;
import gherkin.lexer.El;


public class RegisterUser {
	
	HeadersSection headerssection = new HeadersSection();
	Registerpage registerPage = new Registerpage();
	AccountSuccessPage accountSuccessPage = new AccountSuccessPage();

	@Given("^I launch the application$")
	public void i_launch_the_application() {
		
		Base.driver.get(Base.reader.getUrl());
	   
	}

	@Given("^I navigate to the account registration page$")
	public void i_navigate_to_the_account_registration_page() {
	  
		Elements.click(HeadersSection.myAccountLink);
		Elements.click(HeadersSection.register);
	}

	@When("^I provide all the below valid details$")
	public void i_provide_all_the_below_valid_details(DataTable dataTable) {
	    
	registerPage.enterAllDetails(dataTable, "duplicate");
			
	}

	@When("^I select the privacy policy$")
	public void i_select_the_privacy_policy() {
		
		Elements.click(registerPage.privacyPolicy);
	   
	}

	@When("^I click on continue Button$")
	public void i_click_on_continue_Button(){
	   
		Elements.click(Registerpage.continueButton);
	}

	@Then("^I should see that the user account has been created successfully$")
	public void i_should_see_that_the_user_account_has_been_created_successfully() {
	   
		Assert.assertTrue(Elements.isDisplayed(AccountSuccessPage.successBreadCum));
		
	}
	
	@Then("^I should see that user account is not created$")
	public void i_should_see_that_user_account_is_not_created()  {
	  
		Assert.assertTrue(Elements.isDisplayed(registerPage.registerBreadCum));
	
	}

	@Then("^i should see the error messages informing the user to fill the mandatory fields$")
	public void i_should_see_the_error_messages_informing_the_user_to_fill_the_mandatory_fields()  {
	   
		Assert.assertTrue(Elements.isDisplayed(registerPage.firstNameWarning));
		Assert.assertTrue(Elements.isDisplayed(registerPage.lastNameWarning));
		Assert.assertTrue(Elements.isDisplayed(registerPage.emailWarning));
		Assert.assertTrue(Elements.isDisplayed(registerPage.telephoneWarning));
		Assert.assertTrue(Elements.isDisplayed(registerPage.passwordWarning));
		Assert.assertTrue(Elements.isDisplayed(registerPage.mainWarning));
	}
	
	@When("^I subscribe to Newsletter$")
	public void i_subscribe_to_Newsletter(){
	
		Elements.click(registerPage.yesToNewsLetter);
	}
	@When("^I provide the below duplicate details$")
	public void i_provide_the_below_duplicate_details(DataTable arg1)  {
	   
	}
	
	@Then("^I should see that user is restricted from creating duplicate account$")
	public void i_should_see_that_user_is_restricted_from_creating_duplicate_account() {
	    
	}
}
