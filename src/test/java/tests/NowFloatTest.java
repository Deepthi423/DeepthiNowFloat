package tests;

import org.testng.annotations.Test;

public class NowFloatTest extends BaseClass {
	
  @Test
  public void addingToBasket() throws Exception {
	  homePage.clickOnOurServices(driver);
	  serivcesPage.selectCategories(driver);
	  serivcesPage.clickOnAddToCart(driver);
	  Thread.sleep(5000);
  }
  @Test
  public void displayKeyWordContents()throws Exception{
	  homePage.clickOnUpdates(driver);
	  updatesPage.clickOnFirstElementReadMore(driver);
	  readMorePage.displayKeywordContact(driver);
  }
}
