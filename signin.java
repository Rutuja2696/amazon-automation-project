package projectfiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class signin {
  WebDriver driver=new ChromeDriver();
  @Test
  public void setup() 
  {
	  driver.get("https://www.amazon.in/"); 
  }
  @Test
  public void login()
  {
	  Actions acc=new Actions(driver);
	  WebElement Hello=driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
	  WebElement sign=driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]"));
	  acc.moveToElement(Hello);
	  acc.moveToElement(sign).click().build().perform();
	  driver.switchTo().frame("https://www.amazon.in/ap/signin");
  }
}
