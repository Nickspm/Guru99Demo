package com.guru99.stepdef;


import com.guru99.pages.Homepage;
import com.guru99.pages.RadioPage;
import com.guru99.util.BasePage;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class HomePageStep extends BasePage {
	
	Homepage homepageobj;
	RadioPage radiopage;
	
	@Given("^User is at home page$")
	public void user_is_at_home_page() throws InterruptedException {
		
		BasePage.initialization(); 
		homepageobj= new Homepage();;
		System.out.println(homepageobj.pageurl());
		Assert.assertEquals("http://demo.guru99.com/", homepageobj.pageurl());
	}

	@Then("^User hovers on selenium and clicks on selenium lable$")
	public void user_hovers_on_selenium_and_clicks_on_selenium_lable() throws InterruptedException  {
		

		homepageobj.seleniumHoverClick();
	}

	

	@Then("^user verifies the page$")
	public void user_verifies_the_page()  {
		radiopage = new RadioPage();
	  //  Assert.assertEquals("http://demo.guru99.com/test/radio.html", radiopage.getURL());
	}

	@Then("^user selects second radio button and third checkbox$")
	public void user_selects_second_radio_button_and_third_checkbox() {
		radiopage.radiocheckbox();
		   
	}


}
