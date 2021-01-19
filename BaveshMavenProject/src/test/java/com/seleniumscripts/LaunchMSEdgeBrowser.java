package com.seleniumscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchMSEdgeBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Jhilly\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.mortgagecalculator.org/");
		String titlename=driver.getTitle();
		System.out.println(titlename);
		driver.close();
	}

}
