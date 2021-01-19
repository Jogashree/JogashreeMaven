package com.seleniumscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {

	public static void main(String[] args) {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Jhilly\\Downloads\\geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.mortgagecalculator.org/");
	  String titlename=driver.getTitle();
	  System.out.println(titlename);
	  driver.close();

	}

}
