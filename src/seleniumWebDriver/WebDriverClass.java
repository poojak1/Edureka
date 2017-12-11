package co.sigmacare.selenium.webdriver.basic;
package seleniumWebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class WebDriverClass {
	
	public class WebDriverClass 
	{
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.gecko.driver", "files/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.getTitle();
	driver.navigate().to(“https://www.edureka.co/testing-with-selenium-webdriver”);
	 
	driver.navigate().back();
	driver.navigate().refresh();
	driver.wait(5000);
	// or use
	// Thread.sleep(5000);
	 
	driver.findElement(By.name("email")).sendKeys("xxx@gmail.com");
	driver.findElement(By.name("pass")).sendKeys("xxxxxx");
	driver.findElement(By.id("u_0_q")).click();
	 
	driver.quit();
	}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
