import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownCount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium driver\\chromedriver_win32\\chromedriver.exe");
	      WebDriver driver= new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
	      //driver.get("http://demoaut.com");
	      //driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")).sendKeys("remi");
	      //driver.findElement(By.xpath("//td/input[@name='password']")).sendKeys("remi");
	     //driver.findElement(By.xpath("//td/div/input[@name='login']")).click();
	      driver.get("http://demowebshop.tricentis.com/");
	      driver.findElement(By.xpath("//a[@href='/books']")).click();
	      Thread.sleep(2000);
	     WebElement dropdown=driver.findElement(By.xpath("//*[@id 'products-orderby']"));
	     Select s=new Select(dropdown);
	     s.selectByIndex(0);
	     //s.selectByVisibleText(text);
	     //s.selectByValue(value);
	     //2. count the total items
	     List<WebElement> options=s.getOptions();
	     System.out.println("Total elements in the dropdown ->"+options.size());
	     for(WebElement e:options)
	     {
	      System.out.println(e.getText());
	     }
	     System.out.println("Currently selected city ->"+s.getFirstSelectedOption().getText());
	     
	     
	}

}
