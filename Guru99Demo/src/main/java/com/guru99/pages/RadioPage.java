package com.guru99.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru99.util.BasePage;

public class RadioPage extends BasePage {
 public RadioPage() {
	 PageFactory.initElements(driver, this);
 }
 
 
	@FindBy(xpath = "//input[@type='radio']")
	private List<WebElement> radiobtns;
	@FindBy(xpath = "//input[@type='checkbox']")
	private List<WebElement> checkBox;
	
// Actions
	
	public String getURL(){
		return driver.getCurrentUrl();
	}
	
	public void radiocheckbox() {
		highLightElement(driver, radiobtns.get(1));
		radiobtns.get(1).click();
		highLightElement(driver, checkBox.get(2));
		checkBox.get(2).click();
	}

}
