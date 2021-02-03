package com.seleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.selenium.reusable.ReusableSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationCommands extends ReusableSelenium{

	public static void main(String[] args) throws InterruptedException {
		launchbrowser();
		openapp("https://www.selenium.dev/");
		Thread.sleep(3000);
		click(By.linkText("Downloads"));
		click(By.linkText("Projects"));
		click(By.linkText("Documentation"));
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		String curl=driver.getCurrentUrl();
		openapp(curl);
		driver.navigate().to(curl);
		driver.findElement(By.id("gsc-i-id1")).sendKeys(Keys.F5);
		driver.close();



	}

}
