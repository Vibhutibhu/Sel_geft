import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium driver\\chromedriver_win32\\chromedriver.exe");
	      WebDriver driver= new ChromeDriver();
	           
	       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	       driver.manage().window().maximize();
	       driver.get("https://portfolio.rediff.com/portfolio-login/");
	       driver.findElement(By.id("useremail")).sendKeys("david");
	       driver.findElement(By.id("emailsubmit")).click();
	       WebDriverWait wait =new WebDriverWait(driver,30);
	       wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("userpass"))));
	       driver.findElement(By.id("userpass")).sendKeys("1234567890");
	       //driver.navigate().to("https://portfolio.rediff.com/portfolio-login/");
	       

	}

}
