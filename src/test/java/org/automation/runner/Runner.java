package org.automation.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.automation.helper.FileReaderManager;
import com.baseclass.automation.BaseClassAutomation;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src\\test\\java\\com\\automation\\feature",glue=  "org\\automation\\stepdefinition", 
monochrome=true,dryRun = false,strict = true,
plugin = {"pretty","html:Report/htmlreport","com.cucumber.listener.ExtentCucumberFormatter:Report/extentReport.html"})



public class Runner {

	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() throws Throwable {
		String browser = FileReaderManager.getInstaceFr().getInstaceCr().getBrowser();
		driver=BaseClassAutomation.browserLaunch(browser);

	}	
/*	
	@AfterClass
	public static void tearDown() {
		driver=BaseClassAutomation.close();
		
	}
	
	*/
	
}
