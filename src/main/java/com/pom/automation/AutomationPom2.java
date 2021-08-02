package com.pom.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationPom2 {
	public static WebDriver driver;

	@FindBy(xpath = "//a[text()='Women']")
	private WebElement women;

	@FindBy(xpath = "(//a[text()='T-shirts'])[1]")
	private WebElement tshirt;

	public AutomationPom2(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getWomen() {
		return women;
	}

	public WebElement getTshirt() {
		return tshirt;
	}

}
