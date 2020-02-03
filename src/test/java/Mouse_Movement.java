import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Mouse_Movement {
	@Test
	public void mouseDriver() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium driver\\chromedriver_win32\\chromedriver.exe");
	      WebDriver driver= new ChromeDriver();
	          
	       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	       driver.manage().window().maximize();
	       driver.get("http://demowebshop.tricentis.com/");
	       WebElement element = driver.findElement(By.xpath("//a[@href ='/computers']"));
	       WebElement subelement = driver.findElement(By.xpath("//a[@href ='/notebooks']"));
	       Actions a= new Actions(driver);
	       a.moveToElement(element).build().perform();
	       WebDriverWait wait =new WebDriverWait(driver,30);
	       wait.until(ExpectedConditions.visibilityOf(subelement));
	       a.moveToElement(subelement).click().build().perform();
	       Thread.sleep(5000);
	       System.out.println("URL ->"+driver.getCurrentUrl());
	       driver.close();
	}    

}
