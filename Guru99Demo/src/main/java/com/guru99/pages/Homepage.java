package com.guru99.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.guru99.util.BasePage;

public class Homepage extends BasePage{
	
	@FindBy(className = "dropdown-toggle")
	private WebElement seleniumLable;
	
	@FindBy(xpath = "//a[contains(text(),'Radio & Checkbox Demo')]")
	private WebElement radioOption;
	@FindBy(xpath = "//input[@type='radio']")
	private List<WebElement> radiobtns;
	@FindBy(xpath = "//input[@type='radio']")
	private List<WebElement> checkBox;
	
	//Actions
	public void seleniumHoverClick() {
		Actions action = new Actions(driver);
		action.moveToElement(seleniumLable).build().perform();
		highLightElement(driver, seleniumLable);
		
	}
	
	public void clickRadio() {
		highLightElement(driver, radioOption);
		radioOption.click();
		
	}

	public String pageurl() {
		return driver.getCurrentUrl();
	}
	
	public void radiocheckbox() {
		radiobtns.get(2).click();
		checkBox.get(3).click();
		
	}
}
