package com.tutorialsninja.automation.pages;

import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

import cucumber.api.DataTable;

public class Registerpage {
	
	public Registerpage()
	{
		PageFactory.initElements(Base.driver,this);
	}

	@FindBy(id="input-firstname")
	public static WebElement firstName;
	
	@FindBy(id="input-lastname")
	public static WebElement lastname;
	
	@FindBy(id="input-email")
	public static WebElement email;
	
	@FindBy(id="input-telephone")
	public static WebElement telephone;
	
	@FindBy(id="input-password")
	public static WebElement password;
	
	@FindBy(id="input-confirm")
	public static WebElement confirmPassword;
	
	@FindBy(name="agree")
	public static WebElement privacyPolicy;
	
	@FindBy(css = "[value='Continue']")
	public static WebElement continueButton;
	
	@FindBy(linkText = "Register")
	public static WebElement registerBreadCum;
	
	@FindBy(css = "input[id='input-firstname']+div")
	public static WebElement firstNameWarning;
	
	@FindBy(css = "[id='input-lastname']+div")
	public static WebElement lastNameWarning;
	
	@FindBy(css = "[id='input-email']+div")
	public static WebElement emailWarning;
	
	@FindBy(css = "[id='input-telephone']+div")
	public static WebElement telephoneWarning;
	
	@FindBy(css = "[id='input-password']+div")
	public static WebElement passwordWarning;
	
	@FindBy(css = "[class='alert alert-danger alert-dismissible']")
	public static WebElement mainWarning;
	
	@FindBy(css = "[name='newsletter'][value='1']")
	public static WebElement yesToNewsLetter;
	
	public static void enterAllDetails(DataTable dataTable, String detailsType)
	{
		Map<String,String> map =dataTable.asMap(String.class,String.class);
		
		Elements.TypeText(Registerpage.firstName,map.get("FirstName"));
		Elements.TypeText(Registerpage.lastname,map.get("LastName"));
		Elements.TypeText(Registerpage.email,map.get("Email"));
		Elements.TypeText(Registerpage.telephone,map.get("Telephone"));
		Elements.TypeText(Registerpage.password,map.get("Password"));
		Elements.TypeText(Registerpage.confirmPassword,map.get("Password"));
	
		if(detailsType.equalsIgnoreCase("dublicate"))
			Elements.TypeText(Registerpage.email,map.get("Email"));
		else
			Elements.TypeText(Registerpage.email, System.currentTimeMillis()+map.get("Email"));
	}
	
}
