package com.guru99.stepdef;

import com.guru99.pages.Homepage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class HomePageStep {
	Homepage homepageobj= new Homepage();;
	@Given("^User is at home page$")
	public void user_is_at_home_page() {
		  
		
		//Assert.assertEquals("http://demo.guru99.com/", homepageobj.pageurl());
	}

	@Then("^User hovers on selenium and clicks on selenium lable$")
	public void user_hovers_on_selenium_and_clicks_on_selenium_lable()  {
		homepageobj.seleniumHoverClick();
	}

	@Then("^user clicks on radio and checkbox$")
	public void user_clicks_on_radio_and_checkbox() {
		homepageobj.clickRadio();
	}

	@Then("^user verifies the page$")
	public void user_verifies_the_page()  {
	    Assert.assertEquals("http://demo.guru99.com/test/radio.html", homepageobj.pageurl());
	}

	@Then("^user selects second radio button and third checkbox$")
	public void user_selects_second_radio_button_and_third_checkbox(int arg1) {
		homepageobj.radiocheckbox();
		
	    
	}


}
