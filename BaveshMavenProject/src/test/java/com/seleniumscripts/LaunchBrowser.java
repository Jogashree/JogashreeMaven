package com.seleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.selenium.reusable.ReusableSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser extends ReusableSelenium{

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jhilly\\Downloads\\chromedriver_win32\\chromedriver.exe");
		launchbrowser();
		openapp("https://www.mortgagecalculator.org/");
		Thread.sleep(3000);
		String titlename=driver.getTitle();
		System.out.println(titlename);
		sendtext(By.id("homeval"),"5000");
		Thread.sleep(3000);
		sendtext(By.id("downpayment"),"6000");
		Thread.sleep(3000);
		sendtext(By.id("loanamt"),"23000.0");
		Thread.sleep(3000);
		sendtext(By.id("intrstsrate"),"3.7");
		Thread.sleep(3000);
		driver.findElement(By.name("cal")).click();
		Thread.sleep(3000);
		driver.close();
		
		driver.close();

	}

}
