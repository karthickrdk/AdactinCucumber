package com.pom.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationPom4 {
	public static WebDriver driver;

	@FindBy(xpath = "(//a[contains(@class,'btn btn-default')])[2]")
	private WebElement proceed;

	@FindBy(xpath = "(//a[contains(@class,'btn btn-default')])[5]")
	private WebElement proceed2;

	@FindBy(xpath = "//button[@name='processAddress']")
	private WebElement proceed3;

	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement check;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement proceed4;

	@FindBy(xpath = "//a[@class='cheque']")
	private WebElement payment;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement confirm;

	public AutomationPom4(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getProceed() {
		return proceed;
	}

	public WebElement getProceed2() {
		return proceed2;
	}

	public WebElement getProceed3() {
		return proceed3;
	}

	public WebElement getCheck() {
		return check;
	}

	public WebElement getProceed4() {
		return proceed4;
	}

	public WebElement getPayment() {
		return payment;
	}

	public WebElement getConfirm() {
		return confirm;
	}

}
