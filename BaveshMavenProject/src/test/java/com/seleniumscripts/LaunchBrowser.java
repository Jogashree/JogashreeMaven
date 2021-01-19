package com.seleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jhilly\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.mortgagecalculator.org/");
		String titlename=driver.getTitle();
		System.out.println(titlename);
		driver.findElement(By.id("homeval")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("homeval")).sendKeys("5000");
		Thread.sleep(3000);
		driver.findElement(By.id("downpayment")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("downpayment")).sendKeys("7000");
		Thread.sleep(3000);
		driver.findElement(By.id("loanamt")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("loanamt")).sendKeys("230000.0");
		Thread.sleep(3000);
		driver.findElement(By.id("intrstsrate")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("intrstsrate")).sendKeys("3.7");
		Thread.sleep(3000);
		driver.findElement(By.name("cal")).click();
		Thread.sleep(3000);
		driver.close();
		
		driver.close();

	}

}
