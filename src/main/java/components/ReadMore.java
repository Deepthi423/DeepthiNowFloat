package components;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cl.utils.ElementUtils;

public class ReadMore {
	By messageUs=By.xpath("//span[text()='Message Us']");
	By keyWordContact=By.xpath("//div[@class=\"keyword-contents\"]//a");
	
	public void clickOnMessageUs(WebDriver driver)throws Exception{
		ElementUtils.click(driver, messageUs);
	}
	
	public void displayKeywordContact(WebDriver driver)throws Exception{
		ElementUtils.dispalyValuesOfWebElements(driver, keyWordContact);
	}

}
