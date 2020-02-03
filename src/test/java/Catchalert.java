import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Catchalert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium driver\\chromedriver_win32\\chromedriver.exe");
	      WebDriver driver= new ChromeDriver();
	      driver.manage().window().maximize();
          
	      //driver.findElement(By.xpath("//input[@name='val']"));
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	      driver.findElement(By.xpath("//*[input[@value='FIND Details']")).click();
	      Alert al= driver.switchTo().alert();
	      //((org.openqa.selenium.Alert) al).accept();
	      //driver.switchTo().defaultContent();
	      //driver.findElement(By.name("FIND DETAILS"));

	
	}

}
