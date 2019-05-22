package tests;

//import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class BaseClass {
	public WebDriver driver;
	Actions act;
	
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Deepthi\\Java_Practice1\\ClientNowFloats\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://hunttosurvive.nowfloats.com/");
		driver.manage().window().maximize();
		act=new Actions(driver);
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
