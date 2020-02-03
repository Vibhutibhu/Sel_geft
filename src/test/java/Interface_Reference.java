
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Interface_Reference {
	String browser = "Chrome";
	@Test	
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium driver\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.ie.driver","C:\\selenium driver\\IEDriverServer_x64_3.150.1\\IEDriver.exe");
				
	
	WebDriver driver=null;
	
	}
}
