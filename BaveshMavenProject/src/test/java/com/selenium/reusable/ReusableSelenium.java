package com.selenium.reusable;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReusableSelenium {
	public static ChromeDriver driver;
	public static void launchbrowser() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		
	}
	public static void openapp(String url) {
		
		driver.get(url);
	}
	public static void sendtext(By locatorname,String value) {
		driver.findElement(locatorname).clear();
		driver.findElement(locatorname).sendKeys(value);
	}
	
	public static void click(By locatorname) {
		driver.findElement(locatorname).click();
	}
	public static void getCurrentUrl(String url) {
		url=driver.getCurrentUrl();
	}
	public static boolean isDisplayed(By locatorname) {
		boolean status=driver.findElement(locatorname).isDisplayed();
		return status;
	}
	public static boolean isEnabled(By locatorname) {
		boolean status=driver.findElement(locatorname).isEnabled();
		return status;
	}
	public static boolean isSelected(By locatorname) {
		boolean status=driver.findElement(locatorname).isSelected();
		return status;
		
	}

}
