import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_Handling {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium driver\\chromedriver_win32\\chromedriver.exe");
	      WebDriver driver= new ChromeDriver();
	          
	       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	       driver.manage().window().maximize();
	       Set<String> winIds =driver.getWindowHandles();
	       System.out.println("Total_Windows ="+winIds.size());
	       Iterator<String> it = winIds.iterator();
	       System.out.println("Windows Id ->"+it.next());
	       driver.get("https://naukri.com/");
	       Thread.sleep(2000);
	       System.out.println("..................................................");
	       winIds = driver.getWindowHandles();
	       System.out.println("Total Windows ->"+winIds.size());
           it =winIds.iterator();
           String mainwindowID=it.next();
           String firstpopupID=it.next();
           String secondpopupID=it.next();
           System.out.println(mainwindowID);
           System.out.println(firstpopupID);
           System.out.println(secondpopupID);
           driver.switchTo().window(firstpopupID);
           driver.close();
           driver.switchTo().window(secondpopupID);
           driver.close();
           driver.switchTo().window(mainwindowID);
           driver.close();
	}

}
