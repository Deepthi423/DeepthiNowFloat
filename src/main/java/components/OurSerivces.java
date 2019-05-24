package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cl.utils.ElementUtils;

public class OurSerivces {
	
	By categories=By.id("productCardSelect");
	By firstElement=By.xpath("(//div[@class=\"overlay-layer\"])[1]");
	By catgeroryTags=By.xpath("//ul[@class=\"category-tag\"]//a");
	By addToCart=By.xpath("//i[@class=\"fa fa-plus-circle\"]");
	By buyNow=By.xpath("//a[@title=\"Buy Now\"]");
	By first_Element_Details=By.xpath("(//span[@class=\"cta-btn-secondary product-btn\"])[1]");
	
	public void selectCategories(WebDriver driver)throws Exception{
		ElementUtils.selectValuefromDropdown(driver, categories, "classic");
	}
	public void clickOnAddToCart(WebDriver driver)throws Exception{
		ElementUtils.mouseOverOnElement(driver, firstElement);
		ElementUtils.click(driver, addToCart);
	}

}
