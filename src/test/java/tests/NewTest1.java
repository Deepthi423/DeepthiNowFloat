package tests;

import org.testng.annotations.Test;

import java.awt.Scrollbar;
//import java.awt.List;
import java.util.List;


import org.junit.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class NewTest1 extends BaseClass {
	
	By element=By.xpath("//*[@id=\"product-section\"]/div[1]/div[1]/div/ul/span/span/li/div/div/div[1]/div[2]");
 
	@Ignore
  public void addingToBasket() throws Exception {
	driver.findElement(By.xpath("//*[@id=\"slide-2-layer-3\"]/div[2]/a[1]")).click();
	new Select(driver.findElement(By.id("productCardSelect"))).selectByVisibleText("classic");
	act.moveToElement(driver.findElement(By.xpath("//*[@id=\"product-section\"]/div[1]/div[1]/div/ul/span/span/li/div/div/div[1]/div[2]"))).perform();
	//new Actions(driver).moveToElement((WebElement) element).perform();
	driver.findElement(By.xpath("//*[@id=\"product-section\"]/div[1]/div[1]/div/ul/span/span/li/div/div/div[1]/div[3]/a[2]/span")).click();
	Thread.sleep(5000);
  }
	@Test
	public void displayKeyWords() throws Exception{
		//List<WebElement> list=(List<WebElement>)
		driver.findElement(By.id("update")).click();
		driver.findElement(By.xpath("//*[@id=\"updates-page\"]/main/div[2]/div/div[1]/div/div/div[1]/article/div/div/span[2]/a/span")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)");
        Thread.sleep(5000);
		@SuppressWarnings("unchecked")
		List<WebElement> list=(List<WebElement>) driver.findElement(By.xpath("//div[@class=\"keyword-contents\"]/span"));
		for (WebElement option:list){
			System.out.println(option.getText());
		}
		//System.out.println(driver.findElement(By.xpath("/html/body/main/div[2]/div/div/div[2]/div/span[1]")).getText());
	}
}
