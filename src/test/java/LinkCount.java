import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium driver\\chromedriver_win32\\chromedriver.exe");
	      WebDriver driver= new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("http://demoaut.com");
	      List<WebElement> linkNames = driver.findElements(By.tagName("a"));
	      System.out.println("Total No of links"+linkNames.size());
	      for(int i=0;i<linkNames.size();i++)
	      {
	    	  System.out.println(linkNames.get(i).getText());
	    	  System.out.println(linkNames.get(i).getText());
	      }
	      
	      driver.findElement(By.linkText("Hotels")).click();
	      String currentUrl=driver.getCurrentUrl();
	      System.out.println("Current URL"+currentUrl);
	      

	}

}
