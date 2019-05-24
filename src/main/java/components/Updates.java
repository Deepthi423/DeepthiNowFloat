package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cl.utils.ElementUtils;

public class Updates {
	
	By first_Element_Readmore=By.xpath("(//span[text()='read more'])[1]");
	By nextPage=By.xpath("//a[text()='Next Page']");
	
	public void clickOnFirstElementReadMore(WebDriver driver)throws Exception{
		ElementUtils.click(driver, first_Element_Readmore);
	}
	
	public void clickOnNextPage(WebDriver driver)throws Exception{
		ElementUtils.click(driver, nextPage);
	}
	

}
