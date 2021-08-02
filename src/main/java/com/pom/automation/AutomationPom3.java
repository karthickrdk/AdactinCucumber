package com.pom.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationPom3 {

	public static WebDriver driver;

	@FindBy(xpath = "//img[@width='250']")
	private WebElement image;

	@FindBy(xpath = "//iframe[@vspace='0']")
	private WebElement frames;

	@FindBy(xpath = "//button[@class='exclusive']")
	private WebElement addTOCart;

	public AutomationPom3(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getImage() {
		return image;
	}

	public WebElement getFrames() {
		return frames;
	}

	public WebElement getAddTOCart() {
		return addTOCart;
	}

}
