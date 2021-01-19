package com.seleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
		driver.findElement(By.linkText("Downloads")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Projects")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Documentation")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.close();



	}

}
