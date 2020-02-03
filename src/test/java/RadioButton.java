import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium driver\\chromedriver_win32\\chromedriver.exe");
	      WebDriver driver= new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
	      driver.get("https://tutorialehtml.com/en/html-tutorial-radio-buttons/");
	      List<WebElement> allradioButtons =driver.findElements(By.name("citizenship"));
	      
	      System.out.println("Total radio buttons in group citezenship ->"+allradioButtons.size());
	      allradioButtons.get(0).click();
	      System.out.println(allradioButtons.get(0).getAttribute("selected"));
	      System.out.println(allradioButtons.get(1).getAttribute("selected"));

	}

}
