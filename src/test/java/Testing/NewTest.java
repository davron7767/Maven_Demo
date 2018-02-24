package Testing;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;


public class NewTest {
	
	WebDriver driver;
	
  @Test
  public void f() {
	  	WebElement search_box = driver.findElement(By.name("q"));
		search_box.sendKeys("Porsche" + Keys.ENTER);
		Assert.assertTrue(driver.getTitle().contains("Porsche"));
  }
  @BeforeTest
  public void beforeTest() {
	  	
	  	WebDriverManager.chromedriver().setup();
	  	WebDriverManager.firefoxdriver().setup();
	  	driver = new ChromeDriver();
	  	driver.get("http://google.com");
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  	driver.quit();
  }

}
