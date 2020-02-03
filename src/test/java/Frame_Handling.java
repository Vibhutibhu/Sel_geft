import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Handling {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium driver\\chromedriver_win32\\chromedriver.exe");
	      WebDriver driver= new ChromeDriver();
	          
	       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	       driver.manage().window().maximize();
	       driver.get("https://paytm.com/");
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//div[@class='_1Vt1']/div")).click();
	       Thread.sleep(5000);
	        int totalframes =driver.findElements(By.tagName("iframe")).size();
	        System.out.println("Total Frames -> "+totalframes);
	        for(int i=0;i<totalframes;i++)
	        {
	        	driver.switchTo().frame(i);
	        	int s= driver.findElements(By.xpath("//*[@id=\"wallet-container-new qr-bg-white\"]/qr-code-login/div[2]/div[2]/div[3]/span")).size();
	        	System.out.println("Size ="+s);
	        	//*[@id="wallet-container-new qr-bg-white"]/qr-code-login/div[2]/div[2]/div[3]/span
	        
	        if(s==0)
	        {
	         driver.switchTo().defaultContent();	
	        }
	        else
	        	break;
	        }
	        driver.findElement(By.xpath("//*[@id=\"wallet-container-new qr-bg-white\"]/qr-code-login/div[2]/div[2]/div[3]/span")).click();
	        driver.findElement(By.xpath("//*[@id=\"input_0\"]")).sendKeys("9665519745");
	        driver.switchTo().defaultContent();
	        

	}

}
