package com.guru99.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru99.util.BasePage;

public class Homepage extends BasePage{
	
	@FindBy(xpath = "//a[@class='dropdown-toggle']")
	private WebElement seleniumLable;
	@FindBy(xpath = "//a[contains(text(),'Radio & Checkbox Demo')]")
	 private WebElement radioOption;
	
	
	public Homepage() {
		PageFactory.initElements(driver, this);
	}
	//Actions
	public void seleniumHoverClick() {
		System.out.println("Selenium hover started");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Actions action = new Actions(driver);
		//highLightElement(driver, seleniumLable);
		System.out.println(" After Selenium hover");
		WebElement w=seleniumLable;
		System.out.println(w);
		seleniumLable.click();
		//action.moveToElement(seleniumLable).build().perform();
		highLightElement(driver, radioOption);
		radioOption.click();
		
	}
	
	
	public String pageurl() {
		return driver.getCurrentUrl();
	}
	
	
}
