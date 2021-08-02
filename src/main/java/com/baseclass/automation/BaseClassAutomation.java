package com.baseclass.automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClassAutomation {

	public static WebDriver driver; // initialize the webdriver // its null browser at this time

	public static WebDriver browserLaunch(String browser) { // selecting browser

		if (browser.equalsIgnoreCase("Chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\deepi\\eclipse-workspace\\AutmationPracticeCucumber\\Driver\\chromedriver.exe");

			driver = new ChromeDriver();
        
		}

		else if (browser.equalsIgnoreCase("Firefox")) {

			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\deepi\\eclipse-workspace\\AutmationPracticeCucumber\\Driver\\chromedriver.exe");

			driver = new FirefoxDriver();
		} else {
			System.out.println("invalid");
		}

		driver.manage().window().maximize();

		return driver; // return type is used to call browser throughout our project otherwise browser
						// is null outside the method

	}

	// close
	public static void closeTab() {
		driver.close();
	}

	// quit
	public static void quitBrowser() {
		driver.quit();
	}

	// navigateto
	public static void nT0(String nav) {
		driver.navigate().to(nav);
	}

	// navigateforward
	public static void nForward() {
		driver.navigate().forward();
	}

	// navigate back

	public static void nBack() {
		driver.navigate().back();
	}

	// navigate refresh

	public static void nRefresh() {
		driver.navigate().refresh();
	}

	// to get in to the url
	public static void openUrl(String url) {
		driver.get(url);

	}

	// windows Handling
	public static void handleWindowsPrint() {
		Set<String> windowHandles = driver.getWindowHandles();
		for (String id : windowHandles) {
			String title = driver.switchTo().window(id).getTitle();
			System.out.println(title);
		}
	}

	// windowHandle to desired page
//	public static void handleWindowsToPage(String myTitle) {
//		Set<String> windowHandles = driver.getWindowHandles();
//		for (String id : windowHandles) {
//			if (driver.switchTo().window(id).equals(myTitle)) {
//				break;
//			}
//		}
//	}

	// to clear
	public static void clearMethod(WebElement element) {
		element.clear();

	}

	// to click
	public static void methodForClick(WebElement element) {
		element.click();

	}

	// sendkeys
	public static void inputValues(WebElement element, String str) {
		element.sendKeys(str);

	}

	// frames== webelement
	public static void intoFrames(WebElement element) {
		driver.switchTo().frame(element);
	}

	// frames==string
	public static void intoFrames(String str) {
		driver.switchTo().frame(str);
	}

	// frames== index
	public static void intoFrames(int index) {
		driver.switchTo().frame(index);
	}

	// leaveframes
	public static void leaveFrames() {
		driver.switchTo().defaultContent();
	}

	// implicitwait
	public static void ImpWait(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}

	// move into element
	public static void actionMoveElement(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).build().perform();
	}

	// context click
	public static void actionContextClick(WebElement element) {
		Actions ac = new Actions(driver);
		ac.contextClick(element).build().perform();
	}

	// click
	public static void actionClick(WebElement element) {
		Actions ac = new Actions(driver);
		ac.click(element).build().perform();
	}

	// Drag and drop click
	public static void actionDragnDrop(WebElement element1, WebElement element2) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(element1, element2).build().perform();
	}

	// context click
	public static void actionDoubleClick(WebElement element) {
		Actions ac = new Actions(driver);
		ac.doubleClick(element).build().perform();
	}

	// get current url
	public static void currentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	// get title
	public static void currentTitle() {
		String title = driver.getTitle();
		System.out.println(title);

	}

	// TakeScreenshot
	public static void screenshot(String path) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		File destination = new File(path);

		FileUtils.copyFile(source, destination);

	}

	// scroll up and down

	public static void scrolls(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);

	}

	// scroll bottom
	public static void scrollBottom() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

	}

	// is multiple

	public static void multiple(WebElement element) {
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		System.out.println("ismultiple" + multiple);

	}

	// select by index
	public static void indexSelect(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}

	// select by value
	public static void valueSelect(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}

	// select by visible
	public static void VisibleTextSelect(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

	// gettext

	public static void getTheText(WebElement element) {
		String text = element.getText();
		System.out.println(text);

	}

	// first selected options

	public static void firstSelected(WebElement element) {
		Select s = new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		System.out.println(text);

	}

	// is enabled
	public static void isEnablesMethod(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println(enabled);

	}

	// is displayed
	public static void isdisplayedMethod(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);
	}

	// is Selected
	public static void isSelectedMethod(WebElement element) {
		boolean selected = element.isSelected();
		System.out.println(selected);

	}

	// get attribute

	public static void getAttributeMethod(WebElement element, String data) {
		String attribute = element.getAttribute(data);
		System.out.println(attribute);

	}

	
	// get Selected options method

	public static void getSelectedOptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement selectedOptions : allSelectedOptions) {
			String text = selectedOptions.getText();
			System.out.println(text);
		}
	}

	// get all options method

	public static void getAllOptionsMethod(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (WebElement allOptions : options) {
			String text = allOptions.getText();
			System.out.println(text);
		}

	}
	// simple alerts

	public static void simpleAlert() {
		Alert simpleAlert = driver.switchTo().alert();
		simpleAlert.accept();
	}

	// confirm alert
	public static void ConfirmAlert(String str) {
		Alert ConfirmAlert = driver.switchTo().alert();
		if (str.equalsIgnoreCase("accept")) {
			ConfirmAlert.accept();
		} else if (str.equalsIgnoreCase("dismiss")) {
			ConfirmAlert.dismiss();
		} else {
			System.out.println("invalid confirm alert");
		}
	}

	// prompt alerts
	public static void PromptAlert(String sendkeys, String str) {
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys(sendkeys);
		if (str.equalsIgnoreCase("Accept")) {
			promptAlert.accept();
		} else if (str.equalsIgnoreCase("dismiss")) {
			promptAlert.dismiss();
		} else {
			System.out.println("invaild prompt alert");
		}

	}

	// keyboard actions

	public static void keyAction(int keyeventPress, int keyeventRelease) throws AWTException {
		Robot r = new Robot();

		r.keyPress(keyeventPress);
		r.keyRelease(keyeventRelease);

	}
	
	
	

	
	
	
	
	
	
	
	

}
