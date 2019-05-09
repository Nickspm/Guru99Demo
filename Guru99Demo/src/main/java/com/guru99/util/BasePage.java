package com.guru99.util;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BasePage extends TestUtil{
	
	public static WebDriver driver;
	public static Properties prop;
	
	public BasePage() {
		try {
			prop =new Properties();
			FileInputStream fis = new FileInputStream("C:\\panay\\Guru99Demo\\Guru99Demo\\src\\main\\java\\com\\guru99\\config\\config.properties");
			prop.load(fis);
		}
		catch(IOException e ){
			e.getMessage();
		}
	}

	public static void initialization() throws InterruptedException {
		String browserName = prop.getProperty("browser");
		if(browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\panay\\Guru99Demo\\Guru99Demo\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if(browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "./Guru99Demo/Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOADLTIMEOUT, TimeUnit.SECONDS);
	    //pageLoadTimeout((TestUtil.PAGE_LOADLTIMEOUT),TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		Thread.sleep(5000);


}
}