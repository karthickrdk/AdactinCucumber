package org.automation.stepdefinition;

import org.automation.runner.Runner;
import org.openqa.selenium.WebDriver;

import com.automation.helper.FileReaderManager;
import com.baseclass.automation.BaseClassAutomation;
import com.pom.automation.AutomationPom1;
import com.pom.automation.AutomationPom2;
import com.pom.automation.AutomationPom3;
import com.pom.automation.AutomationPom4;

import cucumber.api.java.en.*;

public class Stepdefinition extends BaseClassAutomation {
	public static WebDriver driver=Runner.driver;
																		//Scenario 1
	@Given("^User must launch the login page$")
	public void user_must_launch_the_login_page() throws Throwable {
		String url = FileReaderManager.getInstaceFr().getInstaceCr().getUrl();
		openUrl(url);
	}

	AutomationPom1 ap1 = new AutomationPom1(driver);

	@When("^User press the sign button to proceed$")
	public void user_press_the_sign_button_to_proceed() throws Throwable {
		ImpWait(10);
		methodForClick(ap1.getLog());
	}

	@When("^User enter the valid username in the username field$")
	public void user_enter_the_valid_username_in_the_username_field() throws Throwable {
		ImpWait(10);
		String username = FileReaderManager.getInstaceFr().getInstaceCr().getUsername();
		inputValues(ap1.getEmail(), username);
	}

	@When("^User enter the valid password in the password field$")
	public void user_enter_the_valid_password_in_the_password_field() throws Throwable {
		String password = FileReaderManager.getInstaceFr().getInstaceCr().getPassword();
		inputValues(ap1.getPassword(), password);

	}

	@Then("^User confirm it and navigate to the main page$")
	public void user_confirm_it_and_navigate_to_the_main_page() throws Throwable {
		methodForClick(ap1.getSignIn());
	}
		AutomationPom2 ap2=new AutomationPom2(driver);									//scenario 2
	
	@Given("^User must present in the My Account Page$")
	public void user_must_present_in_the_My_Account_Page() throws Throwable {
		
	}

	@When("^User move to the women area for selecting the dress$")
	public void user_move_to_the_women_area_for_selecting_the_dress() throws Throwable {
		ImpWait(10);
		actionMoveElement(ap2.getWomen());
	}

	@Then("^User click the casual dress and navigate forward$")
	public void user_click_the_casual_dress_and_navigate_forward() throws Throwable {
		methodForClick(ap2.getTshirt());
	}
																					// scenario 3
	AutomationPom3	ap3=new AutomationPom3(driver);																					

	@Given("^User must be available in the casual dress area$")
	public void user_must_be_available_in_the_casual_dress_area() throws Throwable {
		
	}

	@When("^User click the image of specific dress to order$")
	public void user_click_the_image_of_specific_dress_to_order() throws Throwable {
		ImpWait(10);
		methodForClick(ap3.getImage());
	}

	@Then("^User click the add cart and proceed further$")
	public void user_click_the_add_cart_and_proceed_further() throws Throwable {
		ImpWait(10);
		intoFrames(ap3.getFrames());
		methodForClick(ap3.getAddTOCart());
		leaveFrames();
		
	}
										
																						// scenario 4
	AutomationPom4 ap4=new AutomationPom4(driver);
	
	@Given("^User should present in the product added page$")
	public void user_should_present_in_the_product_added_page() throws Throwable {
		
	}

	@When("^User press the proceed to checkout button to move forward$")
	public void user_press_the_proceed_to_checkout_button_to_move_forward() throws Throwable {
		ImpWait(10);
		methodForClick(ap4.getProceed());
	}

	@When("^User click the proceed to checkout in summary page$")
	public void user_click_the_proceed_to_checkout_in_summary_page() throws Throwable {
		ImpWait(10);
		methodForClick(ap4.getProceed2());
	}

	@When("^User must press the proceed to checkout in address page$")
	public void user_must_press_the_proceed_to_checkout_in_address_page() throws Throwable {
		ImpWait(10);	
		methodForClick(ap4.getProceed3());
	}

	@When("^User press the checkbox in shipping page$")
	public void user_press_the_checkbox_in_shipping_page() throws Throwable {
		ImpWait(10);
		methodForClick(ap4.getCheck());
	}

	@When("^User  must press the proceed to checkout in shipping$")
	public void user_must_press_the_proceed_to_checkout_in_shipping() throws Throwable {
		ImpWait(10);
		methodForClick(ap4.getProceed4());
	}

	@When("^User should the payment method to proceed further$")
	public void user_should_the_payment_method_to_proceed_further() throws Throwable {
		ImpWait(10);
	methodForClick(ap4.getPayment());
	}

	@Then("^User should press the confirm order to place his order and proceed with the order confirmation page$")
	public void user_should_press_the_confirm_order_to_place_his_order_and_proceed_with_the_order_confirmation_page()
			throws Throwable {
		ImpWait(10);
		methodForClick(ap4.getConfirm());

	
	}

}
