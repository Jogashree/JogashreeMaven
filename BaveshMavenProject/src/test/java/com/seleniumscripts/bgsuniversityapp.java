package com.seleniumscripts;

import org.openqa.selenium.By;


import com.selenium.reusable.ReusableSelenium;

public class bgsuniversityapp extends ReusableSelenium{

	public static void main(String[] args) throws InterruptedException {
		launchbrowser();
		openapp("https://www.bgsbuniversity.org/");
		Thread.sleep(3000);
		click(By.linkText("Admission"));
		click(By.linkText("Result"));
		click(By.linkText("Syllabus"));
		click(By.linkText("Merit List"));
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		getCurrentUrl("https://www.bgsbuniversity.org/");
		driver.navigate().to("https://www.bgsbuniversity.org/");
		driver.close();

	}

}
