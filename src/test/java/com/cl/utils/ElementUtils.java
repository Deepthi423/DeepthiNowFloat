package com.cl.utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ElementUtils {
	
	public static void click(WebDriver driver,By locator) throws Exception{
		findObject(driver, locator).click();
	}
	
	public static void enterText(WebDriver driver,By locator,String value) throws Exception{
		findObject(driver, locator).sendKeys(value);
	}
	public static void selectValuefromDropdown(WebDriver driver,By locator,String value) throws Exception{
		new Select(findObject(driver, locator)).selectByVisibleText(value);
	}
	
	public static void mouseOverOnElement(WebDriver driver,By locator)throws Exception{
		new Actions(driver).moveToElement(findObject(driver, locator)).perform();
	}
	
	public static void dispalyValuesOfWebElements(WebDriver driver,By locator)throws Exception{
		List<WebElement> list=driver.findElements(locator);
		for(WebElement option:list)
		{
			System.out.println(option.getText());
		}
	}
	
	private static  WebElement findObject(WebDriver driver, By locator) throws Exception {
		WebElement ele = null;
		for (int i = 0; i < 10; i++) {
			try {
				ele = driver.findElement(locator);
				break;
			} catch (Exception e) {
				Thread.sleep(500);
			}
		}
		return ele;
	}
}
