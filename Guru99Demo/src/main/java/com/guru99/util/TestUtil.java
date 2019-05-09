package com.guru99.util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestUtil {
	
	static long PAGE_LOADLTIMEOUT = 20;
	static long IMPLICIT_WAIT = 30;	
	public static void highLightElement(WebDriver driver, WebElement element)
	{
	JavascriptExecutor js=(JavascriptExecutor)driver; 
	 
	js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');", element);
	
	}
}
