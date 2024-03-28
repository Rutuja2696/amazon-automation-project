package projectfiles;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Searchproduct {
	  WebDriver driver=new ChromeDriver();
	  @Test
	  public void setup() 
	  {
		 
		  driver.get("https://www.amazon.in/"); 
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Apple mobiles");
		  driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		  driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a")).click();
		  driver.findElement(By.cssSelector("#add-to-cart-button")).click();
		
	  }
	   
}
