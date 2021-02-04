package com.seleniumscripts;

import org.openqa.selenium.By;

import com.selenium.reusable.ReusableSelenium;

public class ValidationCommands extends ReusableSelenium{

	public static void main(String[] args) throws InterruptedException {
		launchbrowser();
		openapp("https://www.bing.com/#");
		Thread.sleep(3000);
		//boolean status=driver.findElement(By.id("bLogo")).isDisplayed();
		if(isDisplayed(By.id("blogo"))==true) {
			System.out.println("Image displayed");
		}
		else {
			System.out.println("Not displayed");
		}
		//boolean status=driver.findElement(By.id("sb_form_q")).isEnabled();
		if(isEnabled(By.id("sb_form_q"))==true) {
			System.out.println("The textbox is Enabled");
		}
		else {
			System.out.println("The textbox is Disabled");
		}
		
		click(By.id("id_sc"));
		Thread.sleep(3000);
		click(By.className("hb_titlerow"));
		Thread.sleep(3000);
		click(By.className("hb_title_col"));
		Thread.sleep(3000);
		//boolean status=driver.findElement(By.id("adlt_set_strict")).isSelected();
		if(isSelected(By.id("adlt_set_strict"))==true) {
			System.out.println("The Radiobutton is Selected");
		}
		else {
			System.out.println("The Radiobutton is not Selected");
		
}
		driver.close();
	}
	
}
	


