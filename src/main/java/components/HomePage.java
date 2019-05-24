package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cl.utils.ElementUtils;

public class HomePage {
	
	By home=By.id("home");
	By ourService=By.xpath("(//a[@class=\"cta-btn-primary banner-btn\"])[1]");
	By messageUs=By.xpath("(//a[text()='Message Us'])[1]");
	By updates=By.xpath("//a[text()='Updates']");
	By gallery=By.xpath("//a[text()='Gallery']");
	By more=By.xpath("(//a[@class=\"dropdown-toggle\"])[5]");
	By contact=By.xpath("//a[text()='Contact']");
	By shoppingCart=By.id("language");
	
	public void selectHome(WebDriver driver) throws Exception{
		ElementUtils.click(driver, home);
	}
	
	public void clickOnOurServices(WebDriver driver)throws Exception{
		ElementUtils.click(driver, ourService);
	}
	
	public void clickOnUpdates(WebDriver driver)throws Exception{
		ElementUtils.click(driver, updates);
	}
	
	public void clickOnGallery(WebDriver driver)throws Exception{
		ElementUtils.click(driver, gallery);
	}
	
	public void clickOnMore(WebDriver driver)throws Exception{
		ElementUtils.click(driver, more);
	}
	
	public void clickOnContact(WebDriver driver)throws Exception{
		ElementUtils.click(driver, contact);
	}
	
	public void clickOnShoppingCart(WebDriver driver)throws Exception{
		ElementUtils.click(driver, shoppingCart);
	}

}
