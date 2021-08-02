package com.pom.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationPom1 {

	public static WebDriver driver;

	@FindBy(xpath = "//a[@class='login']")
	private WebElement log;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement email;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;

	@FindBy(xpath = "(//button[@type='submit'])[3]")
	private WebElement signIn;

	public AutomationPom1(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	

	public WebElement getSignIn() {
		return signIn;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getLog() {
		return log;
	}

}
