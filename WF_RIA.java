package com.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class WF_RIA {
	private static final String dLocator = ".//*[@id='type']";
	static boolean status;
	public static String url = "file:///home/anand/Desktop/hack/designPatterns/one.html";
	public static String locator = "btnBalloonText";

	public static void main(String gp[]) {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		Select dropdown; 
		Util.getbtn_by_id(driver, locator).click();
		WebElement e = Util.getDropDown(driver, dLocator);
		//dropdown = new Select(driver.findElement(By.xpath(".//*[@id='type']")));
		dropdown = new Select(Util.get_by_xpath(driver, ".//*[@id='type']"));
		dropdown.selectByIndex(1);
		
		// Util.getDropDown(driver, dLocator).
	}
}
