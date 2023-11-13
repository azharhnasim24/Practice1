package com.generic;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	
	public MasterPageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(), ' Signup / Login')]")
	private WebElement loginBtn1;

	public WebElement getLoginBtn1() {
		return loginBtn1;
	}
	
	@FindBy(xpath="(//*[@name='email'])[1]")
	private WebElement emailField ;
	
	@FindBy(xpath="//*[@name='password']")
	private WebElement passwordField;
	
	@FindBy(xpath="//button[contains(text(), 'Login')]")
	private WebElement loginBtn2;
	
	public WebElement getEmailField() {
		return emailField;
	}

	public WebElement getPasswordField() {
		return passwordField;
	}

	public WebElement getLoginBtn2() {
		return loginBtn2;
	}

	public WebElement getLogoutBtn() {
		return logoutBtn;
	}

	@FindBy(xpath="//a[contains(text(), 'Logout')]")
	private WebElement logoutBtn;

}
