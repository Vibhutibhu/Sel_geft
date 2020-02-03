import org.openqa.selenium.chrome.ChromeDriver;

public class Mysscond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\selenium driver\\chromedriver_win32\\chromedriver.exe");
				ChromeDriver c=new ChromeDriver();
				c.get("https://www.google.com/");
	}

}
