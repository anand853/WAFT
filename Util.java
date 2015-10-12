package com.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Util {

	public static WebDriver driver;

	public static WebElement element;

	public static Select select;

	public static WebElement get_by_id(WebDriver driver, String locator) {
		return driver.findElement(By.id(locator));

	}

	public static WebElement get_by_xpath(WebDriver driver, String locator) {
		return driver.findElement(By.xpath(locator));

	}

	public static WebElement get_by_name(WebDriver driver, String locator) {
		return driver.findElement(By.name(locator));

	}

	public static WebElement get_by_css(WebDriver driver, String locator) {
		return driver.findElement(By.linkText(locator));

	}

	public static boolean isEnabled(WebDriver driver, String locator) {
		return driver.findElement(By.id(locator)).isEnabled();

	}

	public static boolean isDisplayed(WebDriver driver, String locator) {
		return driver.findElement(By.id(locator)).isDisplayed();

	}

	public static boolean isSelected(WebDriver driver, String locator) {
		return driver.findElement(By.id(locator)).isSelected();

	}

	public static void click(WebDriver driver, String locator) {

		driver.findElement(By.id(locator)).click();

	}

	public static void clear(WebDriver driver, String locator) {
		driver.findElement(By.id(locator)).clear();

	}

	public static void sumbit(WebDriver driver, String locator) {
		driver.findElement(By.id(locator)).submit();

	}

	public static void typeText(WebDriver driver, String locator) {
		driver.findElement(By.id(locator)).sendKeys(locator);

	}

	public static WebElement CheckBoxClick(WebDriver driver, String locator) {
		return driver.findElement(By.xpath(locator));

	}

	public static Boolean get_CheckBox_Status(WebDriver driver, String locator) {
		return driver.findElement(By.xpath(locator)).isSelected();

	}

	public static Boolean is_CheckBox_Enabled(WebDriver driver, String locator) {
		return driver.findElement(By.xpath(locator)).isEnabled();

	}

	public static WebElement Check_RadioBtn_by_xpath(WebDriver driver,
			String locator) {
		return driver.findElement(By.xpath(locator));

	}

	public static WebElement getbtn_by_id(WebDriver driver, String locator) {
		return driver.findElement(By.id(locator));

	}

	public static WebElement getbtn_by_xpath(WebDriver driver, String locator) {
		return driver.findElement(By.xpath(locator));

	}

	public static WebElement getDropDown(WebDriver driver, String locator) {
		return driver.findElement(By.xpath(locator));

	}
	
}
